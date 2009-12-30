/*
 * Created on May 16, 2004
 */
package test1;

/**
 * @author maheshexp
 */
// Rubber2.java basic rubber band for shape
//				   Draw rectangle. left mouse down=first point
//				   Drag to second point. left mouse up=final point
//				   right mouse changes color of first figure area
//				   show grid and snap to grid
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Rubber2 extends Frame {
	int winWidth = 500;
	int winHeight = 500;
	boolean tracking = false; // left button down, sense motion
	int startX = 0;
	int startY = 0;
	int currentX = 0;
	int currentY = 0;
	int num_fig = 0; // number of figures to draw
	int select = 0; // the currently selected figure index
	boolean grid = true; // display grid points
	boolean snap = true; // snap mouse press/release/motion to grid
	int gridSize = 25;
	Fig figure[] = new Fig[100]; // num_fig is number of figures to display

	Rubber2() {
		setTitle("Rubber2");
		setSize(winWidth, winHeight);
		setBackground(Color.white);
		setForeground(Color.black);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setVisible(true);
		this.addMouseListener(new mousePressHandler());
		this.addMouseListener(new mouseReleaseHandler());
		this.addMouseMotionListener(new mouseMotionHandler());
	}

	class Fig // just partial structure, may add more
	{
		int kind; // kind of fig
		int x0, y0, x1, y1; // rectangle boundary
		double r, g, b; // color values
		double width;

		Fig() {
			kind = 0;
			x0 = 0;
			y0 = 0;
			x1 = 0;
			y1 = 0;
			r = 0.0;
			g = 0.0;
			b = 0.0;
			width = 0.0;
		}
	}

	void snapxy(int x[], int y[]) // like swap, use single element array
	{
		int xg, yg;

		xg = (x[0] + gridSize / 2) / gridSize;
		yg = (y[0] + gridSize / 2) / gridSize;
		x[0] = xg * gridSize;
		y[0] = yg * gridSize;
	}

	void mouseMotion(int x, int y) {
		if (tracking) {
			currentX = x;
			currentY = y;
			requestFocus();
			repaint();
		}
	}

	void startMotion(int x, int y) {
		tracking = true;
		startX = x;
		startY = y;
		currentX = x;
		currentY = y; // zero size, may choose to ignore later
		requestFocus();
		repaint();
	}

	void stopMotion(int x, int y) {
		tracking = false; // no more rubber_rect
		// save final figure data for 'display' to draw
		currentX = x;
		currentY = y;
		figure[num_fig] = new Fig();
		figure[num_fig].kind = 1; /* just rectangles here */
		figure[num_fig].x0 = startX;
		figure[num_fig].y0 = startY;
		figure[num_fig].x1 = currentX;
		figure[num_fig].y1 = currentY;
		figure[num_fig].r = 1.0;
		figure[num_fig].g = 0.0;
		figure[num_fig].b = 0.0;
		figure[num_fig].width = 2.0;
		num_fig++;
		requestFocus();
		repaint();
	}

	class mousePressHandler extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			int b;
			int xx[] = new int[1];
			int yy[] = new int[1];

			b = e.getButton();
			xx[0] = e.getX();
			yy[0] = e.getY();
			// System.out.println("press x="+xx[0]+" y="+yy[0]+
			//                    " b="+b); // debug print
			if (snap)
				snapxy(xx, yy);
			if (b == 1)
				startMotion(xx[0], yy[0]); // right mouse
			if (b == 3)
				pick(xx[0], yy[0]); // left mouse
		}
	}

	class mouseReleaseHandler extends MouseAdapter {
		public void mouseReleased(MouseEvent e) {
			int b;
			int xx[] = new int[1];
			int yy[] = new int[1];

			b = e.getButton();
			xx[0] = e.getX();
			yy[0] = e.getY();
			if (snap)
				snapxy(xx, yy);
			if (b == 1)
				stopMotion(xx[0], yy[0]);
		}
	}

	class mouseMotionHandler extends MouseMotionAdapter {
		public void mouseDragged(MouseEvent e) {
			int b;
			int xx[] = new int[1];
			int yy[] = new int[1];

			b = e.getButton();
			xx[0] = e.getX();
			yy[0] = e.getY();
			if (snap)
				snapxy(xx, yy);
			mouseMotion(xx[0], yy[0]);
		}
	}

	void rubberRect(Graphics g, int x0, int y0, int x1, int y1) {
		// can apply to all figures
		// draw a rubber rectangle, mouse down, tracks mouse
		int x, y, x2, y2, x3, y3; // local coordinates
		x2 = x0;
		x3 = x1;
		if (x1 < x0) {
			x2 = x1;
			x3 = x0;
		};
		y2 = y0;
		y3 = y1;
		if (y1 < y0) {
			y2 = y1;
			y3 = y0;
		};
		g.setColor(Color.black);
		for (x = x2; x < x3 - 3; x = x + 8) // Java does not seem to have a
		{ // dashed or stippled rectangle or line
			g.drawLine(x, y0, x + 4, y0);
			g.drawLine(x, y1, x + 4, y1);
		}
		for (y = y2; y < y3 - 3; y = y + 8) {
			g.drawLine(x0, y, x0, y + 4);
			g.drawLine(x1, y, x1, y + 4);
		}
	}

	void drawRect(Graphics g, Fig rect) {
		int x, y;

		g.setColor(new Color((float) rect.r, (float) rect.g, (float) rect.b));
		// g.setLineWidth(rect.width); ???
		x = rect.x0;
		if (rect.x1 < rect.x0)
			x = rect.x1;;
		y = rect.y0;
		if (rect.y1 < rect.y0)
			y = rect.y1;
		g.drawRect(x, y, Math.abs(rect.x1 - rect.x0), Math.abs(rect.y1
				- rect.y0));
		if (rect.width > 1.0)
			g.drawRect(x - 1, y - 1, Math.abs(rect.x1 - rect.x0) + 2, Math
					.abs(rect.y1 - rect.y0) + 2);
	}

	void pick(int x, int y) {
		int i;
		float t;

		// search figures in list, select
		for (i = 0; i < num_fig; i++) {
			if (figure[i].x0 < figure[i].x1)
				if (x < figure[i].x0 || x > figure[i].x1)
					continue;
			if (figure[i].x1 < figure[i].x0)
				if (x < figure[i].x1 || x > figure[i].x0)
					continue;
			if (figure[i].y0 < figure[i].y1)
				if (y < figure[i].y0 || y > figure[i].y1)
					continue;
			if (figure[i].y1 < figure[i].y0)
				if (y < figure[i].y1 || y > figure[i].y0)
					continue;
			// select here by just changing color
			figure[select].r = 1.0;
			figure[select].g = 0.0;
			select = i;
			figure[select].r = 0.0;
			figure[select].g = 1.0;
			break;
		}
		requestFocus();
		repaint();
	}

	public void paint(Graphics g) {
		if (tracking)
			rubberRect(g, startX, startY, currentX, currentY);
		// draw figures per list
		for (int i = 0; i < num_fig; i++) {
			/* should do switch on figure[i].kind */
			drawRect(g, figure[i]);
		}
		if (grid) {
			g.setColor(new Color(0.5F, 0.5F, 0.5F));
			for (int i = gridSize; i < winWidth; i = i + gridSize)
				for (int j = gridSize; j < winHeight; j = j + gridSize)
					g.fillOval(i, j, 1, 1);
		}
	}

	public static void main(String args[]) {
		new Rubber2();
	}
}
/*
 * Created on Jan 29, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package gui;

import java.awt.AWTEvent;
import java.awt.Toolkit;
import java.awt.event.AWTEventListener;

/**
 * @author Mahesh,Indu
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class Painter extends Thread {

	class PaintEvent implements AWTEventListener {
		public void eventDispatched(AWTEvent e) {
			MDIWindow.getDrawingPad().repaint();
		}
	}

	public void run() {
		
		Toolkit.getDefaultToolkit().addAWTEventListener(
				new PaintEvent(),
				AWTEvent.MOUSE_EVENT_MASK | AWTEvent.MOUSE_MOTION_EVENT_MASK
						| AWTEvent.INVOCATION_EVENT_MASK);
	}

}
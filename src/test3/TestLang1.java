/*
 * Created on Dec 16, 2004
 *
 */
package test3;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

/**
 * @author mahesh
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class TestLang1 extends JFrame {

	JRadioButton obj1;
	JTextArea obj2;
	JLabel obj3;
	JButton obj4;

	JMenu lang_menu;
	JMenuItem tamil;
	JMenuItem eng;
	JMenuBar bar;

	Container c;
	Properties p = new Properties();
	FileInputStream fin;

	public TestLang1() {
		super("Language TEst");
		c = this.getContentPane();

		init();
		initMenus();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 400);
		this.setVisible(true);
	}

	void init() {
		obj1 = new JRadioButton();
		obj2 = new JTextArea();
		obj3 = new JLabel();
		obj4 = new JButton();

		c.setLayout(new GridLayout(2, 2));
		c.add(obj1);
		c.add(obj2);
		c.add(obj3);
		c.add(obj4);
	}

	void initMenus() {
		String tamilCaption = "ос§Ы";
		tamil = new JMenuItem(tamilCaption);
		tamil.setFont(new Font("Vikatan_TAM", Font.PLAIN, 14));

		eng = new JMenuItem("English");

		lang_menu = new JMenu("Lanaguage");
		lang_menu.add(eng);
		lang_menu.add(tamil);

		bar = new JMenuBar();
		bar.add(lang_menu);

		this.setJMenuBar(bar);

		eng.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				changeLang("test1.xml", "Arial", 12);
			}
		});

		tamil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				changeLang("test2.xml", "Vikatan_TAM", 14);
			}
		});

	}

	void changeLang(String fname, String font, int size) {
		load(fname);
		changeFont(font, size);
		SwingUtilities.updateComponentTreeUI(this);

		obj1.setText(p.getProperty("already_connected"));
		obj2.setText(p.getProperty("fnot_found"));
		obj3.setText(p.getProperty("incorrect_ip"));
		obj4.setText(p.getProperty("stop_sim_edit"));
	}

	void changeFont(String fontName, int fontSize) {
		Enumeration e = UIManager.getDefaults().keys();
		FontUIResource f = new FontUIResource(fontName, Font.BOLD, fontSize);
		while (e.hasMoreElements()) {
			Object key = e.nextElement();
			Object value = UIManager.get(key);

			if (value instanceof FontUIResource) {
				UIManager.put(key, f);
			}
		}

	}

	void load(String fname) {
		try {
			fin = new FileInputStream(fname);
			p.loadFromXML(fin);
			//p.load(fin);
			//p.storeToXML(new FileOutputStream("test3.xml"),null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new TestLang1();
	}
}
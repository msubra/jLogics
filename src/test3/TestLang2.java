/*
 * Created on Dec 16, 2004
 *
 */
package test3;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

import util.GlobalUI;

/**
 * @author mahesh
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class TestLang2 extends JFrame {

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

	public TestLang2() {
		super("Language TEst");
		c = this.getContentPane();

		init();
		initMenus();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 400);
		this.setVisible(true);
	}

	void add(JComponent x, String label) {
		c.add(x);
		GlobalUI.add(x, label);
	}

	void init() {
		obj1 = new JRadioButton();
		obj2 = new JTextArea();
		obj3 = new JLabel();
		obj4 = new JButton();

		add(obj1, "already_connected");
		add(obj2, "fnot_found");
		add(obj3, "incorrect_ip");
		add(obj4, "stop_sim_edit");
		add(new JButton(), "stop_sim_edit");
		add(new JLabel(), "stop_sim_edit");

		c.setLayout(new GridLayout(2, 3));
	}

	void initMenus() {
		tamil = new JMenuItem("Tamil");
		eng = new JMenuItem("English");

		lang_menu = new JMenu("Lanaguage");
		lang_menu.add(eng);
		lang_menu.add(tamil);

		bar = new JMenuBar();
		bar.add(lang_menu);

		this.setJMenuBar(bar);

		eng.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				changeLang(GlobalUI.ENGLISH);
			}
		});

		tamil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				changeLang(GlobalUI.TAMIL);
			}
		});

		GlobalUI.add(tamil, "tamil");
		GlobalUI.add(eng, "english");
		GlobalUI.add(lang_menu, "language");
	}

	void changeLang(String langName) {
		GlobalUI.loadLanguage(langName, this);
		GlobalUI.update();
	}

	public static void main(String[] args) {
		new TestLang2();
	}
}
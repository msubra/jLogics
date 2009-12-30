/*
 * Created on May 5, 2004
 */
package toolbar;

import javax.swing.JComponent;
import javax.swing.JToolBar;

import util.GlobalUI;

/**
 * @author maheshexp
 */
public class JLogicsToolBar extends JToolBar {

	public JLogicsToolBar() {
		super();
		
		init();
	}

	private void init() {
		add(new NormalButton(), "normal");
		//add(new NewButton(), "new");
		add(new SimulateButton(this), "simulate");
		//add(new ModuleButton());
		add(new JToolBar.Separator());

		add(new AndButton(), "andgate");
		add(new OrButton(), "orgate");
		add(new NotButton(), "notgate");
		add(new NorButton(), "notgate");
		add(new NandButton(), "nandgate");
		add(new XorButton(), "xorgate");
		//this.add(new Flip1Button());
		add(new JToolBar.Separator());

		add(new DCButton());
		add(new ClockButton());
		add(new JToolBar.Separator());

		add(new LEDButton());
		add(new JToolBar.Separator());
	}

	void add(JComponent x, String label) {
		this.add(x);
		GlobalUI.add(x, label);
	}
}
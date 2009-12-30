/*
 * Created on May 13, 2004
 */
package gui;

import gates.Clock;
import gates.Gate;

import java.awt.GridLayout;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * @author maheshexp
 */
public class PropertiesWindow1 extends JInternalFrame {
	
	DigitalSpinner inputs, outputs, frequency;
	JLabel name;
	
	public PropertiesWindow1() {
		super("Properties",false,false,false,false);
		this.setSize(200, 150);
		
		inputs = new DigitalSpinner("input");
		outputs = new DigitalSpinner("output");
		frequency = new DigitalSpinner("frequency");
		
		JPanel panel = new JPanel(new GridLayout(5, 2));
		panel.add(new JLabel("Name:"));
		panel.add(name = new JLabel());
		
		panel.add(new JLabel("Inputs:"));
		panel.add(inputs);

		panel.add(new JLabel("Outputs:"));
		panel.add(outputs);

		panel.add(new JLabel("Pulse / Second:"));
		panel.add(frequency);
		
		this.setContentPane(panel);
	}
	
	public void update(Gate p) {
		inputs.update(p);
		outputs.update(p);
		frequency.update(p);
	}
	
}

class DigitalSpinner extends JSpinner implements ChangeListener{
	String name;
	Gate current;

	public DigitalSpinner(String name) {
		this.addChangeListener(this);
		this.name = name;
	}
	
	public void update(Gate g) {
		SpinnerNumberModel model = null;

		if(name.equalsIgnoreCase("input")) {
			model = new SpinnerNumberModel(g.getInputCount(),g.MIN_INPUTS, g.MAX_INPUTS, 1);
		}
		else if(name.equalsIgnoreCase("output")) {
			model = new SpinnerNumberModel(g.getInputCount(),g.MIN_OUTPUTS, g.MAX_OUTPUTS, 1);
		}
		else if(name.equalsIgnoreCase("frequency")) {
			model = new SpinnerNumberModel(10, 10E-5, 1E5, 10);
		}
		current = g;
		this.setModel(model);
	}

	/* (non-Javadoc)
	 * @see javax.swing.event.ChangeListener#stateChanged(javax.swing.event.ChangeEvent)
	 */
	public void stateChanged(ChangeEvent arg0) {
		if(name.equalsIgnoreCase("input")) {
			int value = ((Integer) this.getModel().getValue()).intValue();
			current.setInputCount(value);
		}
		else if(name.equalsIgnoreCase("output")) {
			int value = ((Integer) this.getModel().getValue()).intValue();
			current.setOutputCount(value);
		}
		else if(name.equalsIgnoreCase("frequency")) {
			double value = ((Double) this.getModel().getValue()).doubleValue();
			Clock c = (Clock)current;
			c.setFrequency(value);
		}
	}
}

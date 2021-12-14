/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameproject;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.Timer;
//inhritance
public class BlinkLabel extends JLabel implements ActionListener {
	private String text;
	private boolean textVisible;
	protected boolean isBlinking = true;
	protected Timer timer;
	
	public BlinkLabel(final String label) {
		super(label);
	   
		timer = new Timer(800, this);
		timer.start();
	 
	    }
	 
	 public void startBlinking() {
			timer.start();
		    }
	 
	 public void stopBlinking() {
			timer.stop();
			super.setVisible(true);
		    }

	 public void actionPerformed(final ActionEvent e) {
			this.textVisible = !this.textVisible;
			super.setVisible(textVisible);
		    }
}

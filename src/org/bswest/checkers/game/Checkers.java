package org.bswest.checkers.game;

import javax.swing.JFrame;

import org.bswest.checkers.util.Sizes;

public class Checkers extends JFrame{
	private GameManager gm;

	public Checkers(){
		super("Checkers");
		init();
	}
	
	private void init(){
		this.setSize(Sizes.DEFAULT);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		if(gm == null) {
			gm = new GameManager();
			this.add(gm);
			this.addKeyListener(gm);
			gm.start();
		}
	}
}

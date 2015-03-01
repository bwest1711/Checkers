package org.bswest.checkers.game;

import javax.swing.JFrame;

import org.bswest.checkers.util.Log;
import org.bswest.checkers.util.Sizes;

public class CheckersGame extends JFrame{
	private GameManager gm;

	public CheckersGame(){
		super("Checkers");
		init();
	}
	
	private void init(){
		this.setSize(Sizes.DEFAULT);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		try {
			gm = new GameManager();
			this.add(gm);
			this.addKeyListener(gm);
			gm.start();
		} catch(Exception e){
			Log.error("GameManager failed", e);
		}
	}
}

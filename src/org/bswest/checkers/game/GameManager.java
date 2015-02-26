package org.bswest.checkers.game;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import org.bswest.checkers.util.Colors;
import org.bswest.checkers.util.Sizes;

public class GameManager extends JPanel implements KeyListener{
	
	private GameStateManager gsm;
	
	public GameManager(){
		init();
	}
	
	private void init(){
		this.setSize(Sizes.DEFAULT);
		this.setBackground(Colors.BACKGROUND);
		
		if(gsm == null){
			gsm = new GameStateManager();
		}
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		switch(gsm.getCurrentState().getState()){
			case GameState.STATE_PLAYING:
				g.drawOval(100, 100, 10, 10);
				break;
			case GameState.STATE_PAUSED:
				g.drawOval(200, 200, 20, 20);
				break;
			case GameState.STATE_MENU:
				g.drawOval(300, 300, 30, 30);
				break;
			default:
				g.drawOval(123, 321, 12, 23);
				break;
		}
	}
	public void start(){
		gsm.getCurrentState().setState(GameState.STATE_MENU);
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		String state = gsm.getCurrentState().getState();
		
		/*
		 * First attempt at key input handling
		 * 
		 * switch on the char of the key press.
		 * might not work for multi key input.
		 * 
		 * once the key has been determined check for the current state of the game
		 * use this state to call the necessary methods for the input
		 */
		switch(e.getKeyChar()){
			case '1':
				if(state == GameState.STATE_MENU){
					gsm.getCurrentState().setState(GameState.STATE_PLAYING);
					repaint();
				} else if(state == GameState.STATE_PLAYING){
					gsm.getCurrentState().setState(GameState.STATE_PAUSED);
					repaint();
				} else if(state == GameState.STATE_PAUSED){
					gsm.getCurrentState().setState(GameState.STATE_MENU);
					repaint();
				}
				break;
			case '2':
				if(gsm.getCurrentState().getState() == GameState.STATE_MENU){
					gsm.getCurrentState().setState(GameState.STATE_PAUSED);
					repaint();
				}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}

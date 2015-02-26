package org.bswest.checkers.game;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameState implements KeyListener{
	public static final String STATE_PLAYING = "playing";
	public static final String STATE_PAUSED = "paused";
	public static final String STATE_MENU = "menu";
	
	public String state;
	
	public GameState(){
	}
	
	public String getState(){
		if(state == null){
			state = "";
		}
		
		return state;
	}
	
	public void setState(String state){
		this.state = state;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}

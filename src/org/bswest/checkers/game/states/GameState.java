package org.bswest.checkers.game.states;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameState{
	public static final String STATE_PLAYING = "playing";
	public static final String STATE_PAUSED = "paused";
	public static final String STATE_MENU = "menu";
	
	public String state;
	
	public GameState(){
	}
	
	protected String getState(){
		if(state == null){
			state = "";
		}
		
		return state;
	}
}

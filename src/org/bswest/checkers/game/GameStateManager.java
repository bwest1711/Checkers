package org.bswest.checkers.game;

import org.bswest.checkers.game.states.GameState;

public class GameStateManager {
	private GameState currentState;
	
	public GameStateManager(){
		init();
	}
	
	private void init(){
		if(currentState == null){
			currentState = new GameState();
		}
	}
	
	public GameState getCurrentState(){
		return currentState;
	}
	
	public void setCurrentState(GameState cs){
		this.currentState = cs;
	}
}

package org.bswest.checkers.game;

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
}

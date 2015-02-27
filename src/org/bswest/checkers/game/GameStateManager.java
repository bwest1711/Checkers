package org.bswest.checkers.game;

import org.bswest.checkers.game.states.GameState;
import org.bswest.checkers.game.states.MenuState;
import org.bswest.checkers.game.states.PauseState;
import org.bswest.checkers.game.states.PlayState;

public class GameStateManager {
	private GameState	currentState;
	private PlayState	playState;
	private MenuState	menuState;
	private PauseState	pauseState;

	public GameStateManager() {
		init();
	}

	private void init() {
		if (currentState == null) {
			currentState = new GameState();
		}
	}

	public GameState getCurrentState() {
		return currentState;
	}

	public void setCurrentState(GameState cs) {
		this.currentState = cs;
	}

	public GameState getPlayState() {
		if (playState == null) {
			playState = new PlayState();
		}

		return playState;
	}

	public GameState getMenuState() {
		if (menuState == null) {
			menuState = new MenuState();
		}
		return menuState;
	}

	public GameState getPausedState() {
		if (pauseState == null) {
			pauseState = new PauseState();
		}
		return pauseState;
	}
}

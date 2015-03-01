package org.bswest.checkers.game.states;

import java.awt.Graphics;
import java.awt.event.KeyEvent;

import org.bswest.checkers.game.model.Game;
import org.bswest.checkers.util.Log;

public class PlayState extends GameState {
	private Game	game;

	public PlayState() {
		super();
		init();
	}

	private void init() {
		game = new Game();
	}

	public String getState() {
		return GameState.STATE_PLAYING;
	}

	public void paint(Graphics g) {
		game.paint(g);
	}

	public void keyPressed(KeyEvent e) {
		super.keyPressed(e);
	}
}

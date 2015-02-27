package org.bswest.checkers.game.states;

import java.awt.Graphics;
import java.awt.event.KeyEvent;

import org.bswest.checkers.util.Log;

public class PlayState extends GameState {
	public PlayState() {
		super();
	}

	public String getState() {
		return GameState.STATE_PLAYING;
	}

	public void paint(Graphics g) {
		g.drawOval(100, 100, 10, 10);
	}

	public void keyPressed(KeyEvent e) {
		super.keyPressed(e);
	}
}

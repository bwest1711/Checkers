package org.bswest.checkers.game.states;

import java.awt.Graphics;

public class PauseState extends GameState {
	public PauseState() {

	}

	public String getState() {
		return GameState.STATE_PAUSED;
	}

	public void paint(Graphics g) {
		g.drawOval(200, 200, 20, 20);
	}
}

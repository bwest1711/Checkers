package org.bswest.checkers.game.states;

import java.awt.Graphics;

public class MenuState extends GameState {
	public MenuState() {
		super();
	}

	public String getState() {
		return GameState.STATE_MENU;
	}

	public void paint(Graphics g) {
		g.drawOval(300, 300, 30, 30);
	}
}

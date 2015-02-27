package org.bswest.checkers.game.states;

import java.awt.Graphics;
import java.awt.event.KeyEvent;

import org.bswest.checkers.util.Log;

public class GameState {
	public static final String	STATE_PLAYING	= "playing";
	public static final String	STATE_PAUSED	= "paused";
	public static final String	STATE_MENU		= "menu";

	public String				state;

	public GameState() {
	}

	public String getState() {
		if (state == null) {
			state = "";
		}

		return state;
	}

	public void paint(Graphics g) {
	}

	public void keyPressed(KeyEvent e) {
		Log.log(e.getKeyChar());
	}
}

package org.bswest.checkers.game.states;

import java.awt.Graphics;
import java.util.ArrayList;

public class MenuState extends GameState {
	private ArrayList<String>	menuOptions;
	private final int MENU_X = 100;
	private final int MENU_INC = 20;
	// Not final so that it can be incremented for each option
	private int MENU_Y = 80; 

	public MenuState() {
		super();
	}

	public String getState() {
		return GameState.STATE_MENU;
	}

	public void paint(Graphics g) {
		g.drawOval(300, 300, 30, 30);
		drawMenu(g);
	}

	private void drawMenu(Graphics g) {
		for (String s : getMenuOptions()) {
			g.drawString(s, MENU_X, MENU_Y += MENU_INC);
		}
	}

	public ArrayList<String> getMenuOptions() {
		if (menuOptions == null) {
			menuOptions = new ArrayList<String>();
		}

		return menuOptions;
	}
}

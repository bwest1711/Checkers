package org.bswest.checkers.game.model;

import java.awt.Graphics;
import java.util.ArrayList;

import org.bswest.checkers.util.Colors;

public class Player {
	private ArrayList<Checker>	checkers;

	public Player() {
		init();
	}

	private void init() {
		checkers = new ArrayList<Checker>();
		for (int i = 0; i < Board.HEIGHT; i++) {
			for (int j = 0; j < Board.WIDTH; j++) {
				if (j > 4 && ((j % 2 == 0) && (i % 2 == 1) || (j % 2 == 1) && (i % 2 == 0))) {
					checkers.add(new Checker(Colors.CHECKER_WHITE, i, j, false));
				}
			}
		}
	}

	public void paint(Graphics g) {
		for (Checker c : checkers) {
			c.paint(g);
		}
	}
}

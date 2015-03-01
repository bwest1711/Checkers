package org.bswest.checkers.game.model;

import java.awt.Graphics;

import org.bswest.checkers.util.Colors;

public class Board {
	public static final int		WIDTH	= 8, HEIGHT = 8;
	private final Square[][]	board	= new Square[WIDTH][HEIGHT];

	public Board() {
		init();
	}

	private void init() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if ((i % 2 == 0 && j % 2 == 0) || (i % 2 == 1 && j % 2 == 1)) {
					board[i][j] = new Square(i, j, Colors.SQUARE_RED, false);
				} else {
					board[i][j] = new Square(i, j, Colors.SQUARE_BLACK, false);
				}
			}
		}
	}

	public void paint(Graphics g) {
		for (Square[] sArray : board) {
			for (Square s : sArray) {
				g.setColor(s.getColor());
				g.fillRect(s.getX(), s.getY(), Square.WIDTH, Square.HEIGHT);
			}
		}
	}
}

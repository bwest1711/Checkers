package org.bswest.checkers.game.model;

import java.awt.Graphics;

public class Game {
	private Board	board;
	private Player	player;
	private Player	comp;

	public Game() {
		init();
	}

	private void init() {
		board = new Board();
		player = new Player();
		comp = new Player();
	}
	
	public void paint(Graphics g){
		board.paint(g);
		player.paint(g);
		// comp.paint(g);
	}
}

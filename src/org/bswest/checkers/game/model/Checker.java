package org.bswest.checkers.game.model;

import java.awt.Color;
import java.awt.Graphics;

public class Checker {
	public static final int	HEIGHT	= 30;
	public static final int	WIDTH	= 30;
	private final Color	color;

	private int			xPos, yPos;
	private int			xBoard, yBoard;

	private boolean		isKinged;

	public Checker(Color color, int xBoard, int yBoard, boolean isKinged) {
		this.color = color;
		this.xBoard = xBoard;
		this.yBoard = yBoard;
		this.isKinged = isKinged;

		this.xPos = Square.START_X + xBoard * Square.HEIGHT + (Square.HEIGHT - Checker.HEIGHT) / 2;
		this.yPos = Square.START_Y + yBoard * Square.WIDTH + (Square.WIDTH - Checker.WIDTH) / 2;
	}

	
	public void paint(Graphics g){
		g.setColor(color);
		g.fillOval(xPos, yPos, WIDTH, HEIGHT);
	}
}

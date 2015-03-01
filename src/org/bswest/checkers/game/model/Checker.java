package org.bswest.checkers.game.model;

import java.awt.Color;

public class Checker {
	private final int	HEIGHT	= 10;
	private final int	WIDTH	= 10;
	private final Color	color;

	private int			xPos, yPos;
	private int			xBoard, yBoard;

	private boolean		isKinged;

	public Checker(Color color, int xPos, int yPos, int xBoard, int yBoard, boolean isKinged) {
		this.color = color;
		this.xPos = xPos;
		this.yPos = yPos;
		this.xBoard = xBoard;
		this.yBoard = yBoard;
		this.isKinged = isKinged;
	}

}

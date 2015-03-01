package org.bswest.checkers.game.model;

import java.awt.Color;

public class Square {
	public static final int	WIDTH = 40, HEIGHT = 40;
	public static final int START_X = 40, START_Y = 40;
	private final int		x, y;
	private final int		xPos, yPos;
	private Color			color;
	private boolean			hasChecker;

	public Square(int x, int y, Color color, boolean hasChecker) {
		this.x = x;
		this.y = y;
		this.color = color;
		this.hasChecker = hasChecker;
		xPos = START_X + WIDTH * x;
		yPos = START_Y + HEIGHT * y;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public boolean isHasChecker() {
		return hasChecker;
	}

	public void setHasChecker(boolean hasChecker) {
		this.hasChecker = hasChecker;
	}

	public int getBoardX() {
		return x;
	}

	public int getBoardY() {
		return y;
	}

	public int getX() {
		return xPos;
	}

	public int getY() {
		return yPos;
	}
}

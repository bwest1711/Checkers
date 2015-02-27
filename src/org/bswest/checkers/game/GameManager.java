package org.bswest.checkers.game;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import org.bswest.checkers.game.states.GameState;
import org.bswest.checkers.game.states.MenuState;
import org.bswest.checkers.game.states.PlayState;
import org.bswest.checkers.util.Colors;
import org.bswest.checkers.util.Log;
import org.bswest.checkers.util.Sizes;

public class GameManager extends JPanel implements KeyListener {

	private GameStateManager	gsm;

	public GameManager() {
		init();
	}

	private void init() {
		this.setSize(Sizes.DEFAULT);
		this.setBackground(Colors.BACKGROUND);

		if (gsm == null) {
			gsm = new GameStateManager();
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		gsm.getCurrentState().paint(g);
	}

	public void start() {
		gsm.setCurrentState(gsm.getMenuState());
		repaint();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		String state = gsm.getCurrentState().getState();

		gsm.getCurrentState().keyPressed(e);

		/*
		 * First attempt at key input handling
		 * 
		 * switch on the char of the key press.
		 * might not work for multi key input.
		 * 
		 * once the key has been determined check for the current state of the game
		 * use this state to call the necessary methods for the input
		 */
		Log.log(e.getKeyChar() + " " + state);
		switch (e.getKeyChar()) {
			case '1':
				if (state == GameState.STATE_MENU) {
					gsm.setCurrentState(gsm.getPlayState());
					repaint();
				} else if (state == GameState.STATE_PLAYING) {
					gsm.setCurrentState(gsm.getPausedState());
					repaint();
				} else if (state == GameState.STATE_PAUSED) {
					gsm.setCurrentState(gsm.getMenuState());
					repaint();
				}
				break;
			case '2':
				if (state == GameState.STATE_MENU) {
					gsm.setCurrentState(gsm.getPausedState());
					repaint();
				} else if (state == GameState.STATE_PLAYING) {
					gsm.setCurrentState(gsm.getMenuState());
					repaint();
				} else if (state == GameState.STATE_PAUSED) {
					gsm.setCurrentState(gsm.getPlayState());
					repaint();
				}
				break;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}
}

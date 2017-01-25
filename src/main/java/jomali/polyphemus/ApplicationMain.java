/*
 * POLYPHEMUS - A simple Java roguelike.
 * Copyright (c) 2014-2017, J. Francisco Martín <jfm.lisaso@gmail.com>.
 */
package jomali.polyphemus;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import jomali.polyphemus.screens.DummyScreen;
import jomali.polyphemus.screens.Screen;
import jomali.polyphemus.utils.SColor;
import jomali.polyphemus.utils.Terminal;

/**
 * 
 * @author J. Francisco Martín
 * @serial 2017/01/25
 *
 */
public class ApplicationMain extends JFrame implements KeyListener {
	private static final long serialVersionUID = -8917004607782274032L;

	// /////////////////////////////////////////////////////////////////////////

	public static final String TITLE = "Polyphemus";

	public static final String RELEASE = "0.0";

	public static final int SCREEN_WIDTH = 80; // def.: 80

	public static final int SCREEN_HEIGHT = 24; // def.: 24

	public static final Color FOREGROUND_COLOR = SColor.WHITE;

	public static final Color BACKGROUND_COLOR = SColor.BLACK;

	public static final Color EMPHASIS_COLOR = SColor.BLOOD;

	// /////////////////////////////////////////////////////////////////////////

	/** Terminal gráfica. */
	private Terminal terminal;

	/** Pantalla de juego activa. */
	private Screen screen;

	public ApplicationMain(String title) {
		super();

		terminal = new Terminal(SCREEN_WIDTH, SCREEN_HEIGHT, FOREGROUND_COLOR, BACKGROUND_COLOR);
		terminal.setEmphasisColor(EMPHASIS_COLOR);
		add(terminal);
		pack();
		screen = new DummyScreen();
		addKeyListener(this);
		repaint();

		Toolkit kit = Toolkit.getDefaultToolkit();
		int screenWidth = kit.getScreenSize().width;
		int screenHeight = kit.getScreenSize().height;
		setLocation(screenWidth / 2 - getSize().width / 2, screenHeight / 2 - getSize().height / 2);
		setResizable(false);
		setTitle(title);
	}
	
	public void repaint() {
		screen.displayOutput(terminal);
		super.repaint();
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	// /////////////////////////////////////////////////////////////////////////

	public static void main(String[] args) {
		ApplicationMain app = new ApplicationMain(TITLE + " v" + RELEASE);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
}

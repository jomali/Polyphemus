/*
 * POLYPHEMUS - A simple Java roguelike.
 * Copyright (c) 2014-2017, J. Francisco Martín <jfm.lisaso@gmail.com>.
 */
package jomali.polyphemus.utils;

import java.awt.Color;

/**
 * Implementación de <code>IRetroTerminal</code> que utiliza
 * <code>AsciiPanel</code> de Trystan Spangler.
 * 
 * 
 * @author J. Francisco Martín
 * @serial 2017/01/31
 * @version 1.0
 *
 */
public class AsciiPanelRetroTerminal extends AbstractRetroTerminal implements IRetroTerminal {

	@Override
	public int getGridWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getGridHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setForegroundColor(Color foregroundColor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBackgroundColor(Color backgroundColor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEmphasisColor(Color emphasisColor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Color getForegroundColor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Color getBackgroundColor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Color getEmphasisColor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal write(int x, int y, char character, Color foregroundColor, Color backgroundColor) {
		// TODO Auto-generated method stub
		return null;
	}

}

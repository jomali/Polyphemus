/*
 * POLYPHEMUS - A simple Java roguelike.
 * Copyright (c) 2014-2017, J. Francisco Martín <jfm.lisaso@gmail.com>.
 */
package jomali.polyphemus.utils;

import java.awt.Color;

/**
 * TODO - Documentar.
 * 
 * 
 * @author J. Francisco Martín
 * @serial 2017/01/31
 * @version 1.0
 *
 */
public abstract class AbstractRetroTerminal implements IRetroTerminal {
	
	private Color foregroundColor;
	
	private Color backgroundColor;
	
	private Color emphasisColor;

	/**
	 * @return the foregroundColor
	 */
	public Color getForegroundColor() {
		return foregroundColor;
	}

	/**
	 * @return the backgroundColor
	 */
	public Color getBackgroundColor() {
		return backgroundColor;
	}

	/**
	 * @return the emphasisColor
	 */
	public Color getEmphasisColor() {
		return emphasisColor;
	}

	/**
	 * @param foregroundColor the foregroundColor to set
	 */
	public void setForegroundColor(Color foregroundColor) {
		this.foregroundColor = foregroundColor;
	}

	/**
	 * @param backgroundColor the backgroundColor to set
	 */
	public void setBackgroundColor(Color backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	/**
	 * @param emphasisColor the emphasisColor to set
	 */
	public void setEmphasisColor(Color emphasisColor) {
		this.emphasisColor = emphasisColor;
	}
	
	@Override
	public abstract IRetroTerminal write(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor);

	@Override
	public IRetroTerminal write(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		return this.write(x, y, text, foregroundColor, backgroundColor, emphasisColor);
	}

	@Override
	public IRetroTerminal write(int x, int y, String text, Color foregroundColor) {
		return this.write(x, y, text, foregroundColor, backgroundColor, emphasisColor);
	}

	@Override
	public IRetroTerminal write(int x, int y, String text) {
		return this.write(x, y, text, foregroundColor, backgroundColor, emphasisColor);
	}

	@Override
	public IRetroTerminal writeTopLeft(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor) {
		return this.write(x, y, text, foregroundColor, backgroundColor, emphasisColor);
	}

	@Override
	public IRetroTerminal writeTopLeft(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		return this.write(x, y, text, foregroundColor, backgroundColor, emphasisColor);
	}

	@Override
	public IRetroTerminal writeTopLeft(int x, int y, String text, Color foregroundColor) {
		return this.write(x, y, text, foregroundColor, backgroundColor, emphasisColor);
	}

	@Override
	public IRetroTerminal writeTopLeft(int x, int y, String text) {
		return this.write(x, y, text, foregroundColor, backgroundColor, emphasisColor);
	}

	@Override
	public IRetroTerminal writeTL(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor) {
		return this.write(x, y, text, foregroundColor, backgroundColor, emphasisColor);
	}

	@Override
	public IRetroTerminal writeTL(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		return this.write(x, y, text, foregroundColor, backgroundColor, emphasisColor);
	}

	@Override
	public IRetroTerminal writeTL(int x, int y, String text, Color foregroundColor) {
		return this.write(x, y, text, foregroundColor, backgroundColor, emphasisColor);
	}

	@Override
	public IRetroTerminal writeTL(int x, int y, String text) {
		return this.write(x, y, text, foregroundColor, backgroundColor, emphasisColor);
	}

	@Override
	public abstract IRetroTerminal writeTopCenter(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor);
	}

	@Override
	public IRetroTerminal writeTopCenter(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		return this.writeTopCenter(x, y, text, foregroundColor, backgroundColor, emphasisColor);
	}

	@Override
	public IRetroTerminal writeTopCenter(int x, int y, String text, Color foregroundColor) {
		return this.writeTopCenter(x, y, text, foregroundColor, backgroundColor, emphasisColor);
	}

	@Override
	public IRetroTerminal writeTopCenter(int x, int y, String text) {
		return this.writeTopCenter(x, y, text, foregroundColor, backgroundColor, emphasisColor);
	}

	@Override
	public IRetroTerminal writeTC(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor) {
		return this.writeTopCenter(x, y, text, foregroundColor, backgroundColor, emphasisColor);
	}

	@Override
	public IRetroTerminal writeTC(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		return this.writeTopCenter(x, y, text, foregroundColor, backgroundColor, emphasisColor);
	}

	@Override
	public IRetroTerminal writeTC(int x, int y, String text, Color foregroundColor) {
		return this.writeTopCenter(x, y, text, foregroundColor, backgroundColor, emphasisColor);
	}

	@Override
	public IRetroTerminal writeTC(int x, int y, String text) {
		return this.writeTopCenter(x, y, text, foregroundColor, backgroundColor, emphasisColor);
	}

	@Override
	public abstract IRetroTerminal writeTopRight(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor);

	@Override
	public IRetroTerminal writeTopRight(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeTopRight(int x, int y, String text, Color foregroundColor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeTopRight(int x, int y, String text) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeTR(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeTR(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeTR(int x, int y, String text, Color foregroundColor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeTR(int x, int y, String text) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeMiddleLeft(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeMiddleLeft(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeMiddleLeft(int x, int y, String text, Color foregroundColor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeMiddleLeft(int x, int y, String text) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeML(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeML(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeML(int x, int y, String text, Color foregroundColor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeML(int x, int y, String text) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeMiddleCenter(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeMiddleCenter(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeMiddleCenter(int x, int y, String text, Color foregroundColor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeMiddleCenter(int x, int y, String text) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeMC(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeMC(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeMC(int x, int y, String text, Color foregroundColor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeMC(int x, int y, String text) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeMiddleRight(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeMiddleRight(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeMiddleRight(int x, int y, String text, Color foregroundColor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeMiddleRight(int x, int y, String text) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeMR(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeMR(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeMR(int x, int y, String text, Color foregroundColor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeMR(int x, int y, String text) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeBottomLeft(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeBottomLeft(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeBottomLeft(int x, int y, String text, Color foregroundColor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeBottomLeft(int x, int y, String text) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeBL(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeBL(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeBL(int x, int y, String text, Color foregroundColor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeBL(int x, int y, String text) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeBottomCenter(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeBottomCenter(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeBottomCenter(int x, int y, String text, Color foregroundColor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeBottomCenter(int x, int y, String text) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeBC(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeBC(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeBC(int x, int y, String text, Color foregroundColor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeBC(int x, int y, String text) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeBottomRight(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeBottomRight(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeBottomRight(int x, int y, String text, Color foregroundColor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeBottomRight(int x, int y, String text) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeBR(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeBR(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeBR(int x, int y, String text, Color foregroundColor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRetroTerminal writeBR(int x, int y, String text) {
		// TODO Auto-generated method stub
		return null;
	}

}

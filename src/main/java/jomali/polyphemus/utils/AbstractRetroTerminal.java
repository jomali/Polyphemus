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

	public static final char EMPHASIS_TAG1 = '*';
	public static final char EMPHASIS_TAG2 = '_';
	public static final int TOP_LEFT = 0;
	public static final int TOP_CENTER = 1;
	public static final int TOP_RIGHT = 2;
	public static final int MIDDLE_LEFT = 3;
	public static final int MIDDLE_CENTER = 4;
	public static final int MIDDLE_RIGHT = 5;
	public static final int BOTTOM_LEFT = 6;
	public static final int BOTTOM_CENTER = 7;
	public static final int BOTTOM_RIGHT = 8;

	// /////////////////////////////////////////////////////////////////////////
	// Métodos abstractos

	@Override
	public abstract Color getForegroundColor();

	@Override
	public abstract Color getBackgroundColor();

	@Override
	public abstract Color getEmphasisColor();

	public abstract IRetroTerminal write(int x, int y, char character, Color foregroundColor, Color backgroundColor);

	// /////////////////////////////////////////////////////////////////////////
	// Implementaciones

	private IRetroTerminal write(int alignment, int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor) {
		// TODO - Utilizar expresiones regulares para identificar las marcas de
		// estilo en la cadena de texto en lugar de búsqueda simple de
		// caracteres especiales (EMPHASIS_TAG1, EMPHASIS_TAG2)
		String formattedText = text;
		formattedText = formattedText.replaceAll("" + EMPHASIS_TAG1, "");
		formattedText = formattedText.replaceAll("" + EMPHASIS_TAG2, "");
		if (alignment == TOP_CENTER || alignment == MIDDLE_CENTER || alignment == BOTTOM_CENTER) {
			x = (getGridWidth() / 2) - (formattedText.length() / 2) + x;
		}
		if (alignment == TOP_RIGHT || alignment == MIDDLE_RIGHT || alignment == BOTTOM_RIGHT) {
			x = (getGridWidth() - 1) - (formattedText.length() - 1) - x;
		}
		if (alignment == MIDDLE_LEFT || alignment == MIDDLE_CENTER || alignment == MIDDLE_RIGHT) {
			y = (getGridHeight() / 2) + y;
		}
		if (alignment == BOTTOM_LEFT || alignment == BOTTOM_CENTER || alignment == BOTTOM_RIGHT) {
			y = (getGridHeight() - 1) - y;
		}
		boolean emphasis = false;
		Color color;
		for (int i = 0, iOriginal = 0; i < formattedText.length(); i++, iOriginal++) {
			if (text.charAt(iOriginal) == EMPHASIS_TAG1 || text.charAt(iOriginal) == EMPHASIS_TAG2) {
				emphasis = !emphasis;
				iOriginal++;
			}
			color = emphasis ? emphasisColor : foregroundColor;
			write(x + i, y, formattedText.charAt(i), color, backgroundColor);
		}
		return this;
	}

	@Override
	public IRetroTerminal write(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor) {
		return write(TOP_LEFT, x, y, text, foregroundColor, backgroundColor, emphasisColor);
	}

	@Override
	public IRetroTerminal write(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		return write(x, y, text, foregroundColor, backgroundColor, getEmphasisColor());
	}

	@Override
	public IRetroTerminal write(int x, int y, String text, Color foregroundColor) {
		return write(x, y, text, foregroundColor, getBackgroundColor(), getEmphasisColor());
	}

	@Override
	public IRetroTerminal write(int x, int y, String text) {
		return write(x, y, text, getForegroundColor(), getBackgroundColor(), getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeTopLeft(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor) {
		return write(x, y, text, foregroundColor, backgroundColor, emphasisColor);
	}

	@Override
	public IRetroTerminal writeTopLeft(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		return write(x, y, text, foregroundColor, backgroundColor, getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeTopLeft(int x, int y, String text, Color foregroundColor) {
		return write(x, y, text, foregroundColor, getBackgroundColor(), getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeTopLeft(int x, int y, String text) {
		return write(x, y, text, getForegroundColor(), getBackgroundColor(), getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeTL(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor) {
		return write(x, y, text, foregroundColor, backgroundColor, emphasisColor);
	}

	@Override
	public IRetroTerminal writeTL(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		return write(x, y, text, foregroundColor, backgroundColor, getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeTL(int x, int y, String text, Color foregroundColor) {
		return write(x, y, text, foregroundColor, getBackgroundColor(), getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeTL(int x, int y, String text) {
		return write(x, y, text, getForegroundColor(), getBackgroundColor(), getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeTopCenter(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor) {
		return write(TOP_CENTER, x, y, text, foregroundColor, backgroundColor, emphasisColor);
	}

	@Override
	public IRetroTerminal writeTopCenter(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		return writeTopCenter(x, y, text, foregroundColor, backgroundColor, getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeTopCenter(int x, int y, String text, Color foregroundColor) {
		return writeTopCenter(x, y, text, foregroundColor, getBackgroundColor(), getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeTopCenter(int x, int y, String text) {
		return writeTopCenter(x, y, text, getForegroundColor(), getBackgroundColor(), getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeTC(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor) {
		return writeTopCenter(x, y, text, foregroundColor, backgroundColor, emphasisColor);
	}

	@Override
	public IRetroTerminal writeTC(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		return writeTopCenter(x, y, text, foregroundColor, backgroundColor, getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeTC(int x, int y, String text, Color foregroundColor) {
		return writeTopCenter(x, y, text, foregroundColor, getBackgroundColor(), getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeTC(int x, int y, String text) {
		return writeTopCenter(x, y, text, getForegroundColor(), getBackgroundColor(), getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeTopRight(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor) {
		return write(TOP_RIGHT, x, y, text, foregroundColor, backgroundColor, emphasisColor);
	}

	@Override
	public IRetroTerminal writeTopRight(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		return writeTopRight(x, y, text, foregroundColor, backgroundColor, getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeTopRight(int x, int y, String text, Color foregroundColor) {
		return writeTopRight(x, y, text, foregroundColor, getBackgroundColor(), getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeTopRight(int x, int y, String text) {
		return writeTopRight(x, y, text, getForegroundColor(), getBackgroundColor(), getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeTR(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor) {
		return writeTopRight(x, y, text, foregroundColor, backgroundColor, emphasisColor);
	}

	@Override
	public IRetroTerminal writeTR(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		return writeTopRight(x, y, text, foregroundColor, backgroundColor, getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeTR(int x, int y, String text, Color foregroundColor) {
		return writeTopRight(x, y, text, foregroundColor, getBackgroundColor(), getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeTR(int x, int y, String text) {
		return writeTopRight(x, y, text, getForegroundColor(), getBackgroundColor(), getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeMiddleLeft(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor) {
		return write(MIDDLE_LEFT, x, y, text, foregroundColor, backgroundColor, emphasisColor);
	}

	@Override
	public IRetroTerminal writeMiddleLeft(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		return writeMiddleLeft(x, y, text, foregroundColor, backgroundColor, getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeMiddleLeft(int x, int y, String text, Color foregroundColor) {
		return writeMiddleLeft(x, y, text, foregroundColor, getBackgroundColor(), getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeMiddleLeft(int x, int y, String text) {
		return writeMiddleLeft(x, y, text, getForegroundColor(), getBackgroundColor(), getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeML(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor) {
		return writeMiddleLeft(x, y, text, foregroundColor, backgroundColor, emphasisColor);
	}

	@Override
	public IRetroTerminal writeML(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		return writeMiddleLeft(x, y, text, foregroundColor, backgroundColor, getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeML(int x, int y, String text, Color foregroundColor) {
		return writeMiddleLeft(x, y, text, foregroundColor, getBackgroundColor(), getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeML(int x, int y, String text) {
		return writeMiddleLeft(x, y, text, getForegroundColor(), getBackgroundColor(), getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeMiddleCenter(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor) {
		return write(MIDDLE_CENTER, x, y, text, foregroundColor, backgroundColor, emphasisColor);
	}

	@Override
	public IRetroTerminal writeMiddleCenter(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		return writeMiddleCenter(x, y, text, foregroundColor, backgroundColor, getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeMiddleCenter(int x, int y, String text, Color foregroundColor) {
		return writeMiddleCenter(x, y, text, foregroundColor, getBackgroundColor(), getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeMiddleCenter(int x, int y, String text) {
		return writeMiddleCenter(x, y, text, getForegroundColor(), getBackgroundColor(), getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeMC(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor) {
		return writeMiddleCenter(x, y, text, foregroundColor, backgroundColor, emphasisColor);
	}

	@Override
	public IRetroTerminal writeMC(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		return writeMiddleCenter(x, y, text, foregroundColor, backgroundColor, getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeMC(int x, int y, String text, Color foregroundColor) {
		return writeMiddleCenter(x, y, text, foregroundColor, getBackgroundColor(), getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeMC(int x, int y, String text) {
		return writeMiddleCenter(x, y, text, getForegroundColor(), getBackgroundColor(), getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeMiddleRight(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor) {
		return write(MIDDLE_RIGHT, x, y, text, foregroundColor, backgroundColor, emphasisColor);
	}

	@Override
	public IRetroTerminal writeMiddleRight(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		return writeMiddleRight(x, y, text, foregroundColor, backgroundColor, getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeMiddleRight(int x, int y, String text, Color foregroundColor) {
		return writeMiddleRight(x, y, text, foregroundColor, getBackgroundColor(), getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeMiddleRight(int x, int y, String text) {
		return writeMiddleRight(x, y, text, getForegroundColor(), getBackgroundColor(), getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeMR(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor) {
		return writeMiddleRight(x, y, text, foregroundColor, backgroundColor, emphasisColor);
	}

	@Override
	public IRetroTerminal writeMR(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		return writeMiddleRight(x, y, text, foregroundColor, backgroundColor, getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeMR(int x, int y, String text, Color foregroundColor) {
		return writeMiddleRight(x, y, text, foregroundColor, getBackgroundColor(), getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeMR(int x, int y, String text) {
		return writeMiddleRight(x, y, text, getForegroundColor(), getBackgroundColor(), getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeBottomLeft(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor) {
		return write(BOTTOM_LEFT, x, y, text, foregroundColor, backgroundColor, emphasisColor);
	}

	@Override
	public IRetroTerminal writeBottomLeft(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		return writeBottomLeft(x, y, text, foregroundColor, backgroundColor, getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeBottomLeft(int x, int y, String text, Color foregroundColor) {
		return writeBottomLeft(x, y, text, foregroundColor, getBackgroundColor(), getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeBottomLeft(int x, int y, String text) {
		return writeBottomLeft(x, y, text, getForegroundColor(), getBackgroundColor(), getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeBL(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor) {
		return writeBottomLeft(x, y, text, foregroundColor, backgroundColor, emphasisColor);
	}

	@Override
	public IRetroTerminal writeBL(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		return writeBottomLeft(x, y, text, foregroundColor, backgroundColor, getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeBL(int x, int y, String text, Color foregroundColor) {
		return writeBottomLeft(x, y, text, foregroundColor, getBackgroundColor(), getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeBL(int x, int y, String text) {
		return writeBottomLeft(x, y, text, getForegroundColor(), getBackgroundColor(), getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeBottomCenter(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor) {
		return write(BOTTOM_CENTER, x, y, text, foregroundColor, backgroundColor, emphasisColor);
	}

	@Override
	public IRetroTerminal writeBottomCenter(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		return writeBottomCenter(x, y, text, foregroundColor, backgroundColor, getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeBottomCenter(int x, int y, String text, Color foregroundColor) {
		return writeBottomCenter(x, y, text, foregroundColor, getBackgroundColor(), getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeBottomCenter(int x, int y, String text) {
		return writeBottomCenter(x, y, text, getForegroundColor(), getBackgroundColor(), getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeBC(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor) {
		return writeBottomCenter(x, y, text, foregroundColor, backgroundColor, emphasisColor);
	}

	@Override
	public IRetroTerminal writeBC(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		return writeBottomCenter(x, y, text, foregroundColor, backgroundColor, getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeBC(int x, int y, String text, Color foregroundColor) {
		return writeBottomCenter(x, y, text, foregroundColor, getBackgroundColor(), getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeBC(int x, int y, String text) {
		return writeBottomCenter(x, y, text, getForegroundColor(), getBackgroundColor(), getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeBottomRight(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor) {
		return write(BOTTOM_RIGHT, x, y, text, foregroundColor, backgroundColor, emphasisColor);
	}

	@Override
	public IRetroTerminal writeBottomRight(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		return writeBottomRight(x, y, text, foregroundColor, backgroundColor, getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeBottomRight(int x, int y, String text, Color foregroundColor) {
		return writeBottomRight(x, y, text, foregroundColor, getBackgroundColor(), getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeBottomRight(int x, int y, String text) {
		return writeBottomRight(x, y, text, getForegroundColor(), getBackgroundColor(), getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeBR(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor) {
		return writeBottomRight(x, y, text, foregroundColor, backgroundColor, emphasisColor);
	}

	@Override
	public IRetroTerminal writeBR(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		return writeBottomRight(x, y, text, foregroundColor, backgroundColor, getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeBR(int x, int y, String text, Color foregroundColor) {
		return writeBottomRight(x, y, text, foregroundColor, getBackgroundColor(), getEmphasisColor());
	}

	@Override
	public IRetroTerminal writeBR(int x, int y, String text) {
		return writeBottomRight(x, y, text, getForegroundColor(), getBackgroundColor(), getEmphasisColor());
	}

}

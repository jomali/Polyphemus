package jomali.polyphemus.utils;

import java.awt.Color;

/**
 * Implementación abstracta de la interfaz <strong>RetroTerminal</strong>.
 * Implementa un mecanismo de impresión de texto con estilo resaltado. Para
 * utilizar estilo resaltado en una cadena se utilizan delimitadores. Si se
 * especifica el caracter '*' como delimitador, utilizando el método
 * <code>setEmphasisDelimitator()</code>, el mensaje:
 * 
 * <code>"Esto es un *mensaje* de prueba."</code>
 * 
 * Se imprimiría utilizando los colores de frente y fondo por defecto para la
 * mayor parte de la cadena, pero todo aquello contenido entre los delimitadores
 * '*' (la palabra 'mensaje', en el ejemplo) se imprimiría utilizando los
 * colores de frente y fondo para estilo resaltado.
 * 
 * 
 * @author J. Francisco Martín
 * @serial 2017/01/31
 * @version 1.0
 *
 */
public abstract class AbstractRetroTerminal implements RetroTerminal {

	public static final int TOP_LEFT = 0;
	public static final int TOP_CENTER = 1;
	public static final int TOP_RIGHT = 2;
	public static final int MIDDLE_LEFT = 3;
	public static final int MIDDLE_CENTER = 4;
	public static final int MIDDLE_RIGHT = 5;
	public static final int BOTTOM_LEFT = 6;
	public static final int BOTTOM_CENTER = 7;
	public static final int BOTTOM_RIGHT = 8;

	/** Color utilizado para imprimir caracteres en estilo resaltado. */
	protected Color emphasisForegroundColor;

	/** Color utilizado para imprimir fondo en estilo resaltado. */
	protected Color emphasisBackgroundColor;

	// /////////////////////////////////////////////////////////////////////////

	@Override
	public abstract int getGridWidth();

	@Override
	public abstract int getGridHeight();

	@Override
	public abstract Color getForegroundColor();

	@Override
	public abstract Color getBackgroundColor();

	@Override
	public abstract void setForegroundColor(Color foregroundColor);

	@Override
	public abstract void setBackgroundColor(Color backgroundColor);

	/**
	 * Método encargado de imprimir un caracter en la terminal con la posición y
	 * los colores de frente y fondo indicados.
	 * 
	 * @param x
	 *            Coordenada en el eje X en que imprimir el caracter
	 * @param y
	 *            Coordenada en el eje Y en que imprimir el caracter
	 * @param character
	 *            Caracter a imprimir
	 * @param foregroundColor
	 *            Color utilizado para el caracter
	 * @param backgroundColor
	 *            Color utilizado para el fondo
	 * @return A sí mismo, para facilitar la encadenación de métodos
	 */
	public abstract RetroTerminal write(int x, int y, char character, Color foregroundColor, Color backgroundColor);

	// /////////////////////////////////////////////////////////////////////////

	public Color getEmphasisForegroundColor() {
		return emphasisForegroundColor != null ? emphasisForegroundColor : getForegroundColor();
	}

	public Color getEmphasisBackgroundColor() {
		return emphasisBackgroundColor != null ? emphasisBackgroundColor : getBackgroundColor();
	}

	public void setEmphasisForegroundColor(Color emphasisForegroundColor) {
		this.emphasisForegroundColor = emphasisForegroundColor;
	}

	public void setEmphasisBackgroundColor(Color emphasisBackgroundColor) {
		this.emphasisBackgroundColor = emphasisBackgroundColor;
	}

	/**
	 * Imprime una cadena de caracteres utilizando como punto de referencia
	 * dentro de la terminal las coordenadas y alineación dadas y los colores de
	 * frente y fondo indicados.
	 * 
	 * @param alignment
	 *            Código numérico con el que se representa la alineación con que
	 *            se imprime la cadena de caracteres
	 * @param x
	 *            Coordenada en el eje X del punto de referencia
	 * @param y
	 *            Coordenada en el eje Y del punto de referencia
	 * @param text
	 *            Cadena de caracteres a imprimir
	 * @param foregroundColor
	 *            Color utilizado para los caracteres
	 * @param backgroundColor
	 *            Color utilizado para el fondo
	 * @return A sí mismo, para facilitar la encadenación de métodos
	 */
	protected RetroTerminal write(int alignment, int x, int y, String text, Color foregroundColor,
			Color backgroundColor) {
		// Recalcula el pto. de referencia en el eje X en función de la
		// alineación
		if (alignment == TOP_CENTER || alignment == MIDDLE_CENTER || alignment == BOTTOM_CENTER) {
			x = (getGridWidth() / 2) - (text.length() / 2) + x;
		}
		if (alignment == TOP_RIGHT || alignment == MIDDLE_RIGHT || alignment == BOTTOM_RIGHT) {
			x = (getGridWidth() - 1) - (text.length() - 1) - x;
		}
		// Recalcula el pto. de referencia en el eje Y en función de la
		// alineación
		if (alignment == MIDDLE_LEFT || alignment == MIDDLE_CENTER || alignment == MIDDLE_RIGHT) {
			y = (getGridHeight() / 2) + y;
		}
		if (alignment == BOTTOM_LEFT || alignment == BOTTOM_CENTER || alignment == BOTTOM_RIGHT) {
			y = (getGridHeight() - 1) - y;
		}
		for (int i = 0; i < text.length(); i++) {
			write(x + i, y, text.charAt(i), foregroundColor, backgroundColor);
		}
		return this;
	}

	@Override
	public RetroTerminal write(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		return write(TOP_LEFT, x, y, text, foregroundColor, backgroundColor);
	}

	@Override
	public RetroTerminal write(int x, int y, String text, Color foregroundColor) {
		return write(TOP_LEFT, x, y, text, foregroundColor, getBackgroundColor());
	}

	@Override
	public RetroTerminal write(int x, int y, String text) {
		return write(TOP_LEFT, x, y, text, getForegroundColor(), getBackgroundColor());
	}

	@Override
	public RetroTerminal writeTopLeft(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		return write(TOP_LEFT, x, y, text, foregroundColor, backgroundColor);
	}

	@Override
	public RetroTerminal writeTopLeft(int x, int y, String text, Color foregroundColor) {
		return write(TOP_LEFT, x, y, text, foregroundColor, getBackgroundColor());
	}

	@Override
	public RetroTerminal writeTopLeft(int x, int y, String text) {
		return write(TOP_LEFT, x, y, text, getForegroundColor(), getBackgroundColor());
	}

	@Override
	public RetroTerminal writeTL(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		return write(TOP_LEFT, x, y, text, foregroundColor, backgroundColor);
	}

	@Override
	public RetroTerminal writeTL(int x, int y, String text, Color foregroundColor) {
		return write(TOP_LEFT, x, y, text, foregroundColor, getBackgroundColor());
	}

	@Override
	public RetroTerminal writeTL(int x, int y, String text) {
		return write(TOP_LEFT, x, y, text, getForegroundColor(), getBackgroundColor());
	}

	@Override
	public RetroTerminal writeTopCenter(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		return write(TOP_CENTER, x, y, text, foregroundColor, backgroundColor);
	}

	@Override
	public RetroTerminal writeTopCenter(int x, int y, String text, Color foregroundColor) {
		return this.write(TOP_CENTER, x, y, text, foregroundColor, getBackgroundColor());
	}

	@Override
	public RetroTerminal writeTopCenter(int x, int y, String text) {
		return write(TOP_CENTER, x, y, text, getForegroundColor(), getBackgroundColor());
	}

	@Override
	public RetroTerminal writeTC(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		return write(TOP_CENTER, x, y, text, foregroundColor, backgroundColor);
	}

	@Override
	public RetroTerminal writeTC(int x, int y, String text, Color foregroundColor) {
		return write(TOP_CENTER, x, y, text, foregroundColor, getBackgroundColor());
	}

	@Override
	public RetroTerminal writeTC(int x, int y, String text) {
		return write(TOP_CENTER, x, y, text, getForegroundColor(), getBackgroundColor());
	}

	@Override
	public RetroTerminal writeTopRight(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		return write(TOP_RIGHT, x, y, text, foregroundColor, backgroundColor);
	}

	@Override
	public RetroTerminal writeTopRight(int x, int y, String text, Color foregroundColor) {
		return write(TOP_RIGHT, x, y, text, foregroundColor, getBackgroundColor());
	}

	@Override
	public RetroTerminal writeTopRight(int x, int y, String text) {
		return write(TOP_RIGHT, x, y, text, getForegroundColor(), getBackgroundColor());
	}

	@Override
	public RetroTerminal writeTR(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		return write(TOP_RIGHT, x, y, text, foregroundColor, backgroundColor);
	}

	@Override
	public RetroTerminal writeTR(int x, int y, String text, Color foregroundColor) {
		return write(TOP_RIGHT, x, y, text, foregroundColor, getBackgroundColor());
	}

	@Override
	public RetroTerminal writeTR(int x, int y, String text) {
		return write(TOP_RIGHT, x, y, text, getForegroundColor(), getBackgroundColor());
	}

	@Override
	public RetroTerminal writeMiddleLeft(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		return write(MIDDLE_LEFT, x, y, text, foregroundColor, backgroundColor);
	}

	@Override
	public RetroTerminal writeMiddleLeft(int x, int y, String text, Color foregroundColor) {
		return write(MIDDLE_LEFT, x, y, text, foregroundColor, getBackgroundColor());
	}

	@Override
	public RetroTerminal writeMiddleLeft(int x, int y, String text) {
		return write(MIDDLE_LEFT, x, y, text, getForegroundColor(), getBackgroundColor());
	}

	@Override
	public RetroTerminal writeML(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		return write(MIDDLE_LEFT, x, y, text, foregroundColor, backgroundColor);
	}

	@Override
	public RetroTerminal writeML(int x, int y, String text, Color foregroundColor) {
		return write(MIDDLE_LEFT, x, y, text, foregroundColor, getBackgroundColor());
	}

	@Override
	public RetroTerminal writeML(int x, int y, String text) {
		return write(MIDDLE_LEFT, x, y, text, getForegroundColor(), getBackgroundColor());
	}

	@Override
	public RetroTerminal writeMiddleCenter(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		return write(MIDDLE_CENTER, x, y, text, foregroundColor, backgroundColor);
	}

	@Override
	public RetroTerminal writeMiddleCenter(int x, int y, String text, Color foregroundColor) {
		return write(MIDDLE_CENTER, x, y, text, foregroundColor, getBackgroundColor());
	}

	@Override
	public RetroTerminal writeMiddleCenter(int x, int y, String text) {
		return write(MIDDLE_CENTER, x, y, text, getForegroundColor(), getBackgroundColor());
	}

	@Override
	public RetroTerminal writeMC(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		return write(MIDDLE_CENTER, x, y, text, foregroundColor, backgroundColor);
	}

	@Override
	public RetroTerminal writeMC(int x, int y, String text, Color foregroundColor) {
		return write(MIDDLE_CENTER, x, y, text, foregroundColor, getBackgroundColor());
	}

	@Override
	public RetroTerminal writeMC(int x, int y, String text) {
		return write(MIDDLE_CENTER, x, y, text, getForegroundColor(), getBackgroundColor());
	}

	@Override
	public RetroTerminal writeMiddleRight(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		return write(MIDDLE_RIGHT, x, y, text, foregroundColor, backgroundColor);
	}

	@Override
	public RetroTerminal writeMiddleRight(int x, int y, String text, Color foregroundColor) {
		return write(MIDDLE_RIGHT, x, y, text, foregroundColor, getBackgroundColor());
	}

	@Override
	public RetroTerminal writeMiddleRight(int x, int y, String text) {
		return write(MIDDLE_RIGHT, x, y, text, getForegroundColor(), getBackgroundColor());
	}

	@Override
	public RetroTerminal writeMR(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		return write(MIDDLE_RIGHT, x, y, text, foregroundColor, backgroundColor);
	}

	@Override
	public RetroTerminal writeMR(int x, int y, String text, Color foregroundColor) {
		return write(MIDDLE_RIGHT, x, y, text, foregroundColor, getBackgroundColor());
	}

	@Override
	public RetroTerminal writeMR(int x, int y, String text) {
		return write(MIDDLE_RIGHT, x, y, text, getForegroundColor(), getBackgroundColor());
	}

	@Override
	public RetroTerminal writeBottomLeft(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		return write(BOTTOM_LEFT, x, y, text, foregroundColor, backgroundColor);
	}

	@Override
	public RetroTerminal writeBottomLeft(int x, int y, String text, Color foregroundColor) {
		return write(BOTTOM_LEFT, x, y, text, foregroundColor, getBackgroundColor());
	}

	@Override
	public RetroTerminal writeBottomLeft(int x, int y, String text) {
		return write(BOTTOM_LEFT, x, y, text, getForegroundColor(), getBackgroundColor());
	}

	@Override
	public RetroTerminal writeBL(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		return write(BOTTOM_LEFT, x, y, text, foregroundColor, backgroundColor);
	}

	@Override
	public RetroTerminal writeBL(int x, int y, String text, Color foregroundColor) {
		return write(BOTTOM_LEFT, x, y, text, foregroundColor, getBackgroundColor());
	}

	@Override
	public RetroTerminal writeBL(int x, int y, String text) {
		return write(BOTTOM_LEFT, x, y, text, getForegroundColor(), getBackgroundColor());
	}

	@Override
	public RetroTerminal writeBottomCenter(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		return write(BOTTOM_CENTER, x, y, text, foregroundColor, backgroundColor);
	}

	@Override
	public RetroTerminal writeBottomCenter(int x, int y, String text, Color foregroundColor) {
		return write(BOTTOM_CENTER, x, y, text, foregroundColor, getBackgroundColor());
	}

	@Override
	public RetroTerminal writeBottomCenter(int x, int y, String text) {
		return write(BOTTOM_CENTER, x, y, text, getForegroundColor(), getBackgroundColor());
	}

	@Override
	public RetroTerminal writeBC(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		return write(BOTTOM_CENTER, x, y, text, foregroundColor, backgroundColor);
	}

	@Override
	public RetroTerminal writeBC(int x, int y, String text, Color foregroundColor) {
		return write(BOTTOM_CENTER, x, y, text, foregroundColor, getBackgroundColor());
	}

	@Override
	public RetroTerminal writeBC(int x, int y, String text) {
		return write(BOTTOM_CENTER, x, y, text, getForegroundColor(), getBackgroundColor());
	}

	@Override
	public RetroTerminal writeBottomRight(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		return write(BOTTOM_RIGHT, x, y, text, foregroundColor, backgroundColor);
	}

	@Override
	public RetroTerminal writeBottomRight(int x, int y, String text, Color foregroundColor) {
		return write(BOTTOM_RIGHT, x, y, text, foregroundColor, getBackgroundColor());
	}

	@Override
	public RetroTerminal writeBottomRight(int x, int y, String text) {
		return write(BOTTOM_RIGHT, x, y, text, getForegroundColor(), getBackgroundColor());
	}

	@Override
	public RetroTerminal writeBR(int x, int y, String text, Color foregroundColor, Color backgroundColor) {
		return write(BOTTOM_RIGHT, x, y, text, foregroundColor, backgroundColor);
	}

	@Override
	public RetroTerminal writeBR(int x, int y, String text, Color foregroundColor) {
		return write(BOTTOM_RIGHT, x, y, text, foregroundColor, getBackgroundColor());
	}

	@Override
	public RetroTerminal writeBR(int x, int y, String text) {
		return write(BOTTOM_RIGHT, x, y, text, getForegroundColor(), getBackgroundColor());
	}

}

/*
 * POLYPHEMUS - Un sencillo juego tipo roguelike escrito en Java.
 * Copyright (c) 2014-2015, J. Francisco Martín <jfm.lisaso@gmail.com>.
 */
package jomali.polyphemus.utils;

import java.awt.Color;

import asciiPanel.AsciiPanel;

/**
 * Terminal de texto. Incluye las operaciones definidas por la interfaz
 * <code>ITerminal</code> para escribir caracteres, cadenas de caracteres (o
 * <em>strings</em>), vectores de cadenas de caracteres y operaciones de
 * rellenado y limpiado, así como métodos de acceso y modificación de los
 * atributos de la terminal.
 * 
 * <p>
 * <code>Terminal</code> funciona en realidad sólo como una envoltura de
 * <code>AsciiPanel</code>, y es esta superclase quien se encarga de implementar
 * las funcionalidades de los diferentes métodos.
 * 
 * 
 * @author J. Francisco Martín
 * @serial 2014/06/29
 * 
 */
public class Terminal extends AsciiPanel implements ITerminal {
	private static final long serialVersionUID = 2074146409618479723L;

	/**
	 * Caracter con que se representa un bloque generico en la interfaz.
	 */
	private static final char FRAME = (char) 177;

	/**
	 * Caracter con que se representa un bloque del marco horizontal en la
	 * interfaz.
	 */
	@SuppressWarnings("unused")
	private static final char HORIZONTAL_FRAME = (char) 205;

	/**
	 * Caracter con que se representa un bloque del marco vertical en la
	 * interfaz.
	 */
	@SuppressWarnings("unused")
	private static final char VERTICAL_FRAME = (char) 186;

	/**
	 * Caracter con que se representa el bloque de esquina superior izquierda en
	 * la interfaz.
	 */
	@SuppressWarnings("unused")
	private static final char TOP_LEFT_CORNER = (char) 201;

	/**
	 * Caracter con que se representa el bloque de esquina superior derecha en
	 * la interfaz.
	 */
	@SuppressWarnings("unused")
	private static final char TOP_RIGHT_CORNER = (char) 187;

	/**
	 * Caracter con que se representa el bloque de esquina superior central en
	 * la interfaz.
	 */
	@SuppressWarnings("unused")
	private static final char TOP_CENTER_CORNER = (char) 203;

	/**
	 * Caracter con que se representa el bloque de esquina inferior izquierda en
	 * la interfaz.
	 */
	@SuppressWarnings("unused")
	private static final char BOTTOM_LEFT_CORNER = (char) 200;

	/**
	 * Caracter con que se representa el bloque de esquina inferior derecha en
	 * la interfaz.
	 */
	@SuppressWarnings("unused")
	private static final char BOTTOM_RIGHT_CORNER = (char) 188;

	/**
	 * Caracter con que se representa el bloque de esquina inferior central en
	 * la interfaz.
	 */
	@SuppressWarnings("unused")
	private static final char BOTTOM_CENTER_CORNER = (char) 202;

	// /////////////////////////////////////////////////////////////////////////

	/** Color de frente utilizado para imprimir texto con estilo enfatizado. **/
	private Color emphasisColor;

	/**
	 * Constructor. Crea una nueva terminal utilizando los parámetros dados para
	 * inicializar sus atributos.
	 * 
	 * @param width
	 *            Ancho en número de casillas de la nueva terminal
	 * @param height
	 *            Alto en número de casillas de la nueva terminal
	 * @param foregroundColor
	 *            Color de frente por defecto de la nueva terminal
	 * @param backgroundColor
	 *            Color de fondo por defecto de la nueva terminal
	 * @param emphasisColor
	 *            Color de frente del estilo enfatizado por defecto de la nueva
	 *            terminal
	 */
	public Terminal(int width, int height, Color foregroundColor,
			Color backgroundColor, Color emphasisColor) {
		super(width, height);
		super.setDefaultForegroundColor(foregroundColor);
		super.setDefaultBackgroundColor(backgroundColor);
		this.emphasisColor = emphasisColor;
	}

	/**
	 * Constructor. Crea una nueva terminal utilizando los parámetros dados para
	 * inicializar sus atributos.
	 * 
	 * @param width
	 *            Ancho en número de casillas de la nueva terminal
	 * @param height
	 *            Alto en número de casillas de la nueva terminal
	 * @param foregroundColor
	 *            Color de frente por defecto de la nueva terminal
	 * @param backgroundColor
	 *            Color de fondo por defecto de la nueva terminal
	 */
	public Terminal(int width, int height, Color foregroundColor,
			Color backgroundColor) {
		this(width, height, foregroundColor, backgroundColor, foregroundColor);
	}

	/**
	 * Constructor. Crea una nueva terminal utilizando los parámetros dados y
	 * las constantes por defecto de la interfaz <code>ITerminal</code> para
	 * inicializar sus atributos.
	 * 
	 * @param width
	 *            Ancho en número de casillas de la nueva terminal
	 * @param height
	 *            Alto en número de casillas de la nueva terminal
	 */
	public Terminal(int width, int height) {
		this(width, height, ITerminal.DEFAULT_FOREGROUND_COLOR,
				ITerminal.DEFAULT_BACKGROUND_COLOR);
	}

	/**
	 * Constructor. Crea una nueva terminal utilizando los parámetros dados y
	 * las constantes por defecto de la interfaz <code>ITerminal</code> para
	 * inicializar sus atributos.
	 */
	public Terminal() {
		this(ITerminal.DEFAULT_WIDTH, ITerminal.DEFAULT_HEIGHT);
	}

	// /////////////////////////////////////////////////////////////////////////
	// métodos privados:

	/**
	 * Transforma el caracter <em>character</em> en otro caracter equivalente
	 * del conjunto <a
	 * href="http://es.wikipedia.org/wiki/P%C3%A1gina_de_c%C3%B3digos_437"
	 * >pagina de codigos 437</a>.
	 * 
	 * @param character
	 * @return caracter equivalente a c
	 */
	private char transpose(char character) {
		if (character == 'á' || character == 'Á')
			return (char) 160;
		if (character == 'é' || character == 'É')
			return (char) 130;
		if (character == 'í' || character == 'Í')
			return (char) 161;
		if (character == 'ó' || character == 'Ó')
			return (char) 162;
		if (character == 'ú' || character == 'Ú')
			return (char) 163;
		if (character == 'ñ')
			return (char) 164;
		if (character == 'Ñ')
			return (char) 165;
		if (character == '·')
			return (char) 250;
		// return (char) 178;
		// if (character == '¿') return (char) 168;

		// caracteres con los que se representan las casillas:
		if (character == '#')
			return (char) 177;
		if (character == '^')
			return (char) 178;
		if (character == '>')
			return (char) 30;
		if (character == '<')
			return (char) 31;

		return character;
	}

	// /////////////////////////////////////////////////////////////////////////
	// acceso y modificación de atributos:

	/**
	 * @see jomali.polyphemus.utils.ITerminal#getGridWidth()
	 */
	@Override
	public int getGridWidth() {
		return super.getWidthInCharacters();
	}

	/**
	 * @see jomali.polyphemus.utils.ITerminal#getGridHeight()
	 */
	@Override
	public int getGridHeight() {
		return super.getHeightInCharacters();
	}

	/**
	 * @see jomali.polyphemus.utils.ITerminal#getForegroundColor()
	 */
	@Override
	public Color getForegroundColor() {
		return super.getDefaultForegroundColor();
	}

	/**
	 * @see jomali.polyphemus.utils.ITerminal#getBackgroundColor()
	 */
	@Override
	public Color getBackgroundColor() {
		return super.getDefaultBackgroundColor();
	}

	/**
	 * Retorna el color de frente por defecto usado por la terminal para
	 * imprimir texto con estilo enfatizado.
	 * 
	 * @return color de frente por defecto para el estilo enfatizado
	 */
	public Color getEmphasisColor() {
		return emphasisColor;
	}

	/**
	 * @see jomali.polyphemus.utils.ITerminal#setForegroundColor(Color)
	 */
	@Override
	public void setForegroundColor(Color foregroundColor) {
		super.setForeground(foregroundColor);
	}

	/**
	 * @see jomali.polyphemus.utils.ITerminal#setBackgroundColor(Color)
	 */
	@Override
	public void setBackgroundColor(Color backgroundColor) {
		super.setBackground(backgroundColor);
	}

	/**
	 * Establece <em>emphasisColor</em> como el color de frente por defecto
	 * usado por la terminal para imprimir texto con estilo enfatizado.
	 * 
	 * @param emphasisColor
	 *            nuevo color de frente por defecto para el estilo enfatizado
	 */
	public void setEmphasisColor(Color emphasisColor) {
		this.emphasisColor = emphasisColor;
	}

	// /////////////////////////////////////////////////////////////////////////
	// escritura de caracteres:

	/**
	 * @see jomali.polyphemus.utils.ITerminal#write(jomali.polyphemus.utils.ITerminal.Alignment,
	 *      char, int, int, Color, Color)
	 */
	@Override
	public Terminal write(Alignment alignment, char character, int x, int y,
			Color foregroundColor, Color backgroundColor) {
		// Se establecen las posiciones reales de x e y en base a la alineación:
		switch (alignment) {
		case TOP_LEFT:
		case TL:
			break;
		case TOP_CENTER:
		case TC:
			x = (this.getGridWidth() / 2) + x;
			break;
		case TOP_RIGHT:
		case TR:
			x = (this.getGridWidth() - 1) - x;
			break;
		case MIDDLE_LEFT:
		case ML:
			y = (this.getGridHeight() / 2) + y;
			break;
		case MIDDLE_CENTER:
		case MC:
			x = (getGridWidth() / 2) + x;
			y = (getGridHeight() / 2) + y;
			break;
		case MIDDLE_RIGHT:
		case MR:
			x = (getGridWidth() - 1) - x;
			y = (getGridHeight() / 2) + y;
			break;
		case BOTTOM_LEFT:
		case BL:
			y = (getGridHeight() - 1) - y;
			break;
		case BOTTOM_CENTER:
		case BC:
			x = (getGridWidth() / 2) + x;
			y = (getGridHeight() - 1) - y;
			break;
		case BOTTOM_RIGHT:
		case BR:
			x = (getGridWidth() - 1) - x;
			y = (getGridHeight() - 1) - y;
			break;
		}

		// Se comprueba que los parámetros sean correctos:
		if (character < 0 || character >= 256) { // 256 = glyphs.length
			// TODO Pasar los mensajes de error a un fichero aparte para
			// facilitar su traducción a otros idiomas
			System.out.println("ERROR. Caracter incorrecto.");
			return this;
		}
		if (x < 0 || x >= getGridWidth()) {
			// TODO Pasar los mensajes de error a un fichero aparte para
			// facilitar su traducción a otros idiomas
			System.out.println("ERROR. Valor x: " + x + " incorrecto.");
			return this;
		}
		if (y < 0 || y >= getGridHeight()) {
			// TODO Pasar los mensajes de error a un fichero aparte para
			// facilitar su traducción a otros idiomas
			System.out.println("ERROR. Valor y: " + y + " incorrecto.");
			return this;
		}
		if (foregroundColor == null)
			foregroundColor = getForegroundColor();
		if (backgroundColor == null)
			backgroundColor = getBackgroundColor();

		// Se escribe el caracter en la terminal:
		character = transpose(character);
		super.write(character, x, y, foregroundColor, backgroundColor);
		return this;
	}

	/**
	 * @see jomali.polyphemus.utils.ITerminal#write(jomali.polyphemus.utils.ITerminal.Alignment,
	 *      char, int, int, Color)
	 */
	@Override
	public Terminal write(Alignment alignment, char character, int x, int y,
			Color foregroundColor) {
		return write(alignment, character, x, y, foregroundColor,
				getBackgroundColor());
	}

	/**
	 * @see jomali.polyphemus.utils.ITerminal#write(jomali.polyphemus.utils.ITerminal.Alignment,
	 *      char, int, int)
	 */
	@Override
	public Terminal write(Alignment alignment, char character, int x, int y) {
		return write(alignment, character, x, y, getForegroundColor());
	}

	// /////////////////////////////////////////////////////////////////////////
	// escritura de cadenas de caracteres:

	/**
	 * Escribe una cadena de caracteres en la terminal con los parámetros dados.
	 * 
	 * @param alignment
	 *            Alineación de la cadena de caracteres en la terminal
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @param x
	 *            Posición del inicio de la cadena en el eje horizontal
	 * @param y
	 *            Posición del inicio de la cadena en el eje vertical
	 * @param foregroundColor
	 *            Color de frente con el que se imprime la cadena
	 * @param backgroundColor
	 *            Color de fondo con el que se imprime la cadena
	 * @param emphasisColor
	 *            Color de frente con el que se imprime el estilo enfatizado de
	 *            la cadena
	 * @return A si mismo, para facilitar la encadenación de llamadas
	 */
	public Terminal write(Alignment alignment, String text, int x, int y,
			Color foregroundColor, Color backgroundColor, Color emphasisColor) {
		// Se establecen las posiciones reales de x e y en base a la alineacion:
		String str = text.replace("*", "");
		switch (alignment) {
		case TOP_LEFT:
		case TL:
			break;
		case TOP_CENTER:
		case TC:
			x = (getGridWidth() / 2) - (str.length() / 2) + (x / 2);
			break;
		case TOP_RIGHT:
		case TR:
			x = (getGridWidth() - 1) - (str.length() - 1) - x;
			break;
		case MIDDLE_LEFT:
		case ML:
			y = (getGridHeight() / 2) + y;
			break;
		case MIDDLE_CENTER:
		case MC:
			x = (getGridWidth() / 2) - (str.length() / 2) + (x / 2);
			y = (getGridHeight() / 2) + y;
			break;
		case MIDDLE_RIGHT:
		case MR:
			x = (getGridWidth() - 1) - (str.length() - 1) - x;
			y = (getGridHeight() / 2) + y;
			break;
		case BOTTOM_LEFT:
		case BL:
			y = (getGridHeight() - 1) - y;
			break;
		case BOTTOM_CENTER:
		case BC:
			x = (getGridWidth() / 2) - (str.length() / 2) + (x / 2);
			y = (getGridHeight() - 1) - y;
			break;
		case BOTTOM_RIGHT:
		case BR:
			x = (getGridWidth() - 1) - (str.length() - 1) - x;
			y = (getGridHeight() - 1) - y;
			break;
		}

		// Se escriben uno a uno los caracteres de la cadena:
		boolean emphasis = false;
		int index = 0;
		Color color;
		for (int i = 0; i < str.length(); i++) {
			if (text.charAt(index) == '*') {
				index++;
				emphasis = !emphasis;
			}
			color = emphasis ? emphasisColor : foregroundColor;
			this.write(Alignment.TOP_LEFT, str.charAt(i), x + i, y, color,
					backgroundColor);
			index++;
		}

		return this;
	}

	/**
	 * @see jomali.polyphemus.utils.ITerminal#write(jomali.polyphemus.utils.ITerminal.Alignment,
	 *      String, int, int, Color, Color)
	 */
	@Override
	public Terminal write(Alignment alignment, String text, int x, int y,
			Color foregroundColor, Color backgroundColor) {
		return write(alignment, text, x, y, foregroundColor, backgroundColor,
				this.emphasisColor);
	}

	/**
	 * @see jomali.polyphemus.utils.ITerminal#write(jomali.polyphemus.utils.ITerminal.Alignment,
	 *      String, int, int, Color)
	 */
	@Override
	public Terminal write(Alignment alignment, String text, int x, int y,
			Color foregroundColor) {
		return write(alignment, text, x, y, foregroundColor,
				getBackgroundColor());
	}

	/**
	 * @see jomali.polyphemus.utils.ITerminal#write(jomali.polyphemus.utils.ITerminal.Alignment,
	 *      String, int, int)
	 */
	@Override
	public Terminal write(Alignment alignment, String text, int x, int y) {
		return write(alignment, text, x, y, getForegroundColor());
	}

	// /////////////////////////////////////////////////////////////////////////
	// escritura de vectores:

	/**
	 * @see jomali.polyphemus.utils.ITerminal#write(jomali.polyphemus.utils.ITerminal.Alignment,
	 *      String[], int, int, Color, Color)
	 */
	@Override
	public Terminal write(Alignment alignment, String[] array, int x, int y,
			Color foregroundColor, Color backgroundColor) {
		// Se establecen las posiciones reales de x e y en base a la alineacion:
		switch (alignment) {
		case TOP_LEFT:
		case TL:
			break;
		case TOP_CENTER:
		case TC:
			break;
		case TOP_RIGHT:
		case TR:
			break;
		case MIDDLE_LEFT:
		case ML:
			alignment = Alignment.TOP_LEFT;
			y = (getGridHeight() / 2) - (array.length / 2) + y;
			break;
		case MIDDLE_CENTER:
		case MC:
			alignment = Alignment.TOP_CENTER;
			y = (getGridHeight() / 2) - (array.length / 2) + y;
			break;
		case MIDDLE_RIGHT:
		case MR:
			alignment = Alignment.TOP_RIGHT;
			y = (getGridHeight() / 2) - (array.length / 2) + y;
			break;
		case BOTTOM_LEFT:
		case BL:
			alignment = Alignment.TOP_LEFT;
			y = (getGridHeight() - 1) - (array.length - 1) - y;
			break;
		case BOTTOM_CENTER:
		case BC:
			alignment = Alignment.TOP_CENTER;
			y = (getGridHeight() - 1) - (array.length - 1) - y;
			break;
		case BOTTOM_RIGHT:
		case BR:
			alignment = Alignment.TOP_RIGHT;
			y = (getGridHeight() - 1) - (array.length - 1) - y;
			break;
		}

		// Se escriben una a una las cadenas de caracteres del vector:
		for (int j = 0; j < array.length; j++)
			write(alignment, array[j], x, y + j, foregroundColor,
					backgroundColor);
		return this;
	}

	/**
	 * @see jomali.polyphemus.utils.ITerminal#write(jomali.polyphemus.utils.ITerminal.Alignment,
	 *      String[], int, int, Color)
	 */
	@Override
	public Terminal write(Alignment alignment, String[] array, int x, int y,
			Color foregroundColor) {
		return write(alignment, array, x, y, foregroundColor,
				getBackgroundColor());
	}

	/**
	 * @see jomali.polyphemus.utils.ITerminal#write(jomali.polyphemus.utils.ITerminal.Alignment,
	 *      String[], int, int)
	 */
	@Override
	public Terminal write(Alignment alignment, String[] array, int x, int y) {
		return write(alignment, array, x, y, getForegroundColor());
	}

	// /////////////////////////////////////////////////////////////////////////
	// métodos de rellenado y limpieza:

	/**
	 * @see jomali.polyphemus.utils.ITerminal#clear(char, int, int, int, int,
	 *      Color, Color)
	 */
	@Override
	public Terminal clear(char character, int x, int y, int width, int height,
			Color foregroundColor, Color backgroundColor) {
		// Se comprueba que los parámetros sean correctos:
		if (character < 0 || character >= 256) { // 256 = glyphs.length
			// TODO Pasar los mensajes de error a un fichero aparte para
			// facilitar su traducción a otros idiomas
			System.out.println("ERROR. Caracter incorrecto.");
			return this;
		}
		if (x < 0 || x >= getGridWidth()) {
			// TODO Pasar los mensajes de error a un fichero aparte para
			// facilitar su traducción a otros idiomas
			System.out.println("ERROR. Valor x: " + x + " incorrecto.");
			return this;
		}
		if (y < 0 || y >= getGridHeight()) {
			// TODO Pasar los mensajes de error a un fichero aparte para
			// facilitar su traducción a otros idiomas
			System.out.println("ERROR. Valor y: " + y + " incorrecto.");
			return this;
		}
		if (x + width < 0 || x + width > getGridWidth()) {
			// TODO Pasar los mensajes de error a un fichero aparte para
			// facilitar su traducción a otros idiomas
			System.out.println("ERROR. Valor x+width: " + (x + width)
					+ " incorrecto.");
			return this;
		}
		if (y + height < 0 || y + height > getGridHeight()) {
			// TODO Pasar los mensajes de error a un fichero aparte para
			// facilitar su traducción a otros idiomas
			System.out.println("ERROR. Valor y+height: " + (y + height)
					+ " incorrecto.");
			return this;
		}
		if (foregroundColor == null)
			foregroundColor = getForegroundColor();
		if (backgroundColor == null)
			backgroundColor = getBackgroundColor();

		// Se rellena el rectángulo de la terminal. con el caracter dado:
		character = transpose(character);
		super.clear(character, x, y, width, height, foregroundColor,
				backgroundColor);
		return this;
	}

	/**
	 * @see jomali.polyphemus.utils.ITerminal#clear(char, int, int, int, int,
	 *      Color)
	 */
	@Override
	public Terminal clear(char character, int x, int y, int width, int height,
			Color foregroundColor) {
		return clear(character, x, y, width, height, foregroundColor,
				getBackgroundColor());
	}

	/**
	 * @see jomali.polyphemus.utils.ITerminal#clear(char, int, int, int, int)
	 */
	@Override
	public Terminal clear(char character, int x, int y, int width, int height) {
		return clear(character, x, y, width, height, getForegroundColor());
	}

	/**
	 * @see jomali.polyphemus.utils.ITerminal#clear(int, int, int, int, Color)
	 */
	@Override
	public Terminal clear(int x, int y, int width, int height, Color color) {
		return clear(' ', x, y, width, height, getForegroundColor(), color);
	}

	/**
	 * @see jomali.polyphemus.utils.ITerminal#clear(int, int, int, int)
	 */
	@Override
	public Terminal clear(int x, int y, int width, int height) {
		return clear(x, y, width, height, getBackgroundColor());
	}

	/**
	 * @see jomali.polyphemus.utils.ITerminal#clear(Color)
	 */
	@Override
	public Terminal clear(Color color) {
		return clear(0, 0, getGridWidth(), getGridHeight(), color);
	}

	/**
	 * @see jomali.polyphemus.utils.ITerminal#clear()
	 */
	@Override
	public Terminal clear() {
		return clear(getBackgroundColor());
	}

	// /////////////////////////////////////////////////////////////////////////
	// otros métodos:

	/**
	 * @see jomali.polyphemus.utils.ITerminal#writeColumn(char, int, Color,
	 *      Color)
	 */
	@Override
	public Terminal writeColumn(char character, int x, Color foregroundColor,
			Color backgroundColor) {
		// Se comprueba que los parámetros sean correctos:
		if (x < 0 || x >= getGridWidth()) {
			// TODO Pasar los mensajes de error a un fichero aparte para
			// facilitar su traducción a otros idiomas
			System.out.println("ERROR. Valor x: " + x + " incorrecto.");
			return this;
		}
		if (foregroundColor == null)
			foregroundColor = getForegroundColor();
		if (backgroundColor == null)
			backgroundColor = getBackgroundColor();

		// Se escribe la columna:
		for (int j = 0; j < getGridHeight(); j++)
			write(FRAME, x, j, foregroundColor, backgroundColor);
		return this;
	}

	/**
	 * @see jomali.polyphemus.utils.ITerminal#writeColumn(char, int, Color)
	 */
	@Override
	public Terminal writeColumn(char character, int x, Color foregroundColor) {
		return writeColumn(character, x, foregroundColor, getBackgroundColor());
	}

	/**
	 * @see jomali.polyphemus.utils.ITerminal#writeColumn(char, int)
	 */
	@Override
	public Terminal writeColumn(char character, int x) {
		return writeColumn(character, x, getForegroundColor());
	}

	/**
	 * @see jomali.polyphemus.utils.ITerminal#writeColumn(int, Color, Color)
	 */
	@Override
	public Terminal writeColumn(int x, Color foregroundColor,
			Color backgroundColor) {
		return writeColumn(FRAME, x, foregroundColor, backgroundColor);
	}

	/**
	 * @see jomali.polyphemus.utils.ITerminal#writeColumn(int, Color)
	 */
	@Override
	public Terminal writeColumn(int x, Color foregroundColor) {
		return writeColumn(x, foregroundColor, getBackgroundColor());
	}

	/**
	 * @see jomali.polyphemus.utils.ITerminal#writeColumn(int)
	 */
	@Override
	public Terminal writeColumn(int x) {
		return writeColumn(x, getForegroundColor());
	}

	/**
	 * @see jomali.polyphemus.utils.ITerminal#writeRow(char, int, Color, Color)
	 */
	@Override
	public Terminal writeRow(char character, int y, Color foregroundColor,
			Color backgroundColor) {
		// Se comprueba que los parámetros sean correctos:
		if (y < 0 || y >= getGridWidth()) {
			// TODO Pasar los mensajes de error a un fichero aparte para
			// facilitar su traducción a otros idiomas
			System.out.println("ERROR. Valor y: " + y + " incorrecto.");
			return this;
		}
		if (foregroundColor == null)
			foregroundColor = getForegroundColor();
		if (backgroundColor == null)
			backgroundColor = getBackgroundColor();

		// Se escribe la fila:
		for (int i = 0; i < getGridWidth(); i++)
			write(FRAME, i, y, foregroundColor, backgroundColor);
		return this;
	}

	/**
	 * @see jomali.polyphemus.utils.ITerminal#writeRow(char, int, Color)
	 */
	@Override
	public Terminal writeRow(char character, int y, Color foregroundColor) {
		return writeRow(character, y, foregroundColor, getBackgroundColor());
	}

	/**
	 * @see jomali.polyphemus.utils.ITerminal#writeRow(char, int)
	 */
	@Override
	public Terminal writeRow(char character, int y) {
		return writeRow(character, y, getForegroundColor());
	}

	/**
	 * @see jomali.polyphemus.utils.ITerminal#writeRow(int, Color, Color)
	 */
	@Override
	public Terminal writeRow(int y, Color foregroundColor, Color backgroundColor) {
		return writeRow(FRAME, y, foregroundColor, backgroundColor);
	}

	/**
	 * @see jomali.polyphemus.utils.ITerminal#writeRow(int, Color)
	 */
	@Override
	public Terminal writeRow(int y, Color foregroundColor) {
		return writeRow(y, foregroundColor, getBackgroundColor());
	}

	/**
	 * @see jomali.polyphemus.utils.ITerminal#writeRow(int)
	 */
	@Override
	public Terminal writeRow(int y) {
		return writeRow(y, getForegroundColor());
	}

	/**
	 * @see jomali.polyphemus.utils.ITerminal#writeBox(String[], int, int,
	 *      Color, Color)
	 */
	@Override
	public Terminal writeBox(String[] array, int x, int y,
			Color foregroundColor, Color backgroundColor) {
		int length = 0;
		for (String string : array)
			if (length < string.length())
				length = string.length();
		length += 8;
		String line1 = FRAME + " ";
		String line2 = " " + FRAME;
		String line3 = FRAME + " ";
		String line4 = " " + FRAME;
		for (int i = 0; i < length - 2; i += 2) {
			line1 += FRAME + " ";
			line2 += " " + FRAME;
			line3 += "  ";
			line4 += "  ";
		}
		line1 = line1.substring(0, length);
		line2 = line2.substring(0, length);
		line3 = line3.substring(0, length - 2);
		line4 = line4.substring(0, length - 2);
		line3 += length % 2 == 0 ? FRAME + " " : " " + FRAME;
		line4 += length % 2 == 0 ? " " + FRAME : FRAME + " ";

		int counter = 0;
		String[] newArray = new String[array.length + 6];
		newArray[counter] = line1;
		counter++;
		newArray[counter] = line2;
		counter++;
		newArray[counter] = line3;

		for (int j = 0; j < array.length; j++) {
			counter++;
			String str1 = counter % 2 == 0 ? FRAME + " " : " " + FRAME;
			String str2 = counter % 2 == 0 ? " " + FRAME : FRAME + " ";
			int m = (length - (array[j].length() + 8)) / 2;
			int n = length - (array[j].length() + 8 + m);
			String line = str1 + "  ";
			for (int i = 0; i < m; i++)
				line += " ";
			line += array[j];
			for (int i = 0; i < n; i++)
				line += " ";
			line += length % 2 == 0 ? "  " + str1 : "  " + str2;
			newArray[counter] = line;
		}
		counter++;
		newArray[counter] = array.length % 2 == 0 ? line4 : line3;
		counter++;
		newArray[counter] = array.length % 2 == 0 ? line1 : line2;
		counter++;
		newArray[counter] = array.length % 2 == 0 ? line2 : line1;

		int x0;
		int y0 = (getGridHeight() / 2) - (newArray.length / 2) + y;
		for (int j = 0; j < newArray.length; j++) {
			x0 = (getGridWidth() / 2) - (newArray[j].length() / 2) + x;
			super.write(newArray[j], x0, y0 + j, foregroundColor,
					backgroundColor);
		}

		return this;
	}

}

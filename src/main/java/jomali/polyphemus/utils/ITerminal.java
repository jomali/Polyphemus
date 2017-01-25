/*
 * POLYPHEMUS - Un sencillo juego tipo roguelike escrito en Java.
 * Copyright (c) 2014-2015, J. Francisco Martín <jfm.lisaso@gmail.com>.
 */
package jomali.polyphemus.utils;

import java.awt.Color;

/**
 * Interfaz con la que se define una terminal. Indica las diferentes operaciones
 * que debe implementar una terminal de texto.
 * 
 * 
 * @author J. Francisco Martín
 * @serial 2014/06/29
 * 
 */
public interface ITerminal {

	/**
	 * Clase enumerada que define las diferentes alineaciones de texto posibles
	 * además de varias abreviaturas para estas alineaciones.
	 */
	public enum Alignment {
		TOP_LEFT, TOP_CENTER, TOP_RIGHT,

		MIDDLE_LEFT, MIDDLE_CENTER, MIDDLE_RIGHT,

		BOTTOM_LEFT, BOTTOM_CENTER, BOTTOM_RIGHT,

		TL, TC, TR, ML, MC, MR, BL, BC, BR;
	}

	/** Ancho (en num. de casillas) si no se especifica uno en el constructor. */
	public static final int DEFAULT_WIDTH = 80;

	/** Alto (en num. de casillas) si no se especifica uno en el constructor. */
	public static final int DEFAULT_HEIGHT = 24;

	/** Color de frente si no se especifica uno en el constructor. */
	public static final Color DEFAULT_FOREGROUND_COLOR = SColor.WHITE;

	/** Color de fondo si no se especifica uno en el constructor. */
	public static final Color DEFAULT_BACKGROUND_COLOR = SColor.BLACK;

	// /////////////////////////////////////////////////////////////////////////
	// acceso y modificación de atributos:

	/**
	 * Retorna el ancho de la terminal en numero de casillas.
	 * 
	 * @return ancho de la terminal en numero de casillas
	 */
	public int getGridWidth();

	/**
	 * Retorna el alto de la terminal en numero de casillas.
	 * 
	 * @return alto de la terminal en numero de casillas
	 */
	public int getGridHeight();

	/**
	 * Retorna el color de frente utilizado por defecto por la terminal.
	 * 
	 * @return color de frente utilizado por defecto por la terminal
	 */
	public Color getForegroundColor();

	/**
	 * Retorna el color de fondo utilizado por defecto por la terminal.
	 * 
	 * @return color de fondo utilizado por defecto por la terminal
	 */
	public Color getBackgroundColor();

	/**
	 * Establece <em>foregroundColor</em> como color de frente por defecto.
	 * 
	 * @param foregroundColor
	 *            color de frente que se utilizará por defecto
	 */
	public void setForegroundColor(Color foregroundColor);

	/**
	 * Establece <em>backgroundColor</em> como color de fondo por defecto.
	 * 
	 * @param backgroundColor
	 *            color de fondo que se utilizará por defecto
	 */
	public void setBackgroundColor(Color backgroundColor);

	// /////////////////////////////////////////////////////////////////////////
	// escritura de caracteres:

	/**
	 * Escribe un caracter en la terminal con los parámetros dados.
	 * 
	 * @param alignment
	 *            Alineación del caracter en la terminal
	 * @param character
	 *            Caracter a escribir
	 * @param x
	 *            Posición del caracter en el eje horizontal
	 * @param y
	 *            Posición del caracter en el eje vertical
	 * @param foregroundColor
	 *            Color de frente con el que escribir el caracter
	 * @param backgroundColor
	 *            Color de fondo con el que escribir el caracter
	 * @return A si mismo, para facilitar la encadenación de llamadas
	 */
	public ITerminal write(Alignment alignment, char character, int x, int y,
			Color foregroundColor, Color backgroundColor);

	/**
	 * Escribe un caracter en la terminal con los parámetros dados.
	 * 
	 * @param alignment
	 *            Alineación del caracter en la terminal
	 * @param character
	 *            Caracter a escribir
	 * @param x
	 *            Posición del caracter en el eje horizontal
	 * @param y
	 *            Posición del caracter en el eje vertical
	 * @param foregroundColor
	 *            Color de frente con el que escribir el caracter
	 * @return A si mismo, para facilitar la encadenación de llamadas
	 */
	public ITerminal write(Alignment alignment, char character, int x, int y,
			Color foregroundColor);

	/**
	 * Escribe un caracter en la terminal con los parámetros dados.
	 * 
	 * @param alignment
	 *            Alineación del caracter en la terminal
	 * @param character
	 *            Caracter a escribir
	 * @param x
	 *            Posición del caracter en el eje horizontal
	 * @param y
	 *            Posición del caracter en el eje vertical
	 * @return A si mismo, para facilitar la encadenación de llamadas
	 */
	public ITerminal write(Alignment alignment, char character, int x, int y);

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
	 * @return A si mismo, para facilitar la encadenación de llamadas
	 */
	public ITerminal write(Alignment alignment, String text, int x, int y,
			Color foregroundColor, Color backgroundColor);

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
	 * @return A si mismo, para facilitar la encadenación de llamadas
	 */
	public ITerminal write(Alignment alignment, String text, int x, int y,
			Color foregroundColor);

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
	 * @return A si mismo, para facilitar la encadenación de llamadas
	 */
	public ITerminal write(Alignment alignment, String text, int x, int y);

	// /////////////////////////////////////////////////////////////////////////
	// escritura de vectores:

	/**
	 * Escribe un vector de cadenas de caracteres en la terminal con los
	 * parámetros dados.
	 * 
	 * @param alignment
	 *            Alineación del vector en la terminal
	 * @param array
	 *            Vector de cadenas de caracteres a escribir
	 * @param x
	 *            Posición inicial del vector en el eje horizontal
	 * @param y
	 *            Posición inicial del vector en el eje vertical
	 * @param foregroundColor
	 *            Color de frente con el que se imprime el vector
	 * @param backgroundColor
	 *            Color de fondo con el que se imprime el vector
	 * @return A si mismo, para facilitar la encadenación de llamadas
	 */
	public ITerminal write(Alignment alignment, String[] array, int x, int y,
			Color foregroundColor, Color backgroundColor);

	/**
	 * Escribe un vector de cadenas de caracteres en la terminal con los
	 * parámetros dados.
	 * 
	 * @param alignment
	 *            Alineación del vector en la terminal
	 * @param array
	 *            Vector de cadenas de caracteres a escribir
	 * @param x
	 *            Posición inicial del vector en el eje horizontal
	 * @param y
	 *            Posición inicial del vector en el eje vertical
	 * @param foregroundColor
	 *            Color de frente con el que se imprime el vector
	 * @return A si mismo, para facilitar la encadenación de llamadas
	 */
	public ITerminal write(Alignment alignment, String[] array, int x, int y,
			Color foregroundColor);

	/**
	 * Escribe un vector de cadenas de caracteres en la terminal con los
	 * parámetros dados.
	 * 
	 * @param alignment
	 *            Alineación del vector en la terminal
	 * @param array
	 *            Vector de cadenas de caracteres a escribir
	 * @param x
	 *            Posición inicial del vector en el eje horizontal
	 * @param y
	 *            Posición inicial del vector en el eje vertical
	 * @return A si mismo, para facilitar la encadenación de llamadas
	 */
	public ITerminal write(Alignment alignment, String[] array, int x, int y);

	// /////////////////////////////////////////////////////////////////////////
	// métodos de rellenado y limpieza:

	/**
	 * Rellena un rectángulo de la terminal con vértice superior izquierdo en
	 * las coordenadas <em>(x,y)</em> de anchura <em>width</em> y altura
	 * <em>height</em>, con el caracter y los colores de frente y fondo dados.
	 * 
	 * @param character
	 *            Caracter con que se rellena el rectángulo
	 * @param x
	 *            Coordenada en el eje horizontal del vértice superior izquierdo
	 * @param y
	 *            Coordenada en el eje vertical del vértice superior izquierdo
	 * @param width
	 *            Ancho del rectángulo
	 * @param height
	 *            Alto del rectángulo
	 * @param foregroundColor
	 *            Color de frente con el que se imprime el caracter
	 * @param backgroundColor
	 *            Color de fondo con el que se imprime el caracter
	 * @return A si mismo, para facilitar la encadenación de llamadas
	 */
	public ITerminal clear(char character, int x, int y, int width, int height,
			Color foregroundColor, Color backgroundColor);

	/**
	 * Rellena un rectángulo de la terminal con vértice superior izquierdo en
	 * las coordenadas <em>(x,y)</em> de anchura <em>width</em> y altura
	 * <em>height</em>, con el caracter y el color de frente dado. Como color de
	 * fondo utiliza el color de fondo por defecto de la terminal.
	 * 
	 * @param character
	 *            Caracter con que se rellena el rectángulo
	 * @param x
	 *            Coordenada en el eje horizontal del vértice superior izquierdo
	 * @param y
	 *            Coordenada en el eje vertical del vértice superior izquierdo
	 * @param width
	 *            Ancho del rectángulo
	 * @param height
	 *            Alto del rectángulo
	 * @param foregroundColor
	 *            Color de frente con el que se imprime el caracter
	 * @return A si mismo, para facilitar la encadenación de llamadas
	 */
	public ITerminal clear(char character, int x, int y, int width, int height,
			Color foregroundColor);

	/**
	 * Rellena un rectángulo de la terminal con vértice superior izquierdo en
	 * las coordenadas <em>(x,y)</em> de anchura <em>width</em> y altura
	 * <em>height</em>, con el caracter dado. Como colores de frente y fondo
	 * utiliza los colores por defecto de la terminal.
	 * 
	 * @param character
	 *            Caracter con que se rellena el rectángulo
	 * @param x
	 *            Coordenada en el eje horizontal del vértice superior izquierdo
	 * @param y
	 *            Coordenada en el eje vertical del vértice superior izquierdo
	 * @param width
	 *            Ancho del rectángulo
	 * @param height
	 *            Alto del rectángulo
	 * @return A si mismo, para facilitar la encadenación de llamadas
	 */
	public ITerminal clear(char character, int x, int y, int width, int height);

	/**
	 * Rellena un rectángulo de la terminal con vértice superior izquierdo en
	 * las coordenadas <em>(x,y)</em> de anchura <em>width</em> y altura
	 * <em>height</em>, con el color de fondo dado.
	 * 
	 * @param x
	 *            Coordenada en el eje horizontal del vértice superior izquierdo
	 * @param y
	 *            Coordenada en el eje vertical del vértice superior izquierdo
	 * @param width
	 *            Ancho del rectángulo
	 * @param height
	 *            Alto del rectángulo
	 * @param color
	 *            Color con el que se rellena el rectángulo
	 * @return A si mismo, para facilitar la encadenación de llamadas
	 */
	public ITerminal clear(int x, int y, int width, int height, Color color);

	/**
	 * 
	 * Rellena un rectángulo de la terminal con vértice superior izquierdo en
	 * las coordenadas <em>(x,y)</em> de anchura <em>width</em> y altura
	 * <em>height</em>, con el color de fondo por defecto de la terminal.
	 * 
	 * @param x
	 *            Coordenada en el eje horizontal del vértice superior izquierdo
	 * @param y
	 *            Coordenada en el eje vertical del vértice superior izquierdo
	 * @param width
	 *            Ancho del rectángulo
	 * @param height
	 *            Alto del rectángulo
	 * @return A si mismo, para facilitar la encadenación de llamadas
	 */
	public ITerminal clear(int x, int y, int width, int height);

	/**
	 * Limpia completamente la terminal con el color de fondo dado.
	 * 
	 * @param color
	 *            Color con el que se rellana la terminal
	 * @return A si mismo, para facilitar la encadenación de llamadas
	 */
	public ITerminal clear(Color color);

	/**
	 * Limpia completamente la terminal con el color de fondo por defecto.
	 * 
	 * @return A si mismo, para facilitar la encadenación de llamadas
	 */
	public ITerminal clear();

	// /////////////////////////////////////////////////////////////////////////
	// métodos de escritura de columnas:

	/**
	 * Escribe el caracter <em>character</em> a lo largo de toda la columna
	 * <em>x</em> de la terminal utilizando los colores dados.
	 * 
	 * @param character
	 *            Caracter a escribir en la columna
	 * @param x
	 *            Columna de la terminal en la que se escribirá
	 * @param foregroundColor
	 *            Color de frente con el que se escribirá el caracter
	 * @param backgroundColor
	 *            Color de fondo con el que se escribirá el caracter
	 * @return A si mismo, para facilitar la encadenación de llamadas
	 */
	public ITerminal writeColumn(char character, int x, Color foregroundColor,
			Color backgroundColor);

	/**
	 * Escribe el caracter <em>character</em> a lo largo de toda la columna
	 * <em>x</em> de la terminal utilizando el color de frente dado y el color
	 * de fondo por defecto.
	 * 
	 * @param character
	 *            Caracter a escribir en la columna
	 * @param x
	 *            Columna de la terminal en la que se escribirá
	 * @param foregroundColor
	 *            Color de frente con el que se escribirá el caracter
	 * @return A si mismo, para facilitar la encadenación de llamadas
	 */
	public ITerminal writeColumn(char character, int x, Color foregroundColor);

	/**
	 * Escribe el caracter <em>character</em> a lo largo de toda la columna
	 * <em>x</em> de la terminal utilizando los colores por defecto.
	 * 
	 * @param character
	 *            Caracter a escribir en la columna
	 * @param x
	 *            Columna de la terminal en la que se escribirá
	 * @return A si mismo, para facilitar la encadenación de llamadas
	 */
	public ITerminal writeColumn(char character, int x);

	/**
	 * Escribe un <em>caracter bloque</em> a lo largo de toda la columna
	 * <em>x</em> de la terminal utilizando los colores dados.
	 * 
	 * @param x
	 *            Columna de la terminal en la que se escribirá
	 * @param foregroundColor
	 *            Color de frente con el que se escribirá el caracter
	 * @param backgroundColor
	 *            Color de fondo con el que se escribirá el caracter
	 * @return A si mismo, para facilitar la encadenación de llamadas
	 */
	public ITerminal writeColumn(int x, Color foregroundColor,
			Color backgroundColor);

	/**
	 * Escribe un <em>caracter bloque</em> a lo largo de toda la columna
	 * <em>x</em> de la terminal utilizando el color de frente dado. Como color
	 * de fondo utiliza el que tiene por defecto la terminal.
	 * 
	 * @param x
	 *            Columna de la terminal en la que se escribirá
	 * @param foregroundColor
	 *            Color de frente con el que se escribirá el caracter
	 * @return A si mismo, para facilitar la encadenación de llamadas
	 */
	public ITerminal writeColumn(int x, Color foregroundColor);

	/**
	 * Escribe un <em>caracter bloque</em> a lo largo de toda la columna
	 * <em>x</em> de la terminal utilizando los colores por defecto.
	 * 
	 * @param x
	 *            Columna de la terminal en la que se escribirá
	 * @return A si mismo, para facilitar la encadenación de llamadas
	 */
	public ITerminal writeColumn(int x);

	// /////////////////////////////////////////////////////////////////////////
	// métodos de escritura de filas:

	/**
	 * Escribe el caracter <em>character</em> a lo largo de toda la fila
	 * <em>y</em> de la terminal utilizando los colores dados.
	 * 
	 * @param character
	 *            Caracter a escribir en la fila
	 * @param y
	 *            Fila de la terminal en la que se escribirá
	 * @param foregroundColor
	 *            Color de frente con el que se escribirá el caracter
	 * @param backgroundColor
	 *            Color de fondo con el que se escribirá el caracter
	 * @return A si mismo, para facilitar la encadenación de llamadas
	 */
	public ITerminal writeRow(char character, int y, Color foregroundColor,
			Color backgroundColor);

	/**
	 * Escribe el caracter <em>character</em> a lo largo de toda la fila
	 * <em>y</em> de la terminal utilizando el color de frente dado y el color
	 * de fondo por defecto.
	 * 
	 * @param character
	 *            Caracter a escribir en la fila
	 * @param y
	 *            Fila de la terminal en la que se escribirá
	 * @param foregroundColor
	 *            Color de frente con el que se escribirá el caracter
	 * @return A si mismo, para facilitar la encadenación de llamadas
	 */
	public ITerminal writeRow(char character, int y, Color foregroundColor);

	/**
	 * Escribe el caracter <em>character</em> a lo largo de toda la fila
	 * <em>y</em> de la terminal utilizando los colores por defecto.
	 * 
	 * @param character
	 *            Caracter a escribir en la fila
	 * @param y
	 *            Fila de la terminal en la que se escribirá
	 * @return A si mismo, para facilitar la encadenación de llamadas
	 */
	public ITerminal writeRow(char character, int y);

	/**
	 * Escribe un <em>caracter bloque</em> a lo largo de toda la fila <em>y</em>
	 * de la terminal utilizando los colores dados.
	 * 
	 * @param y
	 *            Fila de la terminal en la que se escribirá
	 * @param foregroundColor
	 *            Color de frente con el que se escribirá el caracter
	 * @param backgroundColor
	 *            Color de fondo con el que se escribirá el caracter
	 * @return A si mismo, para facilitar la encadenación de llamadas
	 */
	public ITerminal writeRow(int y, Color foregroundColor,
			Color backgroundColor);

	/**
	 * Escribe un <em>caracter bloque</em> a lo largo de toda la fila <em>y</em>
	 * de la terminal utilizando el color de frente dado. Como color de fondo
	 * utiliza el que tiene por defecto la terminal.
	 * 
	 * @param y
	 *            Fila de la terminal en la que se escribirá
	 * @param foregroundColor
	 *            Color de frente con el que se escribirá el caracter
	 * @return A si mismo, para facilitar la encadenación de llamadas
	 */
	public ITerminal writeRow(int y, Color foregroundColor);

	/**
	 * Escribe un <em>caracter bloque</em> a lo largo de toda la fila <em>y</em>
	 * de la terminal utilizando los colores por defecto.
	 * 
	 * @param y
	 *            Fila de la terminal en la que se escribirá
	 * @return A si mismo, para facilitar la encadenación de llamadas
	 */
	public ITerminal writeRow(int y);

	// /////////////////////////////////////////////////////////////////////////
	// otros métodos:

	/**
	 * Escribe un vector de cadenas de caracteres en un recuadro con los
	 * parámetros dados.
	 * 
	 * @param array
	 *            Vector de cadenas de caracteres a escribir
	 * @param x
	 * @param y
	 * @param foregroundColor
	 * @param backgroundColor
	 * @return A si mismo, para facilitar la encadenación de llamadas
	 */
	public ITerminal writeBox(String[] array, int x, int y,
			Color foregroundColor, Color backgroundColor);

}

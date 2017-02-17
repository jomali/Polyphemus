/*
 * POLYPHEMUS - A simple Java roguelike.
 * Copyright (c) 2014-2017, J. Francisco Martín <jfm.lisaso@gmail.com>.
 */
package jomali.polyphemus.utils;

import java.awt.Color;

/**
 * Interfaz con las diferentes operaciones que debe implementar una terminal de
 * texto para ser utilizada por el sistema de representación gráfica de la
 * aplicación.
 * 
 * 
 * @author J. Francisco Martín
 * @serial 2017/02/01
 * @version 1.0
 * 
 */
public interface RetroTerminal {

	/** Color por defecto de los caracteres. */
	public static final Color DEFAULT_FOREGROUND_COLOR = Color.WHITE;

	/** Color por defecto del fondo de la terminal. */
	public static final Color DEFAULT_BACKGROUND_COLOR = Color.BLACK;

	/** Ancho por defecto (en num. de casillas). */
	public static final int DEFAULT_WIDTH = 80;

	/** Alto por defecto (en num. de casillas). */
	public static final int DEFAULT_HEIGHT = 24;

	// /////////////////////////////////////////////////////////////////////////

	/**
	 * Retorna el ancho de la terminal en numero de casillas.
	 * 
	 * @return Ancho de la terminal en numero de casillas
	 */
	public int getGridWidth();

	/**
	 * Retorna el alto de la terminal en numero de casillas.
	 * 
	 * @return Alto de la terminal en numero de casillas
	 */
	public int getGridHeight();

	/**
	 * Retorna el color de frente utilizado por defecto por la terminal. Si no
	 * se ha especificado uno explícitamente, se debería utilizar
	 * <code>DEFAULT_FOREGROUND_COLOR</code>.
	 * 
	 * @return Color de frente utilizado por defecto
	 */
	public Color getForegroundColor();

	/**
	 * Retorna el color de fondo utilizado por defecto por la terminal. Si no se
	 * ha especificado uno explícitamente, se debería utilizar
	 * <code>DEFAULT_BACKGROUND_COLOR</code>.
	 * 
	 * @return Color de fondo utilizado por defecto
	 */
	public Color getBackgroundColor();

	/**
	 * Establece el color de frente por defecto.
	 * 
	 * @param foregroundColor
	 *            Nuevo color de frente utilizado por defecto
	 */
	public void setForegroundColor(Color foregroundColor);

	/**
	 * Establece el color de fondo por defecto.
	 * 
	 * @param backgroundColor
	 *            Nuevo color de fondo utilizado por defecto
	 */
	public void setBackgroundColor(Color backgroundColor);

	// /////////////////////////////////////////////////////////////////////////
	// Escritura de caracteres:
	
	// TODO - Por implementar

	// /////////////////////////////////////////////////////////////////////////
	// Escritura de cadenas (ref.: esquina superior izquierda):

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia la esquina superior
	 * izquierda de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @param foregroundColor
	 *            Color de frente con el que se imprime la cadena
	 * @param backgroundColor
	 *            Color de fondo con el que se imprime la cadena
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal write(int x, int y, String text, Color foregroundColor, Color backgroundColor);

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia la esquina superior
	 * izquierda de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @param foregroundColor
	 *            Color de frente con el que se imprime la cadena
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal write(int x, int y, String text, Color foregroundColor);

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia la esquina superior
	 * izquierda de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal write(int x, int y, String text);

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia la esquina superior
	 * izquierda de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @param foregroundColor
	 *            Color de frente con el que se imprime la cadena
	 * @param backgroundColor
	 *            Color de fondo con el que se imprime la cadena
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeTopLeft(int x, int y, String text, Color foregroundColor, Color backgroundColor);

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia la esquina superior
	 * izquierda de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @param foregroundColor
	 *            Color de frente con el que se imprime la cadena
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeTopLeft(int x, int y, String text, Color foregroundColor);

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia la esquina superior
	 * izquierda de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeTopLeft(int x, int y, String text);

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia la esquina superior
	 * izquierda de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @param foregroundColor
	 *            Color de frente con el que se imprime la cadena
	 * @param backgroundColor
	 *            Color de fondo con el que se imprime la cadena
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeTL(int x, int y, String text, Color foregroundColor, Color backgroundColor);

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia la esquina superior
	 * izquierda de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @param foregroundColor
	 *            Color de frente con el que se imprime la cadena
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeTL(int x, int y, String text, Color foregroundColor);

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia la esquina superior
	 * izquierda de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeTL(int x, int y, String text);

	// /////////////////////////////////////////////////////////////////////////
	// Escritura de cadenas (ref.: centro superior):

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia el punto central del
	 * lateral superior de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @param foregroundColor
	 *            Color de frente con el que se imprime la cadena
	 * @param backgroundColor
	 *            Color de fondo con el que se imprime la cadena
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeTopCenter(int x, int y, String text, Color foregroundColor, Color backgroundColor);

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia el punto central del
	 * lateral superior de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @param foregroundColor
	 *            Color de frente con el que se imprime la cadena
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeTopCenter(int x, int y, String text, Color foregroundColor);

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia el punto central del
	 * lateral superior de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeTopCenter(int x, int y, String text);

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia el punto central del
	 * lateral superior de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @param foregroundColor
	 *            Color de frente con el que se imprime la cadena
	 * @param backgroundColor
	 *            Color de fondo con el que se imprime la cadena
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeTC(int x, int y, String text, Color foregroundColor, Color backgroundColor);

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia el punto central del
	 * lateral superior de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @param foregroundColor
	 *            Color de frente con el que se imprime la cadena
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeTC(int x, int y, String text, Color foregroundColor);

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia el punto central del
	 * lateral superior de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeTC(int x, int y, String text);

	// /////////////////////////////////////////////////////////////////////////
	// Escritura de cadenas (ref.: esquina superior derecha):

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia la esquina superior
	 * derecha de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @param foregroundColor
	 *            Color de frente con el que se imprime la cadena
	 * @param backgroundColor
	 *            Color de fondo con el que se imprime la cadena
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeTopRight(int x, int y, String text, Color foregroundColor, Color backgroundColor);

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia la esquina superior
	 * derecha de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @param foregroundColor
	 *            Color de frente con el que se imprime la cadena
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeTopRight(int x, int y, String text, Color foregroundColor);

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia la esquina superior
	 * derecha de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeTopRight(int x, int y, String text);

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia la esquina superior
	 * derecha de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @param foregroundColor
	 *            Color de frente con el que se imprime la cadena
	 * @param backgroundColor
	 *            Color de fondo con el que se imprime la cadena
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeTR(int x, int y, String text, Color foregroundColor, Color backgroundColor);

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia la esquina superior
	 * derecha de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @param foregroundColor
	 *            Color de frente con el que se imprime la cadena
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeTR(int x, int y, String text, Color foregroundColor);

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia la esquina superior
	 * derecha de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeTR(int x, int y, String text);

	// /////////////////////////////////////////////////////////////////////////
	// Escritura de cadenas (ref.: centro izquierda):

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia el punto central del
	 * lateral izquierdo de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @param foregroundColor
	 *            Color de frente con el que se imprime la cadena
	 * @param backgroundColor
	 *            Color de fondo con el que se imprime la cadena
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeMiddleLeft(int x, int y, String text, Color foregroundColor, Color backgroundColor);

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia el punto central del
	 * lateral izquierdo de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @param foregroundColor
	 *            Color de frente con el que se imprime la cadena
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeMiddleLeft(int x, int y, String text, Color foregroundColor);

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia el punto central del
	 * lateral izquierdo de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeMiddleLeft(int x, int y, String text);

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia el punto central del
	 * lateral izquierdo de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @param foregroundColor
	 *            Color de frente con el que se imprime la cadena
	 * @param backgroundColor
	 *            Color de fondo con el que se imprime la cadena
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeML(int x, int y, String text, Color foregroundColor, Color backgroundColor);

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia el punto central del
	 * lateral izquierdo de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @param foregroundColor
	 *            Color de frente con el que se imprime la cadena
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeML(int x, int y, String text, Color foregroundColor);

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia el punto central del
	 * lateral izquierdo de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeML(int x, int y, String text);

	// /////////////////////////////////////////////////////////////////////////
	// Escritura de cadenas (ref.: centro):

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia el punto central de
	 * la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @param foregroundColor
	 *            Color de frente con el que se imprime la cadena
	 * @param backgroundColor
	 *            Color de fondo con el que se imprime la cadena
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeMiddleCenter(int x, int y, String text, Color foregroundColor, Color backgroundColor);

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia el punto central de
	 * la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @param foregroundColor
	 *            Color de frente con el que se imprime la cadena
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeMiddleCenter(int x, int y, String text, Color foregroundColor);

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia el punto central de
	 * la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeMiddleCenter(int x, int y, String text);

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia el punto central de
	 * la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @param foregroundColor
	 *            Color de frente con el que se imprime la cadena
	 * @param backgroundColor
	 *            Color de fondo con el que se imprime la cadena
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeMC(int x, int y, String text, Color foregroundColor, Color backgroundColor);

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia el punto central de
	 * la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @param foregroundColor
	 *            Color de frente con el que se imprime la cadena
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeMC(int x, int y, String text, Color foregroundColor);

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia el punto central de
	 * la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeMC(int x, int y, String text);

	// /////////////////////////////////////////////////////////////////////////
	// Escritura de cadenas (ref.: centro derecha):

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia el punto central del
	 * lateral derecho de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @param foregroundColor
	 *            Color de frente con el que se imprime la cadena
	 * @param backgroundColor
	 *            Color de fondo con el que se imprime la cadena
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeMiddleRight(int x, int y, String text, Color foregroundColor, Color backgroundColor);

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia el punto central del
	 * lateral derecho de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @param foregroundColor
	 *            Color de frente con el que se imprime la cadena
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeMiddleRight(int x, int y, String text, Color foregroundColor);

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia el punto central del
	 * lateral derecho de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeMiddleRight(int x, int y, String text);

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia el punto central del
	 * lateral derecho de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @param foregroundColor
	 *            Color de frente con el que se imprime la cadena
	 * @param backgroundColor
	 *            Color de fondo con el que se imprime la cadena
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeMR(int x, int y, String text, Color foregroundColor, Color backgroundColor);

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia el punto central del
	 * lateral derecho de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @param foregroundColor
	 *            Color de frente con el que se imprime la cadena
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeMR(int x, int y, String text, Color foregroundColor);

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia el punto central del
	 * lateral derecho de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeMR(int x, int y, String text);

	// /////////////////////////////////////////////////////////////////////////
	// Escritura de cadenas (ref.: esquina inferior izquierda):

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia la esquina inferior
	 * izquierda de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @param foregroundColor
	 *            Color de frente con el que se imprime la cadena
	 * @param backgroundColor
	 *            Color de fondo con el que se imprime la cadena
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeBottomLeft(int x, int y, String text, Color foregroundColor, Color backgroundColor);

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia la esquina inferior
	 * izquierda de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @param foregroundColor
	 *            Color de frente con el que se imprime la cadena
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeBottomLeft(int x, int y, String text, Color foregroundColor);

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia la esquina inferior
	 * izquierda de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeBottomLeft(int x, int y, String text);

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia la esquina inferior
	 * izquierda de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @param foregroundColor
	 *            Color de frente con el que se imprime la cadena
	 * @param backgroundColor
	 *            Color de fondo con el que se imprime la cadena
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeBL(int x, int y, String text, Color foregroundColor, Color backgroundColor);

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia la esquina inferior
	 * izquierda de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @param foregroundColor
	 *            Color de frente con el que se imprime la cadena
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeBL(int x, int y, String text, Color foregroundColor);

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia la esquina inferior
	 * izquierda de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeBL(int x, int y, String text);

	// /////////////////////////////////////////////////////////////////////////
	// Escritura de cadenas (ref.: centro inferior):

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia el punto central del
	 * lateral inferior de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @param foregroundColor
	 *            Color de frente con el que se imprime la cadena
	 * @param backgroundColor
	 *            Color de fondo con el que se imprime la cadena
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeBottomCenter(int x, int y, String text, Color foregroundColor, Color backgroundColor);

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia el punto central del
	 * lateral inferior de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @param foregroundColor
	 *            Color de frente con el que se imprime la cadena
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeBottomCenter(int x, int y, String text, Color foregroundColor);

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia el punto central del
	 * lateral inferior de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeBottomCenter(int x, int y, String text);

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia el punto central del
	 * lateral inferior de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @param foregroundColor
	 *            Color de frente con el que se imprime la cadena
	 * @param backgroundColor
	 *            Color de fondo con el que se imprime la cadena
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeBC(int x, int y, String text, Color foregroundColor, Color backgroundColor);

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia el punto central del
	 * lateral inferior de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @param foregroundColor
	 *            Color de frente con el que se imprime la cadena
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeBC(int x, int y, String text, Color foregroundColor);

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia el punto central del
	 * lateral inferior de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeBC(int x, int y, String text);

	// /////////////////////////////////////////////////////////////////////////
	// Escritura de cadenas (ref.: esquina inferior derecha):

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia la esquina inferior
	 * derecha de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @param foregroundColor
	 *            Color de frente con el que se imprime la cadena
	 * @param backgroundColor
	 *            Color de fondo con el que se imprime la cadena
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeBottomRight(int x, int y, String text, Color foregroundColor, Color backgroundColor);

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia la esquina inferior
	 * derecha de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @param foregroundColor
	 *            Color de frente con el que se imprime la cadena
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeBottomRight(int x, int y, String text, Color foregroundColor);

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia la esquina inferior
	 * derecha de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeBottomRight(int x, int y, String text);

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia la esquina inferior
	 * derecha de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @param foregroundColor
	 *            Color de frente con el que se imprime la cadena
	 * @param backgroundColor
	 *            Color de fondo con el que se imprime la cadena
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeBR(int x, int y, String text, Color foregroundColor, Color backgroundColor);

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia la esquina inferior
	 * derecha de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @param foregroundColor
	 *            Color de frente con el que se imprime la cadena
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeBR(int x, int y, String text, Color foregroundColor);

	/**
	 * Escribe una cadena de caracteres en la terminal utilizando el conjunto de
	 * parámetros dados. Utiliza como origen de referencia la esquina inferior
	 * derecha de la terminal.
	 * 
	 * @param x
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje X
	 * @param y
	 *            Posición de inicio con respecto al origen de referencia en el
	 *            eje Y
	 * @param text
	 *            Cadena de caracteres a escribir
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public RetroTerminal writeBR(int x, int y, String text);

}

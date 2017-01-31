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
 * @serial 2017/01/30
 * @version 1.0
 * 
 */
public interface IRetroTerminal {

	/** Color por defecto de los caracteres. */
	public static final Color DEFAULT_FOREGROUND_COLOR = Color.WHITE;

	/** Color por defecto del fondo de la terminal. */
	public static final Color DEFAULT_BACKGROUND_COLOR = Color.BLACK;

	/** Color por defecto para el estilo resaltado. */
	public static final Color DEFAULT_EMPHASIS_COLOR = Color.GRAY;

	/**
	 * Ancho (en num. de casillas) si no se especifica uno en el constructor.
	 */
	public static final int DEFAULT_WIDTH = 80;

	/** Alto (en num. de casillas) si no se especifica uno en el constructor. */
	public static final int DEFAULT_HEIGHT = 24;

	// /////////////////////////////////////////////////////////////////////////
	// Escritura de caracteres:

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
	 * @param emphasisColor
	 *            Color de frente para el estilo resaltado
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public IRetroTerminal write(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor);

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
	public IRetroTerminal write(int x, int y, String text, Color foregroundColor, Color backgroundColor);

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
	public IRetroTerminal write(int x, int y, String text, Color foregroundColor);

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
	public IRetroTerminal write(int x, int y, String text);

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
	 * @param emphasisColor
	 *            Color de frente para el estilo resaltado
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public IRetroTerminal writeTopLeft(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor);

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
	public IRetroTerminal writeTopLeft(int x, int y, String text, Color foregroundColor, Color backgroundColor);

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
	public IRetroTerminal writeTopLeft(int x, int y, String text, Color foregroundColor);

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
	public IRetroTerminal writeTopLeft(int x, int y, String text);

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
	 * @param emphasisColor
	 *            Color de frente para el estilo resaltado
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public IRetroTerminal writeTL(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor);

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
	public IRetroTerminal writeTL(int x, int y, String text, Color foregroundColor, Color backgroundColor);

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
	public IRetroTerminal writeTL(int x, int y, String text, Color foregroundColor);

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
	public IRetroTerminal writeTL(int x, int y, String text);

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
	 * @param emphasisColor
	 *            Color de frente para el estilo resaltado
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public IRetroTerminal writeTopCenter(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor);

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
	public IRetroTerminal writeTopCenter(int x, int y, String text, Color foregroundColor, Color backgroundColor);

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
	public IRetroTerminal writeTopCenter(int x, int y, String text, Color foregroundColor);

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
	public IRetroTerminal writeTopCenter(int x, int y, String text);

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
	 * @param emphasisColor
	 *            Color de frente para el estilo resaltado
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public IRetroTerminal writeTC(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor);

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
	public IRetroTerminal writeTC(int x, int y, String text, Color foregroundColor, Color backgroundColor);

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
	public IRetroTerminal writeTC(int x, int y, String text, Color foregroundColor);

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
	public IRetroTerminal writeTC(int x, int y, String text);

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
	 * @param emphasisColor
	 *            Color de frente para el estilo resaltado
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public IRetroTerminal writeTopRight(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor);

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
	public IRetroTerminal writeTopRight(int x, int y, String text, Color foregroundColor, Color backgroundColor);

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
	public IRetroTerminal writeTopRight(int x, int y, String text, Color foregroundColor);

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
	public IRetroTerminal writeTopRight(int x, int y, String text);

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
	 * @param emphasisColor
	 *            Color de frente para el estilo resaltado
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public IRetroTerminal writeTR(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor);

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
	public IRetroTerminal writeTR(int x, int y, String text, Color foregroundColor, Color backgroundColor);

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
	public IRetroTerminal writeTR(int x, int y, String text, Color foregroundColor);

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
	public IRetroTerminal writeTR(int x, int y, String text);

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
	 * @param emphasisColor
	 *            Color de frente para el estilo resaltado
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public IRetroTerminal writeMiddleLeft(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor);

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
	public IRetroTerminal writeMiddleLeft(int x, int y, String text, Color foregroundColor, Color backgroundColor);

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
	public IRetroTerminal writeMiddleLeft(int x, int y, String text, Color foregroundColor);

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
	public IRetroTerminal writeMiddleLeft(int x, int y, String text);

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
	 * @param emphasisColor
	 *            Color de frente para el estilo resaltado
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public IRetroTerminal writeML(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor);

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
	public IRetroTerminal writeML(int x, int y, String text, Color foregroundColor, Color backgroundColor);

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
	public IRetroTerminal writeML(int x, int y, String text, Color foregroundColor);

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
	public IRetroTerminal writeML(int x, int y, String text);

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
	 * @param emphasisColor
	 *            Color de frente para el estilo resaltado
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public IRetroTerminal writeMiddleCenter(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor);

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
	public IRetroTerminal writeMiddleCenter(int x, int y, String text, Color foregroundColor, Color backgroundColor);

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
	public IRetroTerminal writeMiddleCenter(int x, int y, String text, Color foregroundColor);

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
	public IRetroTerminal writeMiddleCenter(int x, int y, String text);

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
	 * @param emphasisColor
	 *            Color de frente para el estilo resaltado
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public IRetroTerminal writeMC(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor);

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
	public IRetroTerminal writeMC(int x, int y, String text, Color foregroundColor, Color backgroundColor);

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
	public IRetroTerminal writeMC(int x, int y, String text, Color foregroundColor);

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
	public IRetroTerminal writeMC(int x, int y, String text);

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
	 * @param emphasisColor
	 *            Color de frente para el estilo resaltado
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public IRetroTerminal writeMiddleRight(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor);

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
	public IRetroTerminal writeMiddleRight(int x, int y, String text, Color foregroundColor, Color backgroundColor);

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
	public IRetroTerminal writeMiddleRight(int x, int y, String text, Color foregroundColor);

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
	public IRetroTerminal writeMiddleRight(int x, int y, String text);

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
	 * @param emphasisColor
	 *            Color de frente para el estilo resaltado
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public IRetroTerminal writeMR(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor);

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
	public IRetroTerminal writeMR(int x, int y, String text, Color foregroundColor, Color backgroundColor);

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
	public IRetroTerminal writeMR(int x, int y, String text, Color foregroundColor);

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
	public IRetroTerminal writeMR(int x, int y, String text);

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
	 * @param emphasisColor
	 *            Color de frente para el estilo resaltado
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public IRetroTerminal writeBottomLeft(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor);

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
	public IRetroTerminal writeBottomLeft(int x, int y, String text, Color foregroundColor, Color backgroundColor);

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
	public IRetroTerminal writeBottomLeft(int x, int y, String text, Color foregroundColor);

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
	public IRetroTerminal writeBottomLeft(int x, int y, String text);

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
	 * @param emphasisColor
	 *            Color de frente para el estilo resaltado
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public IRetroTerminal writeBL(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor);

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
	public IRetroTerminal writeBL(int x, int y, String text, Color foregroundColor, Color backgroundColor);

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
	public IRetroTerminal writeBL(int x, int y, String text, Color foregroundColor);

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
	public IRetroTerminal writeBL(int x, int y, String text);

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
	 * @param emphasisColor
	 *            Color de frente para el estilo resaltado
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public IRetroTerminal writeBottomCenter(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor);

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
	public IRetroTerminal writeBottomCenter(int x, int y, String text, Color foregroundColor, Color backgroundColor);

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
	public IRetroTerminal writeBottomCenter(int x, int y, String text, Color foregroundColor);

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
	public IRetroTerminal writeBottomCenter(int x, int y, String text);

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
	 * @param emphasisColor
	 *            Color de frente para el estilo resaltado
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public IRetroTerminal writeBC(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor);

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
	public IRetroTerminal writeBC(int x, int y, String text, Color foregroundColor, Color backgroundColor);

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
	public IRetroTerminal writeBC(int x, int y, String text, Color foregroundColor);

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
	public IRetroTerminal writeBC(int x, int y, String text);

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
	 * @param emphasisColor
	 *            Color de frente para el estilo resaltado
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public IRetroTerminal writeBottomRight(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor);


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
	public IRetroTerminal writeBottomRight(int x, int y, String text, Color foregroundColor, Color backgroundColor);


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
	public IRetroTerminal writeBottomRight(int x, int y, String text, Color foregroundColor);


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
	public IRetroTerminal writeBottomRight(int x, int y, String text);


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
	 * @param emphasisColor
	 *            Color de frente para el estilo resaltado
	 * @return A si mismo, para facilitar la encadenación de llamdas.
	 */
	public IRetroTerminal writeBR(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor);


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
	public IRetroTerminal writeBR(int x, int y, String text, Color foregroundColor, Color backgroundColor);


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
	public IRetroTerminal writeBR(int x, int y, String text, Color foregroundColor);


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
	public IRetroTerminal writeBR(int x, int y, String text);

}

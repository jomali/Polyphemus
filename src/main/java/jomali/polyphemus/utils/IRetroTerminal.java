/*
 * POLYPHEMUS - A simple Java roguelike.
 * Copyright (c) 2014-2017, J. Francisco Martín <jfm.lisaso@gmail.com>.
 */
package jomali.polyphemus.utils;

import com.badlogic.gdx.graphics.Color;

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

	public IRetroTerminal writeMiddleCenter(int x, int y, String text, Color foregroundColor);

	public IRetroTerminal writeMiddleCenter(int x, int y, String text);

	public IRetroTerminal writeMC(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor);

	public IRetroTerminal writeMC(int x, int y, String text, Color foregroundColor, Color backgroundColor);

	public IRetroTerminal writeMC(int x, int y, String text, Color foregroundColor);

	public IRetroTerminal writeMC(int x, int y, String text);

	// /////////////////////////////////////////////////////////////////////////
	// Escritura de cadenas (ref.: centro derecha):

	public IRetroTerminal writeMiddleRight(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor);

	public IRetroTerminal writeMiddleRight(int x, int y, String text, Color foregroundColor, Color backgroundColor);

	public IRetroTerminal writeMiddleRight(int x, int y, String text, Color foregroundColor);

	public IRetroTerminal writeMiddleRight(int x, int y, String text);

	public IRetroTerminal writeMR(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor);

	public IRetroTerminal writeMR(int x, int y, String text, Color foregroundColor, Color backgroundColor);

	public IRetroTerminal writeMR(int x, int y, String text, Color foregroundColor);

	public IRetroTerminal writeMR(int x, int y, String text);

	// /////////////////////////////////////////////////////////////////////////
	// Escritura de cadenas (ref.: esquina inferior izquierda):

	public IRetroTerminal writeBottomLeft(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor);

	public IRetroTerminal writeBottomLeft(int x, int y, String text, Color foregroundColor, Color backgroundColor);

	public IRetroTerminal writeBottomLeft(int x, int y, String text, Color foregroundColor);

	public IRetroTerminal writeBottomLeft(int x, int y, String text);

	public IRetroTerminal writeBL(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor);

	public IRetroTerminal writeBL(int x, int y, String text, Color foregroundColor, Color backgroundColor);

	public IRetroTerminal writeBL(int x, int y, String text, Color foregroundColor);

	public IRetroTerminal writeBL(int x, int y, String text);

	// /////////////////////////////////////////////////////////////////////////
	// Escritura de cadenas (ref.: centro inferior):

	public IRetroTerminal writeBottomCenter(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor);

	public IRetroTerminal writeBottomCenter(int x, int y, String text, Color foregroundColor, Color backgroundColor);

	public IRetroTerminal writeBottomCenter(int x, int y, String text, Color foregroundColor);

	public IRetroTerminal writeBottomCenter(int x, int y, String text);

	public IRetroTerminal writeBC(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor);

	public IRetroTerminal writeBC(int x, int y, String text, Color foregroundColor, Color backgroundColor);

	public IRetroTerminal writeBC(int x, int y, String text, Color foregroundColor);

	public IRetroTerminal writeBC(int x, int y, String text);

	// /////////////////////////////////////////////////////////////////////////
	// Escritura de cadenas (ref.: esquina inferior derecha):

	public IRetroTerminal writeBottomRight(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor);

	public IRetroTerminal writeBottomRight(int x, int y, String text, Color foregroundColor, Color backgroundColor);

	public IRetroTerminal writeBottomRight(int x, int y, String text, Color foregroundColor);

	public IRetroTerminal writeBottomRight(int x, int y, String text);

	public IRetroTerminal writeBR(int x, int y, String text, Color foregroundColor, Color backgroundColor,
			Color emphasisColor);

	public IRetroTerminal writeBR(int x, int y, String text, Color foregroundColor, Color backgroundColor);

	public IRetroTerminal writeBR(int x, int y, String text, Color foregroundColor);

	public IRetroTerminal writeBR(int x, int y, String text);

	// **Escritura de caracteres:**
	// - write(alignment : Alignment, character : char, x : int, y : int,
	// foregroundColor : Color, backgroundColor : Color)

}

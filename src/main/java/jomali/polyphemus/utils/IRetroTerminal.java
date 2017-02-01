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
public interface IRetroTerminal {

	/** Color por defecto de los caracteres. */
	public static final Color DEFAULT_FOREGROUND_COLOR = Color.WHITE;

	/** Color por defecto del fondo de la terminal. */
	public static final Color DEFAULT_BACKGROUND_COLOR = Color.BLACK;

	/** Color por defecto auxiliar 1. */
	public static final Color DEFAULT_USER1_COLOR = Color.GRAY;

	/** Color por defecto auxiliar 2. */
	public static final Color DEFAULT_USER2_COLOR = Color.BLACK;

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
	 * Retorna el color de frente utilizado por defecto por la terminal al
	 * utilizar el estilo enfatizado. Si no se ha especificado uno
	 * explícitamente, se debería utilizar <code>DEFAULT_USER1_COLOR</code>.
	 * 
	 * @return Color de frente del estilo enfatizado utilizado por defecto
	 */
	public Color getEmphasisColor();

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

	/**
	 * Establece el color de frente por defecto del estilo enfatizado.
	 * 
	 * @param emphasisColor
	 *            Nuevo color del estilo enfatizado por defecto
	 */
	public void setEmphasisColor(Color emphasisColor);

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

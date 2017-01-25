/*
 * POLYPHEMUS - A simple Java roguelike.
 * Copyright (c) 2014-2017, J. Francisco Martín <jfm.lisaso@gmail.com>.
 */
package jomali.polyphemus.geography;

import java.util.Map;

/**
 * El entorno de juego se representa como múltiples matrices de casillas de dos
 * dimensiones; un conjunto de <em>z</em> planos con coordenadas <em>x</em> e
 * <em>y</em>.
 * 
 * 
 * @author J. Francisco Martín
 * @author Trystan Spangler
 * @serial 2017/01/24
 *
 */
public class GameMap {

	/** Representa la matriz de casillas utilizada como entorno de juego. */
	private Map<Point, Tile> tiles;

	/** Ancho de la matriz. */
	private int width;

	/** Alto de la matriz. */
	private int height;

	/** Profundidad de la matriz. */
	private int depth;

	/**
	 * Constructor. Crea un nuevo entorno de juego a partir de los parámetros
	 * dados.
	 * 
	 * @param tiles
	 *            Mapa con que se representa la matriz de casillas utilizada
	 *            como entorno de juego.
	 * @param width
	 *            Anchura de los planos del entorno de juego
	 * @param height
	 *            Altura de los planos del entorno de juego
	 * @param depth
	 *            Número de planos
	 */
	public GameMap(Map<Point, Tile> tiles, int width, int height, int depth) {
		this.tiles = tiles;
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	// /////////////////////////////////////////////////////////////////////////

	/**
	 * @return El mapa utilizado para representar la matriz de casillas que
	 *         conforma el entorno de juego
	 */
	public Map<Point, Tile> getTiles() {
		return tiles;
	}

	/**
	 * @return El ancho de los planos del entorno de juego
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @return El alto de los planos del entorno de juego
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @return El número de planos del entorno de juego
	 */
	public int getDepth() {
		return depth;
	}

	/**
	 * Retorna la casilla que ocupa la posición indicada.
	 * 
	 * @param x
	 * @param y
	 * @param z
	 * @return Casilla que ocupa la posición <em>(x, y, z)</em>
	 */
	public Tile getTile(int x, int y, int z) {
		return tiles.get(new Point(x, y, z));
	}

}

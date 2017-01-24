/*
 * POLYPHEMUS - A simple Java roguelike.
 * Copyright (c) 2014-2017, J. Francisco Martín <jfm.lisaso@gmail.com>.
 */
package jomali.polyphemus.geography;

/**
 * El entorno de juego se representa como una matriz de casillas de tres
 * dimensiones.
 * 
 * 
 * @author J. Francisco Martín
 * @author Trystan Spangler
 * @serial 2017/01/24
 *
 */
public class GameMap {

	/** Matriz de casillas de 3D que conforma el entorno de juego. */
	private Tile[][][] tiles;

	/** Ancho de la matriz. */
	private int width;

	/** Alto de la matriz. */
	private int height;

	/** Profundidad de la matriz. */
	private int depth;

	/**
	 * Constructor. Crea un nuevo entorno de juego a partir de la matriz de
	 * casillas dada.
	 * 
	 * @param tiles
	 *            Matriz de casillas que representa el entorno de juego
	 */
	public GameMap(Tile[][][] tiles) {
		this.tiles = tiles;
		this.width = tiles.length;
		this.height = tiles[0].length;
		this.depth = tiles[0][0].length;
	}

	// /////////////////////////////////////////////////////////////////////////

	/**
	 * @return La matriz de casillas de tres dimensiones que representa el
	 *         entorno de juego
	 */
	public Tile[][][] getTiles() {
		return tiles;
	}

	/**
	 * @return El ancho de la matriz de casillas
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @return El alto de la matriz de casillas
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @return La profundidad de la matriz de casillas
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
		return tiles[x][y][z];
	}

}

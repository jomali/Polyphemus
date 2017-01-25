/*
 * POLYPHEMUS - A simple Java roguelike.
 * Copyright (c) 2014-2017, J. Francisco Martín <jfm.lisaso@gmail.com>.
 */
package jomali.polyphemus.geography;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Representación de un punto en múltiples planos (<em>z</em> planos) de dos
 * dimensiones (<em>x</em> e <em>y</em>). La clase sobreescribe los métodos
 * <code>hashCode()</code> e <code>equals()</code>, puesto que dos puntos
 * diferentes que representan una misma posición del espacio deben ser
 * considerados iguales ---a este tipo de objetos se les conoce como
 * <em><a href="http://wiki.c2.com/?ValueObject">value objects</a></em>, en
 * contraposición a los <em>reference objects</em>---.
 * 
 * 
 * @author J. Francisco Martín
 * @author Trystan Spangler
 * @serial 2017/01/25
 *
 */
public class Point {

	/** Coordenada <em>x</em>. */
	public int x;

	/** Coordenada <em>y</em>. */
	public int y;

	/** Coordenada <em>z</em>. */
	public int z;

	/**
	 * Constructor. Crea un nuevo punto a partir de las coordenadas pasadas como
	 * parámetro.
	 * 
	 * @param x
	 * @param y
	 * @param z
	 */
	public Point(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	/**
	 * Retorna la lista de puntos que se encuentran a una distancia del punto
	 * igual o menor a <em>n</em>, en su mismo plano <em>z</em>.
	 * 
	 * @param n
	 * @return Lista de puntos que se encuentran a una distancia del punto igual
	 *         o menor a <em>n</em>, en su mismo plano <em>z</em>
	 */
	public List<Point> neighbors(int n) {
		List<Point> result = new ArrayList<>();
		int nx, ny;
		for (int oy = 0; oy <= n; oy++) {
			for (int ox = -(n - oy); ox <= (n - oy); ox++) {
				if (ox == 0 && oy == 0)
					continue;
				nx = x + ox;
				ny = y + oy;
				result.add(new Point(nx, ny, z));
			}
		}
		for (int oy = -1; oy >= -n; oy--) {
			for (int ox = -(n + oy); ox <= (n + oy); ox++) {
				nx = x + ox;
				ny = y + oy;
				result.add(new Point(nx, ny, z));
			}
		}
		// Se desordena la lista antes de retornarla para no introducir
		// parcialidad. De otro modo, el punto del extremo izquierdo del
		// diamante de vecinos se comprobaría siempre el primero mientras que el
		// del extremo inferior del diamante el último, lo que puede conducir a
		// comportamientos extraños o indeseados:
		Collections.shuffle(result);
		return result;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "(" + x + ", " + y + ", " + z + ")";
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		result = prime * result + z;
		return result;
	}

	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Point other = (Point) obj;
		if (x != other.x) {
			return false;
		}
		if (y != other.y) {
			return false;
		}
		if (z != other.z) {
			return false;
		}
		return true;
	}

}

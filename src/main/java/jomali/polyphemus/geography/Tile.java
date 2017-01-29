/*
 * POLYPHEMUS - A simple Java roguelike.
 * Copyright (c) 2014-2017, J. Francisco Martín <jfm.lisaso@gmail.com>.
 */
package jomali.polyphemus.geography;

import jomali.polyphemus.GameEntity;

public class Tile extends GameEntity {

	private boolean accesible;
	private boolean destroyable;

	public Tile(Type type) {
		super(type);
		this.accesible = false;
		this.destroyable = false;
	}

	/**
	 * @return the accesible
	 */
	public boolean isAccesible() {
		return accesible;
	}

	/**
	 * @return the destroyable
	 */
	public boolean isDestroyable() {
		return destroyable;
	}

	/**
	 * @param accesible
	 *            the accesible to set
	 */
	public void setAccesible(boolean accesible) {
		this.accesible = accesible;
	}

	/**
	 * @param destroyable
	 *            the destroyable to set
	 */
	public void setDestroyable(boolean destroyable) {
		this.destroyable = destroyable;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (accesible ? 1231 : 1237);
		result = prime * result + (destroyable ? 1231 : 1237);
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tile other = (Tile) obj;
		if (accesible != other.accesible)
			return false;
		if (destroyable != other.destroyable)
			return false;
		if (type != other.type)
			return false;
		return true;
	}

}

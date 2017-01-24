/*
 * POLYPHEMUS - A simple Java roguelike.
 * Copyright (c) 2014-2017, J. Francisco Martín <jfm.lisaso@gmail.com>.
 */
package jomali.polyphemus.geography;

import java.awt.Color;

import jomali.polyphemus.components.VisualRepresentationComponent;

public class Tile {

	private VisualRepresentationComponent representation;
	private boolean accesible;
	private boolean destroyable;
	
	public Tile(char glyph, String description, Color foregroundColor) {
		this.representation = new VisualRepresentationComponent();
		this.representation.glyph = glyph;
		this.representation.foregroundColor = foregroundColor;
		this.accesible = false;
		this.destroyable = false;
	}

	public Tile(VisualRepresentationComponent representation) {
		this.representation = representation;
		this.accesible = false;
		this.destroyable = false;
	}

	public VisualRepresentationComponent getRepresentation() {
		return representation;
	}

	public void setRepresentation(VisualRepresentationComponent representation) {
		this.representation = representation;
	}

	public boolean isAccesible() {
		return accesible;
	}

	public void setAccesible(boolean accesible) {
		this.accesible = accesible;
	}

	public boolean isDestroyable() {
		return destroyable;
	}

	public void setDestroyable(boolean destroyable) {
		this.destroyable = destroyable;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (accesible ? 1231 : 1237);
		result = prime * result + (destroyable ? 1231 : 1237);
		result = prime * result + ((representation == null) ? 0 : representation.hashCode());
		return result;
	}

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
		if (representation == null) {
			if (other.representation != null)
				return false;
		} else if (!representation.equals(other.representation))
			return false;
		return true;
	}

}

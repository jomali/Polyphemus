package jomali.polyphemus.components;

import java.awt.Color;

import com.badlogic.ashley.core.Component;

public class VisualRepresentationComponent implements Component {

	public char glyph;
	public Color foregroundColor;
	public Color backgroundColor;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((backgroundColor == null) ? 0 : backgroundColor.hashCode());
		result = prime * result + ((foregroundColor == null) ? 0 : foregroundColor.hashCode());
		result = prime * result + glyph;
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
		VisualRepresentationComponent other = (VisualRepresentationComponent) obj;
		if (backgroundColor == null) {
			if (other.backgroundColor != null)
				return false;
		} else if (!backgroundColor.equals(other.backgroundColor))
			return false;
		if (foregroundColor == null) {
			if (other.foregroundColor != null)
				return false;
		} else if (!foregroundColor.equals(other.foregroundColor))
			return false;
		if (glyph != other.glyph)
			return false;
		return true;
	}

}

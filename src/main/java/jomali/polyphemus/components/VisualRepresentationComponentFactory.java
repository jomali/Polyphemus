package jomali.polyphemus.components;

import java.awt.Color;

public class VisualRepresentationComponentFactory {

	public static VisualRepresentationComponent createFloorTile() {
		VisualRepresentationComponent representation = new VisualRepresentationComponent();
		representation.glyph = '.';
		representation.foregroundColor = Color.LIGHT_GRAY;
		return representation;
	}

	public static VisualRepresentationComponent createWallTile() {
		VisualRepresentationComponent representation = new VisualRepresentationComponent();
		representation.glyph = '#';
		representation.foregroundColor = Color.LIGHT_GRAY;
		return representation;
	}

	public static VisualRepresentationComponent createWaterTile() {
		VisualRepresentationComponent representation = new VisualRepresentationComponent();
		representation.glyph = '~';
		representation.foregroundColor = Color.BLUE;
		return representation;
	}

	public static VisualRepresentationComponent createPlayer() {
		VisualRepresentationComponent representation = new VisualRepresentationComponent();
		representation.glyph = '@';
		representation.foregroundColor = Color.RED;
		return representation;
	}
	
}

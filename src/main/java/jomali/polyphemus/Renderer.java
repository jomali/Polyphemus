package jomali.polyphemus;

public class Renderer {

	public char getGlyph(GameEntity entity) {
		char glyph ;
		switch (entity.getType()) {
			case TILE_FLOOR:
				glyph = '.';
				break;
			case TILE_STAIRS_DOWN:
				glyph = '>';
				break;
			case TILE_STAIRS_UP:
				glyph = '<';
				break;
			case TILE_WALL:
				glyph = '#';
				break;
			case TILE_WATER:
				glyph = '~';
				break;
			default:
				glyph = ' ';
				break;
		}
		return glyph;
	}
}

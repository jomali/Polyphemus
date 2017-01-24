package jomali.polyphemus.geography;

import java.awt.Color;

public class TileFactory {
	
	private static Tile floor;
	private static Tile wall;
	
	public static Tile getFloor() {
		if (floor == null) {
			floor = new Tile('.', "A dirt floor", Color.LIGHT_GRAY);
			floor.setAccesible(true);
			floor.setDestroyable(false);
		}
		return floor;
	}
	
	public static Tile getWall() {
		if (wall == null) {
			wall = new Tile('#', "A dirt wall", Color.LIGHT_GRAY);
			wall.setAccesible(false);
			wall.setDestroyable(false);
		}
		return wall;
	}

}

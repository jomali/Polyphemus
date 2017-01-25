package jomali.polyphemus.geography;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

import jomali.polyphemus.components.VisualRepresentationComponentFactory;

public class GameMapBuilder {

	private Map<Point, Tile> tiles;
	private int width, height, depth;

	public GameMapBuilder(int width, int height, int depth) {
		this.tiles = new HashMap<>();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	private GameMapBuilder createFrame(Tile tile) {
		for (int z = 0; z < depth; z++) {
			for (int x = 0; x < width; x++) {
				tiles.put(new Point(x, 0, z), tile);
				tiles.put(new Point(x, (height - 1), z), tile);
			}
			for (int y = 0; y < height; y++) {
				tiles.put(new Point(0, y, z), tile);
				tiles.put(new Point((width - 1), y, z), tile);
			}
		}
		return this;
	}

	private GameMapBuilder createRiver(Tile tile, int size) {
		int randomNum = ThreadLocalRandom.current().nextInt(0, height - size);
		for (int z = 0; z < depth; z++) {
			for (int x = 0; x < width; x++) {
				for (int y = 0; y < size; y++) {
					tiles.put(new Point(x, (y + randomNum), z), tile);
				}

			}
		}
		return this;
	}

	private GameMapBuilder fillSpace(Tile tile) {
		for (int z = 0; z < depth; z++) {
			for (int y = 0; y < height; y++) {
				for (int x = 0; x < width; x++) {
					tiles.put(new Point(x, y, z), tile);
				}
			}
		}
		return this;
	}

	public GameMap build() {
		Tile wall = new Tile(VisualRepresentationComponentFactory.createWallTile());
		wall.setAccesible(false);
		wall.setDestroyable(false);
		createFrame(wall);
		return new GameMap(tiles, width, height, depth);
	}

	public GameMapBuilder makeFields(int riverSize) {
		Tile floor = new Tile(VisualRepresentationComponentFactory.createFloorTile());
		floor.setAccesible(true);
		floor.setDestroyable(false);
		Tile river = new Tile(VisualRepresentationComponentFactory.createWaterTile());
		river.setAccesible(false);
		river.setDestroyable(false);
		return fillSpace(floor).createRiver(river, riverSize);
	}

}

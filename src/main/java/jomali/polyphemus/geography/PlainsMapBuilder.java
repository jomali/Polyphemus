package jomali.polyphemus.geography;

public class PlainsMapBuilder {

	private int width, height, depth;
	private Tile[][][] tiles;

	public PlainsMapBuilder(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
		this.tiles = new Tile[width][height][depth];
	}

	private PlainsMapBuilder createFrame(Tile tile) {
		for (int z = 0; z < depth; z++) {
			for (int x = 0; x < width; x++) {
				tiles[x][0][z] = tile;
				tiles[x][height - 1][z] = tile;
			}
			for (int y = 0; y < height; y++) {
				tiles[0][y][z] = tile;
				tiles[width - 1][y][z] = tile;
			}
		}
		return this;
	}
	
	private PlainsMapBuilder fillSpace(Tile tile) {
		for (int z = 0; z < depth; z++) {
			for (int y = 0; y < height; y++) {
				for (int x = 0; x < width; x++) {
					tiles[x][y][z] = tile;
				}
			}
		}
		return this;
	}
	
	public GameMap build() {
		return new GameMap(tiles);
	}
	
	public PlainsMapBuilder makeFields() {
		return fillSpace(TileFactory.getFloor()).createFrame(TileFactory.getWall());
	}

}

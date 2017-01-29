package jomali.polyphemus;

public abstract class GameEntity {
	
	public static enum Type {

		// Creatures
		CREATURE_PLAYER,
		// Tiles
		TILE_FLOOR,
		TILE_STAIRS_DOWN,
		TILE_STAIRS_UP,
		TILE_WALL,
		TILE_WATER,
	}
	
	protected Type type;
	
	public GameEntity(Type type) {
		this.type = type;
	}
	
	public Type getType() {
		return type;
	}

}

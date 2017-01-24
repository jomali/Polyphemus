package jomali.polyphemus.geography;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameMapTest {
	
	private void printMap(GameMap map) {
		Tile[][][] tiles = map.getTiles();
		
		for (int z = 0; z < map.getDepth(); z++) {
			System.out.println("\nLEVEL " + z);
			
			for (int y = 0; y < map.getHeight(); y++) {
				for (int x = 0; x < map.getWidth(); x++) {
					System.out.print(tiles[x][y][0].getRepresentation().glyph);
				}
				System.out.println();
			}
		}
	}

	@Test
	public void test() {
		GameMap map = new PlainsMapBuilder(80, 32, 5).makeFields().build();
		
		Tile expectedWall = map.getTile(0, 0, 0);
		Tile expectedFloor = map.getTile(1, 1, 0);
		
		assertEquals(expectedWall, TileFactory.getWall());
		assertFalse(expectedWall.isAccesible());
		assertFalse(expectedWall.isDestroyable());
		
		assertEquals(expectedFloor, TileFactory.getFloor());
		assertTrue(expectedFloor.isAccesible());
		assertFalse(expectedFloor.isDestroyable());
	}

}

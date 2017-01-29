package jomali.polyphemus.geography;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import jomali.polyphemus.Renderer;

public class GameMapTest {
	
	private Renderer renderer;
	
	@Before
	public void setUp() {
		renderer = new Renderer();
	}
	
	private void printMap(GameMap map) {
		for (int z = 0; z < map.getDepth(); z++) {
			System.out.println("\nLEVEL " + z);
			for (int y = 0; y < map.getHeight(); y++) {
				for (int x = 0; x < map.getWidth(); x++) {
					Tile tile = map.getTile(x, y, z);
					System.out.print(renderer.getGlyph(tile));
				}
				System.out.println();
			}
		}
	}

	@Test
	public void test() {
		GameMap map = new GameMapBuilder(80, 32, 5).makeFields(2).build();
		
		Tile expectedWall = map.getTile(0, 0, 0);
		Tile expectedFloor = map.getTile(1, 1, 0);
		
		assertEquals('#', renderer.getGlyph(expectedWall));
		assertFalse(expectedWall.isAccesible());
		assertFalse(expectedWall.isDestroyable());
		
		assertEquals('.', renderer.getGlyph(expectedFloor));
		assertTrue(expectedFloor.isAccesible());
		assertFalse(expectedFloor.isDestroyable());
		
		printMap(map);
	}

}

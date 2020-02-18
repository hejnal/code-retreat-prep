package whejna.testing.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import whejna.testing.Game;
import whejna.testing.Grid;
import whejna.testing.Point;


public class PointTest {
    @Test
    public void justASimpleTest() {
        Point p = new Point(0, 0);

        assertEquals(p.getX(), 0);
        assertEquals(p.getY(), 0);
        assertEquals(0, 0, "it should be 0");
    }

    @Test
    public void gridTest() {
        Grid grid = new Grid(5);
        assertEquals(grid.getSize(), 5);
    }
    @Test
    public void testGrid() {
        Grid grid = new Grid(5);
        assertEquals(grid.getValue(new Point(1, 0)), false);
    }

    @Test
    public void testIsAlive() {
        Grid grid = new Grid(5);
        grid.setAlive(new Point(0,0));
        assertEquals(grid.getValue(new Point(0, 0)), true);
        grid.setDead(new Point(0,0));
        assertEquals(grid.getValue(new Point(0, 0)), false);
    }

    @Test
    public void testCount() {
        Grid grid = new Grid(5);
        Game game = new Game(grid);
        assertEquals(game.getCount(new Point(2, 2)), 0);
    }

    @Test
    public void testCountMore() {
        Grid grid = new Grid(5);
        grid.setAlive(new Point(2, 1));
        Game game = new Game(grid);
        assertEquals(game.getCount(new Point(2, 2)), 1);
    }

    @Test
    public void testGame() {
        Grid grid = new Grid(3);
        Game game = new Game(grid);
        assertEquals(game.getGrid().getSize(), 3);

    }

}
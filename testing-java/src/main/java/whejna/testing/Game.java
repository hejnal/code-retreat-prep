package whejna.testing;

public class Game {


    private final Grid grid;

    final int ITERATIONS = 10;

    public Game(Grid grid){
        this.grid = grid;
    }

    public Grid getGrid() {
        return grid;
    }


    public int getCount(Point point) {
        int sum= 0;
        if (grid.grid[point.getX()-1][point.getY() -1]) {
            sum++;
        }
        if (grid.grid[point.getX()][point.getY() -1]) {
            sum++;
        }
        if (grid.grid[point.getX()+1][point.getY() -1]) {
            sum++;
        }

        if (grid.grid[point.getX()-1][point.getY()]) {
            sum++;
        }
        if (grid.grid[point.getX()+1][point.getY()]) {
            sum++;
        }

        if (grid.grid[point.getX()-1][point.getY() +1]) {
            sum++;
        }
        if (grid.grid[point.getX()][point.getY() +1]) {
            sum++;
        }
        if (grid.grid[point.getX()+1][point.getY() +1]) {
            sum++;
        }
        return sum;
    }

    public boolean willBeAlive(Point point) {
        int count = getCount(point);
        return count == 3 || (count == 2 && grid.getValue(point));
    }

    public void evolve() {
        // todo evolve

    }
}

package whejna.testing;

public class Grid {

    private final int size;
    private boolean[][] grid;

    public Grid(int size) {
        this.size = size;
        grid = new boolean[size][size];
    }

    public int getSize() {
        return size;
    }

    public boolean getValue(Point point) {
        return grid[point.getX()][point.getY()];
    }

    public void setAlive(Point p) {
        grid[p.getX()][p.getY()] = true;

    }

    public void setDead(Point p) {
        grid[p.getX()][p.getY()] = false;

    }

    public int getCount(Point point) {
        int sum= 0;
        if (grid[point.getX()-1][point.getY() -1]) {
            sum++;
        }
        if (grid[point.getX()][point.getY() -1]) {
            sum++;
        }
        if (grid[point.getX()+1][point.getY() -1]) {
            sum++;
        }

        if (grid[point.getX()-1][point.getY()]) {
            sum++;
        }
        if (grid[point.getX()+1][point.getY()]) {
            sum++;
        }

        if (grid[point.getX()-1][point.getY() +1]) {
            sum++;
        }
        if (grid[point.getX()][point.getY() +1]) {
            sum++;
        }
        if (grid[point.getX()+1][point.getY() +1]) {
            sum++;
        }
        return sum;
    }
}

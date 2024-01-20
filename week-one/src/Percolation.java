public class Percolation {
    private boolean[][] grid;
    private int openSites;
    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n){
        grid = new boolean[n][n];
        for(int i = 0; i<n;i++){
            for(int j = 0; j<n; j++){
                grid[i][j]= false;
            }
        }

        openSites = n*n;
    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col){
        if(!grid[row][col]) {
            grid[row][col] = true;
            openSites--;
        }
    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col){
        return grid[row][col];}

    // is the site (row, col) full?
    public boolean isFull(int row, int col){return true;}

    // returns the number of open sites
    public int numberOfOpenSites(){return openSites;}

    // does the system percolate?
    public boolean percolates(){return true;}

    // test client (optional)
    public static void main(String[] args){

    }
}


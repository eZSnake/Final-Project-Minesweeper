import java.util.Scanner;

public class Minesweeper { 

    private static final int GAME_WON = 1;
    private static final int GAME_LOST = -1;
    private static final int GAME_NOTOVER = 0;
    
    // Add other static variables and constants you might need
    private static Cell[][] grid;
    private int myRow;
    private int myColumn;
    private int myAmMines;

    /* 
     * Create the grid and place mines in random locations.
     *
     * @param rows     The number of rows in the Minesweeper grid
     * @param columns  The number of columns in the Minesweeper grid
     *
     * Tip: Create Minesweeper grid with 2 extra rows and 2 extra columns
     *      This will make it easy to go around the grid eliminating
     *      the need for ArrayOutOfBounds checking at the edges.
     */
    public static void initGrid(int rows, int columns) {
        grid[rows + 2][columns + 2];
        myRow = rows;
        myColumn = columns;
    }
    
    /*
     * Places mines in random locations in the grid.
     *
     * @param amountMines   The number of mines to be set in the grid.
     */
    public static void disperseMines(int amountMines) {
        myAmMines = amountMines;
        for (int i = 0; i < amountMines; i++) {
            Random rowr = new Random();
            Random columnc = new Random();
            grid[rowr.nextInt(myRow + 1)][columnc.nextInt(myColumn + 1)];
        }
    }

    /*
     * Updates each cell with the number of adjacent cells with mines
     */
    public static void adjacentMines() {
        int mines = 0;
        for (int i = 0; i < myRow; i++) {
            for (int j = 0; j < myColumn; j++) {
                if (grid[i - 1][j - 1] == *) {
                    mines++;
                }
                if (grid[i][j - 1] == *) {
                    mines++;
                }
                if (grid[i + 1][j - 1] == *) {
                    mines++;
                }
                if (grid[i + 1][j] == *) {
                    mines++;
                }
                if (grid[i + 1][j + 1] == *) {
                    mines++;
                }
                if (grid[i][j + 1] == *) {
                    mines++;
                }
                if (grid[i - 1][j + 1] == *) {
                    mines++;
                }
                if (grid[i - 1][j] == *) {
                    mines++;
                }
                grid[i][j] = mines;
            }
        }
    }
 
    /*
     * Method to print Minesweeper grid
     */
    private static void printGrid() {
        for (int i = 0; i < myRow; i++) {
            for (int j = 0; j < myColumn; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    /*
     * Method to reveal all the hidden cells. Prints grid after all cells
     * have been revealed.
     */
    public static void revealGrid() {

    }

    /* 
     * Reveals the selected cell. So the cell now displays a '.' if no
     * adjacent cells have mines, or, a number representing the number 
     * of adjcent cells with mines.
     *
     * Extra Credit: Reveal surrounding cells until encountering a cell 
     *               with non-zero adjacent mines 
     *
     * @param   row    Row of the user selected cell
     * @param   column Column of the user selected cell
     * @return  an integer indicating if the game is won, lost or not-over
     */
    public static int revealCell(int row, int column) {
        /*
         * Handle user's cell selection specified by row and column 
         * There are three different cases:
         * 1. user chooses already explored cell - do nothing
         * 2. user chooses cell which has a mine - game lost
         * 3. user chooses a mine-free cell - reveal the cell
         * Print Minesweeper grid after handling user input
         *
         */
       
    }

    /*
     * Check if all the mine-free cells are revealed
     * @return  true if game over, false if not
     */
    public static boolean checkGameOver() {
        if (myRow * myColumn - myAmMines == ) {
            return false;
        } else {
            return true;
        }
    }

    /* Add other static methods as necessary */
    
    public static void main(String[] args) { 
        
    }
}

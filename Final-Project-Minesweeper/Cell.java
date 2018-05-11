import java.util.Scanner;

public class Cell { 
    public static final char MINE = '*';
    public static final char NO_ADJ_MINE_CELL = '.';
    public static final char HIDDEN_CELL = '#';
    public static final char[] NUM_ADJ_MINES = {'.','1','2','3','4','5','6','7','8'};
    
    /* Add or remove constants, instance variables and instance methods 
     * as necessary. 
     */
    private boolean mine;
    private boolean revealed;
    private int numAdjacentMines;
    private int xCords;
    private int yCords;

    /* Constructor - sets up a default Cell. It is hidden, not a mine,
     *               and has 0 adjacent mines.
     */
    public Cell() {
	     mine = MINE;
	     numAdjacentMines = NUM_ADJ_MINES;
       hiddenCell = HIDDEN_CELL;
    }

    /* Mark this cell as containing a mine
     */
    public void setMine() {
	      hiddenCell = mine;
    }
    
    /* Helper method which returns a char value corresponding to the integer parameter
     * numMines = 0 --> returns '.'
     * numMines = 1 --> returns '1', numMines = 2 --> returns '2' etc
     */
    private char getNumMines(int numMines) {
        if (int numMines == 0) {
          return ".";
        } else {
          return NUM_ADJ_MINES[numMines];
        }
    }

    /* If the Cell is not revealed, returns HIDDEN_CELL
     * Calls getNumMines() to get the char corresponding to number of mines if the Cell is revealed.
     *
     */
    public char getVal() {
	      if (cell != "#") {
          System.out.println(getNumMines(numMines));
        } else {
          return HIDDEN_CELL
    } 

    /* Mark this cell as revealed.
     */
    public void reveal() {
	    cell = getNumMines(numMines);
    }

	/* Store the number of neighboring mines there are to this cell.
	 */
	  public void setAdjacentMines(int numMines) {
        int numMines = 0;
        if (grid[xCord][yCord + 1]) {
          numMines++;
        }
        if (grid[xCords - 1][yCords + 1]) {
          numMines++;
        }
        if (grid[xCords - 1][yCords]) {
          numMines++;
        }
        if (grid[xCords - 1][yCords - 1]) {
          numMines++;
        }
        if (grid[xCords][yCords - 1]) {
          numMines++;
        }
        if (grid[xCords + 1][yCords - 1]) {
          numMines++;
        }
        if (grid[xCords + 1][yCords]) {
          numMines++;
        }
        if (grid[xCords + 1][yCords + 1]) {
          numMines++;
        }
        return numMines;
    }

	/* Returns the number of neighboring mines there are to this cell.
	 */
	  public int getAdjacentMines() {
		  int mine = 0;
      return setAdjacentMines(int numMines);
    }
    
    /* Checks if the cell is a mine or not
     * @return   true if it is a mine, false if it is not a mine
     */
    public boolean isMine() {
	    
    }
}

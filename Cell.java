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

    /* Constructor - sets up a default Cell. It is hidden, not a mine,
     *               and has 0 adjacent mines.
     */
    public  Cell() {
    }

    /* Mark this cell as containing a mine
     */
    public void setMine() {
    }
    
    /* Helper method which returns a char value corresponding to the integer parameter
     * numMines = 0 --> returns '.'
     * numMines = 1 --> returns '1', numMines = 2 --> returns '2' etc
     */
    private char getNumMines(int numMines) {
        return NUM_ADJ_MINES[numMines];
    }

    /* If the Cell is not revealed, returns HIDDEN_CELL
     * Calls getNumMines() to get the char corresponding to number of mines if the Cell is revealed.
     *
     */
    public char getVal() {
    } 

    /* Mark this cell as revealed.
     */
    public void reveal() {

    }

	/* Store the number of neighboring mines there are to this cell.
	 */
	public void setAdjacentMines(int numMines) {
    }

	/* Returns the number of neighboring mines there are to this cell.
	 */
	public int getAdjacentMines() {
    }
    
    /* Checks if the cell is a mine or not
     * @return   true if it is a mine, false if it is not a mine
     */
    public boolean isMine() {
    }
}


/**
* a class for ships on the board of battleship
* @author Adam Geringer
*/

public class Ship {

    /**the number of hits*/
    private int hits;

    /**the length of the ship*/
    private int length;

    /**the orientation: true if horizontal, false if vertical*/
    private boolean isHorizontal;

    /**the number of  the startrow*/
    private int startRow;

    /**the number of the start col*/
    private int startCol;

    /**
    *@param length is the length of the ship
    *@param isHorizontal is the orientaion
    *@param startRow is the starting rw of the ship
    *@param startCol is the starting column of the ship
    *This constructor must initialize the class's instance variables using the parameter values. 
    *Throw an IllegalArgumentException if length < 1, startRow < 0, or startCol < 0.
    * initializes hits at 0
    */
    public Ship(int length, boolean isHorizontal, int startRow, int startCol){ 
        if (length < 1) {
            throw new IllegalArgumentException("length invalid");
        }

        if (startRow < 0) {
            throw new IllegalArgumentException("startRow invalid");
        }

        if (startCol < 0) {
            throw new IllegalArgumentException("startCol invalid");
        }

        this.length = length;
        this.isHorizontal = isHorizontal;
        this.startRow = startRow;
        this.startCol = startCol;
        this.hits = 0;
    }

    /**@return the length of the ship.
    */
    public int getLength(){ 
        return length;    
    }

    /**@return true if the ship has horizontal orientation, false otherwise.
    */
    public boolean isHorizontal(){ 
        return isHorizontal;
    }

    /**@return the row of the upper left corner of the Ship.
    */
    public int getStartRow(){ 
        return startRow;
    }

    /**@return the column of the upper left corner of the Ship.
    */
    public int getStartCol(){ 
        return startCol;
    }
    /**simulates hitting the ship (updates the appropriate instance variable)
    */
    public void hit(){ 
        hits++;
    }
    /**@return true if the ship is sunk (has been hit as many times as its length).
    */
    public boolean isSunk(){ 
        if (hits == length) {
            return true;
        } else {
            return false;
        }
    }

    /**@return a String representation of a Ship that lists its length, location, orientation, 
    *number of times hit, if the ship is sunk. This will allow you to print all the information 
    *you need about the ship when testing the class. The format of the String is up to you.
    */
    public String toString(){ 
        String s = "Length: " + length;
        s += "; Location: (" + startRow + ", " + startCol + "); Orientation: ";
        if (isHorizontal() == true) {
            s += "horizontal; Hits: " + hits + ";";
        } else {
            s += "vertical; Hits: " + hits + ";";
        }

        if (isSunk() == true) {
            s += " and is SUNK";
        } else {
            s += " and is NOT sunk";
        }
        
        return s;
    }
}

/**
* a class for squares on the board of battleship
* @author Adam Geringer
*/
public class Square {

    /**the boolean of the ship's hits*/
    private boolean hasBeenHit;

    /**the ship object on the square*/
    private Ship ship;

    /**
    *construstor that sets hasBeenHit to false and the ship to null
    */
    public Square() {
        this.hasBeenHit = false;
        this.ship = null;
    }
    
    /**
    *@return hasBeenHit
    */
    public boolean hasBeenHit() {
        return hasBeenHit;
    }

    /**
    *@return ship
    */    
    public Ship getShip() {
        return ship;
    }
    
    /**
    * changes hasBeenHit to true, and if it has a ship, runs ship.hit()
    */
    public void fireAt() {
        hasBeenHit = true;
        if (hasShip()){
            ship.hit();
        }
    }

    /**
    * if ship is not null, returns true, otherwise false
    *@return hasShip
    */    
    public boolean hasShip() {
        boolean hasShip = false;
        if (ship != null){
            hasShip = true;
        }
        return hasShip;
    }

    /**
    *assigns a ship to the square
    *@param ship is the ship object to be added
    */    
    public void addShip(Ship ship) {
        this.ship = ship;
    }
    
    /**
    *makes a tring wit information on all of the Ship's parameters
    *@return s
    */
    public String toString() {
        String s = "";
        if (hasShip() == false && hasBeenHit() == false) {
            s += "-";
        } else if (hasShip() == false && hasBeenHit() == true) {
            s += "W";
        } else if (hasShip() == true && hasBeenHit() == true) {
            s += "R";
        } else if (hasShip() == true && hasBeenHit() == false){
            int length = ship.getLength();
            s += Integer.toString(length);
        } else {
            System.out.println("Something terrible happened; the laws of logic have been broken");
        }
        return s;
    }
}

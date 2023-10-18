/**
 * Passenger class which creates a new passenger with a name set by the user and contains methods to board the train and get off
 */

public class Passenger {
    
    private String name;

    /**
     * creates new passenger with name input by user
     * @param name the name of the passenger used for the rest of the methods and printing
     */
    public Passenger(String name) {
        this.name = name;
    }
    
    /**
     * gets the passenger name and returns it 
     * @return name the name of the passenger
     */
    public String getName() {
        return name;
    }

    /**
     * converts the name to string for readability and formatting
     * @return name the passenger name in user readable format
     */
    public String toString() {
        return name;
    }

    /**
     * method to board the car using the method from the Car class
     * @param c the Car object that the passenger is trying to board
     */
    public void boardCar(Car c) {
        try {
            c.addPassenger(this);
        } catch(Exception e) {
            System.err.println("Cannot add " + getName());
        }
    }

    /**
     * method to get off the car using the method from the Car class
     * @param c the Car object that the passenger is trying to get off of
     */
   public void getOffCar(Car c) {
    try {
        c.removePassenger(this);
        System.out.println(getName() + " has left.");
    } catch (Exception e) {
        System.err.println(getName() + " not on board and cannot be removed.");
    }        
}
}

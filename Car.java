import java.util.ArrayList;

public class Car {
    private ArrayList<Passenger> passengersOnboard;
    private int maxCapacity;


    // Constructor
    public Car(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.passengersOnboard = new ArrayList<Passenger>(maxCapacity);
    }

    public int getCapacity() {
        return maxCapacity;
    }


    public int seatsRemaining() {
        //maximum number - the total number of people currently onboard
        return(maxCapacity - passengersOnboard.size());
    }

    public void addPassenger(Passenger p) {
        if (seatsRemaining() > 0) {
            if (!passengersOnboard.contains(p)) {
                //System.out.println("Seats remaining: " + seatsRemaining());
                System.out.println("Adding " + p);
                passengersOnboard.add(p);
                //System.out.println("Current passengers on board: " + passengersOnboard);
            } else {
                throw new RuntimeException(p + " is already on board");
            }  
        } else {
            throw new RuntimeException("No seats left on board.");
        }    
    }

    public void removePassenger(Passenger p) {
        if (passengersOnboard.contains(p)) {
            System.out.println("Removing " + p + " from train.");
            passengersOnboard.remove(p);
        } else {
            throw new RuntimeException("Passenger not on board and cannot be removed.");
        }
    }

    public void printManifest() {
            if (!passengersOnboard.isEmpty()) {
                System.out.println("Passengers currently on board: " + passengersOnboard);
            } else {
                System.out.println("This car is empty.");  
        }
    }
    
}
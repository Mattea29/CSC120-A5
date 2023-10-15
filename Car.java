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
            System.out.println("Seats remaining: " + seatsRemaining());
            System.out.println("Adding passenger " + p);
            passengersOnboard.add(p);
            System.out.println("Current passengers on board: " + passengersOnboard);
        } else {
            throw new RuntimeException("No seats left on board.");
        }     
    }

    public void removePassenger(Passenger p) {
        if (passengersOnboard.contains(p)) {
            System.out.println("Removing passenger from train." + p);
            passengersOnboard.remove(p);
            System.out.println("Passengers on board: " + passengersOnboard);
        } else {
            throw new RuntimeException("Passenger not on board and cannot be removed.");
        }
    }

    public void printManifest() {
            if (!passengersOnboard.isEmpty()) {
                System.out.println(passengersOnboard);
            } else {
                System.out.println("This case is empty.");  
        }
    }
}
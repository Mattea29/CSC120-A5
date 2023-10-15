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
        return this.maxCapacity;
    }


    public int seatsRemaining() {
        //maximum number - the total number of people currently onboard
        return(this.maxCapacity - this.passengersOnboard.size());
    }

    public void addPassenger(Passenger p) {
        try {
        if (seatsRemaining() != 0) {
            System.out.println("Seats remaining: " + seatsRemaining());
            System.out.println("Adding passenger " + p);
            passengersOnboard.add(p);
            System.out.println("Current passengers on board: " + passengersOnboard);
        } 
        } catch(Exception e) {
            System.err.println("All seats taken");

        }
    }

    public void removePassenger(Passenger p) {
        try {
        if (passengersOnboard.contains(p)) {
            System.out.println("Removing passenger from train");
            passengersOnboard.remove(p);
            System.out.println("Passengers on board: " + passengersOnboard);
        }
        } catch(Exception e) {
            System.err.println("Passenger not on board and cannot be removed");
        }
    }

    public void printManifest() {
        try{
            if (passengersOnboard.size() != 0) {
                System.out.println(passengersOnboard);
            }
        } catch (Exception e) {
            System.out.println("This car is empty");
        }
    }

    //public static void main(String[] args) {
        //Car myCar = new Car(20);
        //myCar.getCapacity();
        //myCar.seatsRemaining();
       // myCar.addPassenger("Jessica");


//}
}
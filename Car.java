/**
 * Car class which creates new car objects that make up the train. Contains method for checking the capacity, number of seats remaining, checking passengers onboard and adding/removing properly, and printing the current passengers
 */

import java.util.ArrayList;

public class Car {

    /**
     * private attributes:
     * ArrayList<Passenger> passaengersOnboard is an array list containing the names of passengers
     * int maxCapacity is an integer which we use to set the maximum number of passengers who can be let onboard and the number of remaining seats
     */
    private ArrayList<Passenger> passengersOnboard;
    private int maxCapacity;


    // Constructor
    /**
     * creates new car with maxCapacity set by user
     * @param maxCapacity maximum capacity of the train
     */
    public Car(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.passengersOnboard = new ArrayList<Passenger>(maxCapacity);
    }

    /**
     * gets and returns the maximum capacity of the train across all cars
     * @return maxCapacity, the maximum capacity across all cars
     */
    public int getCapacity() {
        return maxCapacity;
    }

    /**
     * method to find the current number of seats remaining in a car
     * @return the maximum capacity minus the number of passengers currently on board
     */
    public int seatsRemaining() {
        //maximum number - the total number of people currently onboard
        return(maxCapacity - passengersOnboard.size());
    }

    /**
     * method to add a passenger to a car. Checks that the passenger is not already on board, and adds them or throws exceptions properly 
     * @param p the passenger to be added
     * @throws new runtime exceptions is the person is already on board or if there are no seats left
     */
    public void addPassenger(Passenger p) {
        if (seatsRemaining() > 0) {
            if (!passengersOnboard.contains(p)) {
                System.out.println("Adding " + p);
                passengersOnboard.add(p);
            } else {
                throw new RuntimeException(p + " is already on board");
            }  
        } else {
            throw new RuntimeException("No seats left on board.");
        }    
    }

    /**
     * method to remove passenger from the train. Checks if someone is on board and adds them or throws exceptions properly 
     * @param p the passenger to be removed
     * @throws new runtime exceptions if the person is not on board
     */
    public void removePassenger(Passenger p) {
        if (passengersOnboard.contains(p)) {
            System.out.println("Removing " + p + " from train.");
            passengersOnboard.remove(p);
        } else {
            throw new RuntimeException("Passenger not on board and cannot be removed.");
        }
    }

    /**
     * prints the roster of passengers if present, or simply says the car is empty if no one is on board
     */
    public void printManifest() {
            if (!passengersOnboard.isEmpty()) {
                System.out.println("Passengers currently on board: " + passengersOnboard);
            } else {
                System.out.println("This car is empty.");  
        }
    }
    
}
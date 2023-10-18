/**
 * the Train class which creates the train and brings all parts together 
 */
import java.util.ArrayList;

public class Train {
    private final Engine engine;
    private ArrayList<Car> cars;

    /**
     * creates new train object using the engine and cars
     * @param f the fuel type of the engine 
     * @param maxFuelLevel the maximum fuel level of the train
     * @param nCars the number of cars on the train
     * @param passengerCapacity the maximum number of passengers on the train
     * @param currentFuelLevel the current fuel level of the train
     */
    public Train(FuelType f, double maxFuelLevel, int nCars, int passengerCapacity, double currentFuelLevel) {
        this.engine = new Engine(f, maxFuelLevel, currentFuelLevel);
        this.cars = new ArrayList<>(nCars); 

        for (int i = 0; i < nCars; i++) {
            cars.add(new Car(passengerCapacity));
        }
    }

    /**
     * gets the engine and returns it
     * @return engine the engine the object
     */
    public Engine getEngine() {
        return engine;
    }

    /**
     * gets the car at a certain position
     * @param i the position of the car in the train
     * @return null 
     */
    public Car getCar(int i) {
        if (i >= 0 && i < cars.size()) {
            return cars.get(i);
        }
        return null;
    }

    /**
     * gets the maximum capacity of the cars 
     * @return maxCapacity the maximum capacity of the car
     */
    public int getMaxCapacity() {
        int maxCapacity = 0;
        for (Car car : cars) {
            maxCapacity += car.getCapacity();
        }
        return maxCapacity;
    }

    /**
     * gets the number of remaining seats in each car
     * @return remainingSeats the number of seats remaining in each car
     */
    public int seatsRemaining() {
        int remainingSeats = 0;
        for (Car car: cars) {
            remainingSeats += car.seatsRemaining();
       }
        return remainingSeats;
    }

    /**
     * prints the roster of passengers in each car
     */
    public void printManifest() {
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("Car " + (i + 1) + ": ");
            cars.get(i).printManifest(); 
        }
    }

    // testing with random inputs to check functionality of other classes!!
//     public static void main(String[] args) {
//         Train myTrain = new Train(FuelType.STEAM, 100.0, 5, 50, 75.0);

//         Engine engine = myTrain.getEngine();
//         System.out.println("Starting Fuel Level: " + engine.getCurrentFuelLevel());

//         try {
//             while (engine.getCurrentFuelLevel() > 0) {
//                 engine.go();
//             }
//         } catch (Exception e) {
//             System.err.println(e.getMessage());
//         }

//         System.out.println("Remaining fuel level: " + engine.getCurrentFuelLevel());
//         engine.refuel();
//         System.out.println("Filled to max. New fuel level: " + engine.getCurrentFuelLevel());

//         Passenger p1 = new Passenger("Jordan");
//         Passenger p2 = new Passenger("Johanna");

//         Car car1 = myTrain.getCar(0);
//         Car car3 = myTrain.getCar(2);

//         myTrain.printManifest();

//         try{
//             p1.boardCar(car1);
//             p2.boardCar(car3);
//             p1.boardCar(car1);
//         } catch (Exception e) {
//             System.err.println(e.getMessage());
//         }
        

//         myTrain.printManifest();

//         try {
//             for (int i = 0; i < 51; i++) {
//                 Passenger passenger = new Passenger("Passenger " + i);
//                 passenger.boardCar(car1);

//             }
//         } catch (Exception e) {
//             System.err.println(e.getMessage());
//         }

//         // try
//         // p1.getOffCar(car1);
//         // System.out.println("Passenger " + p1.getName() + " has left");
//         // myTrain.printManifest();
//         // p1.getOffCar(car1);

//         try {
//             Passenger p100 = new Passenger("Mattea");
//             p1.getOffCar(car1);
//             p100.getOffCar(car1);
//         } catch (Exception e) {
//             System.err.println(e.getMessage());
//         }

//         myTrain.printManifest();

//     }
}
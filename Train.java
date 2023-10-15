import java.util.ArrayList;

public class Train {
    private final Engine engine;
    private ArrayList<Car> cars;

    public Train(FuelType f, double maxFuelLevel, int nCars, int passengerCapacity, double currentFuelLevel) {
        this.engine = new Engine(f, maxFuelLevel);
        this.cars = new ArrayList<>(nCars); 

        for (int i = 0; i < nCars; i++) {
            cars.add(new Car(passengerCapacity));
        }
    }

    public Engine getEngine() {
        return engine;
    }

    public Car getCar(int i) {
        if (i >= 0 && i < cars.size()) {
            return cars.get(i);
        }
        return null;
    }

    public int getMaxCapacity() {
        int maxCapacity = 0;
        for (Car car : cars) {
            maxCapacity += car.getCapacity();
        }
        return maxCapacity;
    }

    public int seatsRemaining() {
        int remainingSeats = 0;
        for (Car car: cars) {
            remainingSeats += car.seatsRemaining();
       }
        return remainingSeats;
    }

    public void printManifest() {
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("Car " + (i + 1) + ": ");
            cars.get(i).printManifest(); 
        }
    }
}
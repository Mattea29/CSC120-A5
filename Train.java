import java.util.ArrayList;

public class Train {
    private final Engine engine;
    private ArrayList<Car> cars;

    public Train(FuelType f, double maxFuelLevel, int nCars, int passengerCapacity, double currentFuelLevel) {
        this.engine = new Engine(f, maxFuelLevel, currentFuelLevel);
        this.cars = new ArrayList<>(); 
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

    public int getMaxCapacity(Car c) {
        
    }

}

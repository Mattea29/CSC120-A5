import java.util.ArrayList;

public class Train {
    private final Engine engine;
    private ArrayList<Car> cars;

    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity) {
        this.engine = new Engine(fuelType, fuelCapacity);
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

    public int getMaxCapacity() {
        int MaxCapacity = 0;
    }

}

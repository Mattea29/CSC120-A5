/**
 * Engine Class which creates engine object, returns current and max fuel levels, refuels, and allows the train to run
 * 
 */
public class Engine {
    private FuelType f;
    double currentFuelLevel;
    double maxFuelLevel;

    /**
     * takes in values of fueltype and fuel levels to create a new engine
     * @param f the fueltype; one of the options set in FuelType
     * @param maxFuelLevel the maximum feul level of the engine
     * @param currentFuelLevel the current fuel level of the engine
     */
    public Engine(FuelType f, double maxFuelLevel, double currentFuelLevel) {
        this.f = f;
        this.maxFuelLevel = maxFuelLevel;
        this.currentFuelLevel = currentFuelLevel;
    }

    /**
     * gets and returns the current fuel level of the train
     * @return the current fuel level
     */
    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }
    
    /**
     * gets and returns the maximum fuel level of the train
     * @return the maximum fuel level
     */
    public double getMaxFuelLevel() {
        return maxFuelLevel;
    }

    /**
     * refuels the train by setting the current fuel level to the maximum fuel 
     */
    public void refuel() {
        currentFuelLevel = maxFuelLevel;
    }
    
    /**
     * allows the train to go so long as the current fuel level is above 0; decreases the fuel level by 1 
     * @throws a new runtime exception when the fuel level hits 0 and the train can not keep going
     */
    public void go() {
        if (currentFuelLevel > 0) {
            System.out.println("Current fuel level is " + currentFuelLevel);
            currentFuelLevel = currentFuelLevel - 1;
            System.out.println("Remaining fuel level is " + currentFuelLevel);
        } else {
            throw new RuntimeException("Fuel Level Too Low to Go.");
        }
    }

    //testing 
    // public static void main(String[] args) {
    //     Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0, 75.0);
    //     try {
    //         while (true) {
    //             myEngine.go();
    //         }
    //     } catch (Exception e) {
    //         System.err.println(e.getMessage()); // Out of fuel
    //         myEngine.refuel(); //refueling for next trip
    //         System.out.println("Engine refueled to maximum level!"); // refuel successful
    //         System.out.println("Current fuel level is " + myEngine.currentFuelLevel);
    //     }
       
    // }
}


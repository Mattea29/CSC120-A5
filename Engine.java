public class Engine {
    private FuelType f;
    double currentFuelLevel;
    double maxFuelLevel;

    public Engine(FuelType f, double maxFuelLevel, double currentFuelLevel) {
        this.f = f;
        this.maxFuelLevel = maxFuelLevel;
        this.currentFuelLevel = currentFuelLevel;
    }

    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }
    
    public double getMaxFuelLevel() {
        return maxFuelLevel;
    }

    public void refuel() {
        currentFuelLevel = maxFuelLevel;
    }

    public void go() {
        if (currentFuelLevel > 0) {
            System.out.println("Current fuel level is " + currentFuelLevel);
            currentFuelLevel = currentFuelLevel - 1;
            System.out.println("Remaining fuel level is " + currentFuelLevel);
        } else {
            throw new RuntimeException("Fuel Level Too Low to Go.");
        }
    }

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


public class Engine {
    private FuelType f;
    double currentFuelLevel;
    double maxFuelLevel;

    public Engine(double currentFuelLevel, double maxFuelLevel) {
        this.f = FuelType;
        this.currentFuelLevel = currentFuelLevel;
        this.maxFuelLevel = maxFuelLevel;
    }

    public double getCurrentFuelLevel() {
        return this.currentFuelLevel;
    }
    
    public double getMaxFuelLevel() {
        return this.maxFuelLevel;
    }

    //public void setCurrentFuelLevel(double currentFuelLevel) {
        //this.currentFuelLevel = currentFuelLevel;
    //}
    
    //public void setMaxFuelLevel(double maxFuelLevel) {
        //this.maxFuelLevel = maxFuelLevel;
    //}

    public void refuel(double currentFuelLevel) {
        this.currentFuelLevel = this.maxFuelLevel;
    }

    public void go(double currentFuelLevel) {
        if (this.currentFuelLevel > 0) {
            System.out.println("Current fuel level is " + currentFuelLevel);
            currentFuelLevel = currentFuelLevel - 1;
            System.out.println("Remaining fuel level is " + currentFuelLevel);

        } else {
            throw new RuntimeException("Fuel Level Too Low to Go.");
        }
    }


}
public class Engine {
    private FuelType f;
    double currentFuelLevel;
    double maxFuelLevel;

    public double getCurrentFuelLevel() {
        return this.currentFuelLevel;
    }
    
    public double getMaxFuelLevel() {
        return this.maxFuelLevel;
    }

    public void setCurrentFuelLevel(double currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }
    
    public void setMaxFuelLevel(double maxFuelLevel) {
        this.maxFuelLevel = maxFuelLevel;
    }


}
public class Passenger {
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }

    public void boardCar(Car c) {
        try {
            c.addPassenger(this);
        } catch(Exception e) {
            System.err.println("Cannot add " + getName());
        }
    }

    
   public void getOffCar(Car c) {
    try {
        c.removePassenger(this);
        System.out.println(getName() + " has left.");
    } catch (Exception e) {
        System.err.println(getName() + " not on board and cannot be removed.");
    }

         
}
}

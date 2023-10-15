public class Passenger {
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    public void boardCar(Car c) {
        try {
            c.addPassenger(this);
        } catch(Exception e) {
            System.err.println("Cannot add this passenger");
        }
    }

    
   public void getOffCar(Car c) {
    c.removePassenger(this);
         
}
}

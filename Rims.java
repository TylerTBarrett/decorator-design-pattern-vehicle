/**
 * A virtual representation of the Rims modification
 * @author Tyler Barrett
 * 
 */

public class Rims extends VehicleDecorator {
    private Vehicle vehicle;

    /**
     * Constructs the Rims object and sets the vehicle in the class to the vehicle
     * inputted in this method
     * @param vehicle will be used to set the vehicle in this class
     */
    public Rims(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String toString() {
        return vehicle.toString() + ", cool rims";
    }

    public double getCost() {
        return vehicle.getCost() + 200.0;
    }
}

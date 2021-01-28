/**
 * A virtual representation of the Paint modification to a Vehicle
 * @author Tyler Barrett
 * 
 */

public class Paint extends VehicleDecorator {
    private Vehicle vehicle;

    /**
     * Constructs an instance of the object Paint to act as a wrapper for a Vehicle
     * @param Vehicle will be used to set the vehicle in this instance of the class
     */
    public Paint(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String toString() {
        return vehicle.toString() + ", fancy paint";
    }

    public double getCost() {
        return vehicle.getCost() + 150.0;
    }
}

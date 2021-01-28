/**
 * A virtual representation of a SoundSystem for the Vehicle, acts a wrapper
 * @author Tyler Barrett
 * 
 */

public class SoundSystem extends VehicleDecorator {
    private Vehicle vehicle;

    /**
     * Constructs a SoundSystem based on the input vehicle
     * @param Vehicle will be used to set the vehicle for this SoundSystem object
     */
    public SoundSystem(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String toString() {
        return vehicle.toString() + ", awesome sound";
    }

    public double getCost() {
        return vehicle.getCost() + 350.0;
    }
}

public class SoundSystem extends Vehicle {
    private Vehicle vehicle;

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

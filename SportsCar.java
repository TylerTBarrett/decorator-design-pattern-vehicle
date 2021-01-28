/**
 * A SportsCar which is also a Vehicle
 * @author Tyler Barrett
 * 
 */

public class SportsCar extends Vehicle {

    /**
     * Constructs a Sports Car with the description of "Sports Car"
     */
    public SportsCar() {
        this.description = "Sports Car";
    }

    public double getCost() {
        return 30000.0;
    }

    public String toString() {
        return this.description;
    }
}
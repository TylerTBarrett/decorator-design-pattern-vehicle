/**
 * A representation of a Sedan which is also a Vehicle
 * @author Tyler Barrett
 * 
 */

public class Sedan extends Vehicle {
    
    /**
     * Constructs a Sedan, setting the description of the Sedan to "Sedan"
     */
    public Sedan() {
        this.description = "Sedan";
    }

    public double getCost() {
        return 20000.0;
    }

    public String toString() {
        return this.description;
    }
}

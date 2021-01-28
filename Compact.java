/**
 * A Compact Car which is also a Vehicle
 * @author Tyler Barrett
 * 
 */

public class Compact extends Vehicle {
    
    /**
     * Constructs an instance of Compact with the description "Compact Car"
     */
    public Compact() {
        this.description = "Compact Car";
    }

    public double getCost() {
        return 15000.0;
    }

    public String toString() {
        return this.description;
    }
}

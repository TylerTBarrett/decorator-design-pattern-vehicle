public class Compact extends Vehicle {
    
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

/**
 * A Vehicle with a description
 * @author Tyler Barrett
 * 
 */

public abstract class Vehicle {

    /**
     * variable describing the details about the Vehicle
     */
    protected String description;

    /**
     * Will return a String telling the description of the car and the additional description of any
     *  added modifications, ie SoundSystem
     * @return String denoting the description of the car
     */
    public abstract String toString();

    /**
     * Will return a double showing the total cost of the car and any modifications
     * @return double showing the cost of the car
     */
    public abstract double getCost();
}


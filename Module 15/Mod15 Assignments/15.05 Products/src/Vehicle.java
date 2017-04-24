/**
 *
 *
 * @author Tushaar Kamat
 * @version 1/29/17
 */
public abstract class Vehicle implements Product {

    private String name;
    private double cost;

    public Vehicle(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}

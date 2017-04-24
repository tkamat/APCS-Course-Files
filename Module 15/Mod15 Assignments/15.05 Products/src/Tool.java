/**
 * @author Tushaar Kamat
 * @version 1/29/17
 */
public class Tool implements Comparable<Tool>, Product {

    private String name;
    private double cost;

    public Tool(String name, double cost) {
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

    public int compareTo(Tool t) {
        double difference = this.cost - t.getCost();
        if (difference < 0.0)
            return -1;
        else if (difference > 0.0) {
            return 1;
        }
        else {
            return 0;
        }
    }
}

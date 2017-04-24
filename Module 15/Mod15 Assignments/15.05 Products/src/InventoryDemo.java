import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 * @author Tushaar Kamat
 * @version 1/29/17
 */
public class InventoryDemo {

    public static void takeInventory(String name, List<Product> products) {
        int totalQuant = 0;
        double totalCost = 0;
        for (Product p : products) {
            if (p.getName().equals(name)) {
                totalQuant++;
                totalCost += p.getCost();
            }
        }
        System.out.println(name + ": Quantity = " + totalQuant + ", Total cost = " + totalCost);
    }

    public static void main(String[] args) {

        List<Product> products = new ArrayList<Product>();
        products.add(new Car("Jaguar", 1000000.00));
        products.add(new Car("Neon", 17000.00));
        products.add(new Tool("JigSaw", 149.18));
        products.add(new Car("Jaguar", 1100000.00));
        products.add(new Car("Neon", 17500.00));
        products.add(new Car("Neon", 17875.32));
        products.add(new Truck("Ram", 35700.00));
        products.add(new Tool("CircularSaw", 200.00));
        products.add(new Tool("CircularSaw", 150.00));

        Tool saw1 = new Tool("Saw", 55.99);
        Tool saw2 = new Tool("Saw", 22.99);

        takeInventory("Jaguar", products);
        takeInventory("Neon", products);
        takeInventory("JigSaw", products);
        takeInventory("Ram", products);
        takeInventory("CircularSaw", products);
        if (saw1.compareTo(saw2) < 0)
            System.out.println("The second saw is more expensive");
        else if (saw1.compareTo(saw2) > 0)
            System.out.println("The first saw is more expensive");
        else
            System.out.println("The saws are the same price");
    }
}


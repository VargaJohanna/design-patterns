package factoryPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings");
        for (String topping : toppings) {
            System.out.println("  " + topping);
        }
    };
    public void bake() {
        System.out.println("Bake for 20 minutes at 200^");
    };
    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    };
    public void box(){
        System.out.println("Place pizza into official PizzaStore box");
    };

    public String getName() {
        return name;
    }
}

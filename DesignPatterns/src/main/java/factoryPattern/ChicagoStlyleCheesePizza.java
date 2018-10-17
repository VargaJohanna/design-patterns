package factoryPattern;

public class ChicagoStlyleCheesePizza extends Pizza {
    public ChicagoStlyleCheesePizza() {
        name = "Chicago Style Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella");
        toppings.add("Spinach leaves");
        toppings.add("Bacon");
    }

    @Override
    public void cut() {
        System.out.println("Cutting pizza into square slices");
    }
}

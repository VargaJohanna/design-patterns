package factoryPattern;


import org.testng.annotations.Test;

public class PizzaTestDrive {
    @Test
    public static void main() {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println(pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println(pizza.getName() + "\n");
    }
}

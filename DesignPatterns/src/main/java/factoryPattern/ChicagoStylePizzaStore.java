package factoryPattern;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if(type.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if(type.equals("cheese")) {
            return new ChicagoStlyleCheesePizza();
        }else {
            return null;
        }
    }
}

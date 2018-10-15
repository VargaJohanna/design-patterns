package decoratorPattern;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        if(getSize() == Size.GRANDE) {
            return beverage.cost() + 0.20;


        } else if (getSize() == Size.TALL) {
            return beverage.cost() + 0.50;


        } else {
            return beverage.cost() + 0.20;

        }
    }
}

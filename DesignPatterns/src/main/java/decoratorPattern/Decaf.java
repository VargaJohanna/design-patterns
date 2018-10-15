package decoratorPattern;

public class Decaf extends Beverage {
    public Decaf(Size size){
        description = "Decaf";
        setSize(size);
    }

    @Override
    public double cost() {
        if(getSize() == Size.GRANDE) {
            return 1.05;

        } else if (getSize() == Size.TALL) {
            return 3;

        } else {
            return 1.05;
        }
    }
}

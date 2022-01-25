package factory;

/**
 *
 * @author lilith
 */
public class CappuccinoFactory implements CoffeeFactory{

    @Override
    public AbstractCoffee newCoffee() {
        System.out.println("Making cappuccino");
        return new Cappuccino();
    }
    
}

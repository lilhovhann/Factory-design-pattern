package factory;

/**
 *
 * @author lilith
 */
public class EspressoFactory implements CoffeeFactory {

    @Override
    public AbstractCoffee newCoffee() {
        System.out.println("Making espresso");
        return new Espresso();
    }

}

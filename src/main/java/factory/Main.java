package factory;

/**
 *
 * @author lilith
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Starting factory");
        System.out.println("============");

        CoffeeFactory coffeeCappuccinoFactory = new CappuccinoFactory();
        coffeeCappuccinoFactory.newCoffee();
        
        System.out.println("============");
        
        CoffeeFactory coffeeEspressoFactory = new EspressoFactory();
        coffeeEspressoFactory.newCoffee();

    }
}

package factory;

/**
 *
 * @author lilith
 */
public class FoodStore extends Logistics{

    @Override
    public void deliver() {
        System.out.println("******** Delivering food ********");
    }

}

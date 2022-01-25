package factory;

/**
 *
 * @author lilith
 */
public abstract class Logistics {

    public abstract void deliver();
    
    public void pack(){
        System.out.println("We are packing your item: ");
    }

}

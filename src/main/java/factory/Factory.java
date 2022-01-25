package factory;

/**
 *
 * @author lilith
 */
public class Factory {
    public static void main(String[] args) {
        FoodStore fs = new FoodStore();
        fs.deliver();
        fs.pack();
        
        ClothesStore cs = new ClothesStore();
        cs.deliver();
        cs.pack();
    }
}

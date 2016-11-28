package decorator;

/**
 * Created by cs.ucu.edu.ua on 11/16/2016.
 */

public abstract class ItemDecorator implements Item {
        protected Item item;
    public ItemDecorator(Item itm){
        item = itm;
    }
}

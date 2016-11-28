package deliver;

import decorator.Item;

import java.util.LinkedList;

/**
 * Created by cs.ucu.edu.ua on 11/16/2016.
 */
public class DHLDeliveryStrategy implements IDelivery {
    public String deliver(LinkedList<Item> items){
        String bouq = "";
        for(Item bou : items) {
            bouq += bou.getDescription();
        }
        return bouq;
    }
}

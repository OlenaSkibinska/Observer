package deliver;

import decorator.Item;

import java.util.LinkedList;

/**
 * Created by cs.ucu.edu.ua on 11/16/2016.
 */
public interface IDelivery {
    String deliver(LinkedList<Item> items);
}

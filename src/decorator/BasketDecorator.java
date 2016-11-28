package decorator;

/**
 * Created by cs.ucu.edu.ua on 11/16/2016.
 */
public class BasketDecorator extends ItemDecorator {


    public BasketDecorator(Item itm) {
        super(itm);
    }
    public String  getDescription(){
        return item.toString();
    }

    @Override
    public double price() {
        return item.price();
    }

    public double getPrice(){
        return 4 + item.price();
    }

}

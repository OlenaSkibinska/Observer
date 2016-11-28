package decorator;

/**
 * Created by cs.ucu.edu.ua on 11/16/2016.
 */
public class RibbonDecorator extends ItemDecorator {
    public RibbonDecorator(Item itm) {
        super(itm);
    }
    public String  getDescription(){
        return item.toString();
    }

    @Override
    public double price() {
        return item.price() + 40;
    }

    public double getPrice(){
        return 40 + item.price();
    }
}

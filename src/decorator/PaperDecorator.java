package decorator;

/**
 * Created by cs.ucu.edu.ua on 11/16/2016.
 */
public class PaperDecorator extends ItemDecorator {
    public PaperDecorator(Item itm) {
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
        return 13 + item.price();
    }
}

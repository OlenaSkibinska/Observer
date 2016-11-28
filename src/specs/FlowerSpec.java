package specs;

import enums.FlowerColor;

/**
 * Created by cs.ucu.edu.ua on 11/18/2016.
 */
public class FlowerSpec extends Spec {
    int length;
    public FlowerSpec(int price, boolean fresh, FlowerColor color, int length) {
        super(price, fresh, color);
        this.length = length;
    }
    @Override
    public String getType(){
        return  "flower.Flower";
    }
}

package specs;

import enums.FlowerColor;

/**
 * Created by cs.ucu.edu.ua on 11/18/2016.
 */
public class CactusSpec extends Spec {
        boolean sharpness;
    public CactusSpec(int price, boolean fresh, FlowerColor color, boolean sharpness) {
        super(price, fresh, color);
        this.sharpness = sharpness;
    }

    @Override
    public String getType() {
        return "Cactus";
    }
}

package flower;

import enums.FlowerColor;
import specs.Spec;

/**
 * Created by cs.ucu.edu.ua on 10/17/2016.
 */
public abstract class Flower {
    protected Spec spec;
    public Flower(Spec a) {
        this.spec = a;
    }

    public String toString() {
        return this.getType() + ", "+ this.gerColor() + ", " + this.getPrice() + ", " + this.getFreshness();
    }


    public int getPrice() {
        return this.spec.price;
    }
    public String getType(){
        return spec.getType();
    }

    public boolean getFreshness() {return this.spec.fresh;}

    public FlowerColor gerColor(){return this.spec.color;}



}

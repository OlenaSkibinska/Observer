package observer;

import bouquet.Bouquet;
import enums.FlowerColor;
import flower.RomashkaFlower;
import specs.FlowerSpec;

/**
 * Created by cs.ucu.edu.ua on 11/22/2016.
 */
public class RomashkaSupplierObserver implements Observer {
    private Observable subject;
    public RomashkaSupplierObserver(Observable subject) {
        this.subject = subject;
    }

    public void update(Bouquet bouquet) {
        System.out.println("We need " + bouquet.countOfFlowers(new RomashkaFlower(new FlowerSpec(7, false, FlowerColor.GRAY, 12))) + " romashkas.");
    }
}

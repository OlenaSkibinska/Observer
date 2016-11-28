package observer;

import bouquet.Bouquet;
import enums.FlowerColor;
import flower.CactusFlower;
import specs.CactusSpec;


/**
 * Created by cs.ucu.edu.ua on 11/22/2016.
 */
public class CactusSupplierObserver implements Observer {
    private Observable subject;
    public CactusSupplierObserver(Observable subject){
        this.subject = subject;

    }

    public void update(Bouquet bouquet){
        System.out.println("We need " + bouquet.countOfFlowers(new CactusFlower(new CactusSpec(1, true, FlowerColor.GREEN, true))) + " cactuses.");

    }
}


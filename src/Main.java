import bouquet.Bouquet;
import decorator.BasketDecorator;
import decorator.PaperDecorator;
import decorator.RibbonDecorator;
import deliver.DHLDeliveryStrategy;
import enums.FlowerColor;
import flower.CactusFlower;
import flower.RomashkaFlower;
import order.Order;
import payment.PayPalPaymentStrategy;
import specs.CactusSpec;
import specs.FlowerSpec;

/**
 * Created by cs.ucu.edu.ua on 10/3/2016.
 */

public class Main {
    public static void main(String[] args) {
        CactusFlower cactus = new CactusFlower(new CactusSpec(1, true, FlowerColor.GREEN, true));
        CactusFlower cactus_1 = new CactusFlower(new CactusSpec(2, false, FlowerColor.GREEN, false));
        CactusFlower cactus_2 = new CactusFlower(new CactusSpec(3, true, FlowerColor.GREEN, false));
        CactusFlower cactus_3 = new CactusFlower(new CactusSpec(4, true, FlowerColor.RED, true));
        CactusFlower cactus_4 = new CactusFlower(new CactusSpec(5, true, FlowerColor.GRAY, true));
        RomashkaFlower romashka  = new RomashkaFlower(new FlowerSpec(7, false, FlowerColor.GRAY, 12));
        Bouquet my = new Bouquet();
        my.addFlowers(cactus);
        my.addFlowers(romashka);
        PaperDecorator paper = new PaperDecorator(my);
        RibbonDecorator ribbon = new RibbonDecorator(my);
        BasketDecorator basket = new BasketDecorator(my);
        for(int i = 0; i < 6; i++){
            my.addFlowers(cactus);
        }

        Order order = new Order();
        order.addItem(paper);
        order.addItem(ribbon);
        order.addItem(basket);
        order.addItem(my);
        order.setDeliveryStrategy(new DHLDeliveryStrategy());
        order.setPaymentStrategy(new PayPalPaymentStrategy());
        order.processOrder();
        System.out.println(my.countOfFlowers(cactus));
        order.notifyAllObservers(my);
    }
}

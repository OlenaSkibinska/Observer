package payment;

/**
 * Created by cs.ucu.edu.ua on 11/16/2016.
 */
public class PayPalPaymentStrategy implements IPayment {
    public double pay(double price){
        return  price;
    }
}

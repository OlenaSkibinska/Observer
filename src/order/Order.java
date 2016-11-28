package order;

import bouquet.Bouquet;
import decorator.Item;
import deliver.IDelivery;
import observer.CactusSupplierObserver;
import observer.Observable;
import observer.Observer;
import observer.RomashkaSupplierObserver;
import payment.IPayment;

import java.util.LinkedList;

/**
 * Created by cs.ucu.edu.ua on 11/16/2016.
 */
public class Order implements Observable {
    LinkedList<Item> items = new LinkedList<>();
    LinkedList<Observer> observers = new LinkedList<>();
    IPayment payment;
    IDelivery delivery;
    public Order(){
        observers.add(new CactusSupplierObserver(this));
        observers.add(new RomashkaSupplierObserver(this));
    }
    public void setPaymentStrategy(IPayment payment){
        this.payment = payment;
    }
    public void setDeliveryStrategy(IDelivery delivery){
        this.delivery = delivery;
    }
    public double calculateTotalPrice(){
        double a = 0;
        for(Item i: items){
            a += i.price();
        }
        return a;
    }
    public void processOrder(){
        payment.pay(calculateTotalPrice());
        System.out.println("Total price of order: " + this.calculateTotalPrice());
        delivery.deliver(items);
    }
    public void addItem(Item b){
        items.add(b);
    }
    public void removeItem(Item b){
        items.remove(b);
    }
    public void addObserver(Observer o){
    observers.add(o);
    }
    public void removeObserver(Observer o){
        observers.remove(o);
    }
    public void notifyAllObservers(Bouquet bouquet){
        for (Observer observer : observers){
            observer.update(bouquet);
        }
    }
}

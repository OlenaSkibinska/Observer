package observer;
import bouquet.Bouquet;

/**
 * Created by cs.ucu.edu.ua on 11/22/2016.
 */
public interface Observable {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyAllObservers(Bouquet bouquet);
}

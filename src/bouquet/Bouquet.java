package bouquet; /**
 * Created by cs.ucu.edu.ua on 10/20/2016.
 */

import decorator.Item;
import flower.Flower;

import java.util.Arrays;

public class Bouquet implements Item {
    private int defaultSize = 10;

    private int insertIndex = 0; // insert, or better create method length()
    private Flower[] a = new Flower[defaultSize];

    public void addFlowers(Flower nw) {
        checkSize();
        a[insertIndex] = nw;
        insertIndex++;
    }

    private void checkSize() {
        if (insertIndex == defaultSize - 1) {
            defaultSize *= 2;
            Flower[] b = new Flower[defaultSize];
            for (int i = 0; i <= insertIndex; i++) {
                b[i] = a[i];
            }
            a = b;
        }
    }



    public String toString() {
        String s = "";
        for (int i = 0; i < insertIndex; i++) {
            s += a[i].toString() + "\n";
        }
        return s;
    }

    public double price() {
        double sum = 0;
        for (int i = 0; i < insertIndex; i++) {
            sum += a[i].getPrice();
        }
        return sum;
    }





    public Flower[] searchFlower(Flower flower) {
        int l = 0;
        Flower[] tmp = new Flower[a.length];
        for (int i = 0; i < insertIndex; i++) {
            if (a[i].getPrice() == flower.getPrice() && a[i].gerColor() == flower.gerColor()
                    && a[i].getFreshness() == flower.getFreshness()){
                tmp[l] = a[i];
                l+= 1;
            }
        }

        Flower[] d = Arrays.copyOf(tmp, l);
        return d;
    }
    public String  getDescription(){
        return this.toString();
    }

    public int countOfFlowers(Flower flor){
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] == null){
                continue;
            }
            if(flor.getType() == a[i].getType()){
                sum++;
            }
        }
        return sum;
    }

}
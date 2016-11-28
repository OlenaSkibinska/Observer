package enums;

/**
 * Created by cs.ucu.edu.ua on 10/17/2016.
 */
public enum FlowerColor {
    RED, GREEN, GRAY;

    //@Override
    public String toString() {

        switch (this) {
            case GREEN:
                return "Green"; // якщо нема брейку. то буде виводити останній елмент
            case RED:
                return "Red";
            case GRAY:
                return "Gray";
            default:
               return  "no color";

        }
    }
}

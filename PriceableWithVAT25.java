package Excercise1;


public interface PriceableWithVAT25 extends Priceable {

    public default double getVAT() {
        return 0.25;
    }

}

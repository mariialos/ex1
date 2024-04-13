package Excercise1;



public interface PriceableWithVAT6 extends Priceable {
	@Override
	default public double getVAT() {
		return 0.06;
	}
}



package Exercise4;

public interface PriceableWithVAT25 extends Priceable {
	@Override
	default public double getVAT() {
		return 0.25;
	}
}

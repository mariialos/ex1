package Excercise1;



abstract public class Item implements Priceable {
	final private String name;
	protected Item(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
}

package Exercise4;



public class Book extends Item implements PriceableWithVAT6 {
	final private double price;
	final private boolean bound;
	final private String author;
	
	public Book(String name, String author, double price, boolean bound){
		super(name);
		this.price = (bound ? price * 1.30 : price);
		this.author = author;
		this.bound = bound;	
	}
	
	public double getPrice() {
		return price;
	}
	
	
	@Override	
	public String toString() {
		return String.format("name='%s', author='%s', bound=%b, price=%.1f, price+vat=%.1f", super.getName(), this.author, this.bound, this.price, getPriceWithVAT());
	}
	
//	Book { name='Beethoven: a biography', author='Holmqvist', bound=false, price=400.0, price+vat=424.0 }

}

package Excercise1;



public class Book extends Item implements PriceableWithVAT6 {
	public static final double BOUND_BONUS = 0.3;
	private final String author;
	private final double price;
	private final boolean bound;
	
	
	public Book(String name, String author, double price, boolean bound){
		super(name);
		this.author = author;
		this.price = price;
		this.bound = bound;	
	}
	
	@Override
	public double getPrice() {
		//return (bound) ? price * (1 + BOUND_BONUS) : price;
		return bound ? price * 1.3 : price;
	}
	
	
	@Override	
	public String toString() {
		//return String.format("Book { name='%s', author='%s', bound=%b, price=%.1f, price+vat=%.1f }", getName(), this.author, this.bound, this.price, getPriceWithVAT());
	
	   return "Book { name = '" + getName() + "', author = '" + author + "', " + "bound = " + bound + ", price= " + getPrice() + ", price+vat " + getPriceWithVAT();
	}
	
//	Book { name='Beethoven: a biography', author='Holmqvist', bound=false, price=400.0, price+vat=424.0 }

}

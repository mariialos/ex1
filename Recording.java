package Exercise4;

public abstract class Recording extends Item implements PriceableWithVAT25 {
	final private String artist;
	final private int year;
	private int condition;
	final private double price;
	
	protected Recording(String name, String artist, int year, int condition, double price){
		super(name);
		this.artist = artist;
		this.year = year;
		this.condition = condition;
		this.price = price;	
	}

	abstract public String getType();
	
	public double getPrice() {
		double price = 0.1 * condition * getOriginalPrice();
        return (price < 10) ? 10 : price;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public int getYear() {
		return year;
	}
	
	public int getCondition() {
		return condition;
	}
	
	private double getOriginalPrice() {
		return price;
	}
	
	@Override	
	public String toString() {
		return String.format("name='%s', artist='%s', year=%d, condition=%d, original price=%.1f, price=%.1f, price+vat=%.1f", getName(), getArtist(), getYear(), 
				getCondition(), getOriginalPrice(), getPrice(), getPriceWithVAT());
	}
/*	
	LP { name=Giant Steps, artist='John Coltrane', year=1959, condition=10, original price=100.0,
			price=410.0, price+vat=512.5 }*/
	
/*    public String toString() {
        return getType() + " { name=" + super.getName() + ", artist='" + getArtist() + "', year="
                + getYear() + ", condition=" + getCondition() + ", original price=" + getOriginalPrice()
                + ", price=" + getPrice() + ", price+vat=" + getPriceWithVAT() + " }";
    }*/
}

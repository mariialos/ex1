package Exercise4;

import java.util.ArrayList;
import java.util.List;

public class Order {
	final private long orderNumber;
	static private long counter = 0;
	final private List<Item> items;
	
	public Order(Item...items) {
		counter++;
		this.orderNumber = counter;
		
		this.items = new ArrayList<>();
		for(Item i:items) {
			this.items.add(i);
		}

	}
	
	public String getReceipt() {
		String receipt = "";
		receipt += "Receipt for order #" + orderNumber + "\n"+"-----------" + "\n";

		for(Item i:items) {
			receipt+= i.toString() + "\n";
		}
		receipt += "\n";
		receipt += "Total excl. VAT: " + getTotalValue() + "\n";
		receipt +=  "Total incl. VAT: " + getTotalValuePlusVAT();
		return receipt;
	}
	
	public double getTotalValuePlusVAT() {
		double sum = 0;
		for(Item i : items) {
			sum = sum + i.getPriceWithVAT();	
		}
		
		return sum;		
	}
	
	public double getTotalValue() {
		double sum = 0;
		for(Item i : items) {
			sum = sum + i.getPrice();	
		}
		
		return sum;
	}
}

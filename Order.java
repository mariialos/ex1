package Excercise1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order {
	private static long counter = 0;
	private final long orderNumber = ++counter;
	private final List<Item> items;
	
	public Order(Item...items) {
		/*
		 * ++counter; this.orderNumber = counter;
		 */
		this.items = new ArrayList<>(Arrays.asList(items));
		/*
		 * for(Item i:items) { this.items.add(i); }
		 */

	}
	
	public String getReceipt() {
		/*
		 * String receipt = ""; receipt += "Receipt for order #" + orderNumber +
		 * "\n"+"-----------" + "\n";
		 * 
		 * for(Item item : items) { receipt+= item + "\n"; } receipt += "\n"; receipt +=
		 * "Total excl. VAT: " + getTotalValue() + "\n"; receipt += "Total incl. VAT: "
		 * + getTotalValuePlusVAT(); return receipt;
		 */
		
		String str = "Receipt for order #" + orderNumber + "\n-----------\n";
		for(Item item : items)
			str += item + "\n";
		str += "Total excl. VAT: " + getTotalValue()  + "\n";
		str += "Total incl. VAT: " + getTotalValuePlusVAT()  + "\n";
		return str;
	}
	
	public double getTotalValuePlusVAT() {
		double sum = 0;
		for(Item item : items) {
			sum = sum + item.getPriceWithVAT();	
		}
		
		return sum;		
	}
	
	public double getTotalValue() {
		double sum = 0;
		for(Item item : items) {
			sum  = sum + item.getPrice();	
		}
		
		return sum;
	}
}

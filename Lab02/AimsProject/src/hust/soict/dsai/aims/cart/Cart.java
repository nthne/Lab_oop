package hust.soict.dsai.aims.cart;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class Cart {

	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	
	public void addMedia(Media... itemsList) {
		for(Media add_item : itemsList) {
			if(add_item == null) continue;
			boolean check = true;
			for(Media item : itemsOrdered)
			{
				if(item == add_item) {
					check = false;
					System.out.println("The item is already in the cart.");
					break;
				}
			}
			if(check == true) {
				itemsOrdered.add(add_item);
				System.out.println("The item has been added.");
			}
		}
	}
	
	public void removeMedia(Media remove_item) {
		boolean check = itemsOrdered.remove(remove_item);
		if(check == false) {
			System.out.println("The disc is not in the cart");
		}	
		else System.out.println("The item has been removed.");

	}
	public BigDecimal totalCost() {
		double sum = 0;
		for(Media item : itemsOrdered)
		{
			sum += item.getCost();
		}
		BigDecimal bd = new BigDecimal(sum);
        bd = bd.setScale(2, RoundingMode.HALF_UP);  // Làm tròn đến 2 chữ số thập phân
		return bd;
	}
	
	public void print() {
		System.out.println("***********************CART***********************\r\n"
				+ "Ordered Items:");
		int i = 1;
		for (Media item : itemsOrdered)
		{
			System.out.println(i + item.toString());		
			i++;
		}
		System.out.println("Total cost: " + totalCost() + " $\n***************************************************");

	}

	public void Search_by_ID(int id) {
		boolean check = false;
		for (Media item : itemsOrdered)
			if(item.getId() == id) {
				check = true;
				System.out.println(item.toString());
				break;
			}
		if(check == false) System.out.println("No match is found");
	}

	public void Search_by_Title(String title) {
		boolean check = false;
		for (Media item : itemsOrdered)
			if(item.isMatch(title) == true) {
				System.out.println(item.toString());
				check = true;
			}
		if(check == false) System.out.println("No match is found");
	}
	
}

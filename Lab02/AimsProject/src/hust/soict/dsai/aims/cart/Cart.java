package hust.soict.dsai.aims.cart;
import java.math.BigDecimal;
import java.math.RoundingMode;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {

	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = 
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered < MAX_NUMBERS_ORDERED)
		{
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println("The disc has been added.");
		}
		else System.out.println("The cart is almost full.");
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int i = 0;
		for(; i < qtyOrdered ; i++)
			if (itemsOrdered[i] == disc)
			{	
				qtyOrdered--;
				for(int j = i ; j < qtyOrdered ; j++)
					itemsOrdered[j] = itemsOrdered[j+1];
				System.out.println("The disc has been removed.");
				break;				
			}
		if(i == qtyOrdered) System.out.println("The disc is not in the cart");
	}
	public BigDecimal totalCost() {
		double sum = 0;
		for(int i = 0 ; i < qtyOrdered ; i++)
		{
			sum += itemsOrdered[i].getCost();
		}
		BigDecimal bd = new BigDecimal(sum);
        bd = bd.setScale(2, RoundingMode.HALF_UP);  // Làm tròn đến 2 chữ số thập phân
		return bd;
	}
	
	public void print() {
		System.out.println("***********************CART***********************\r\n"
				+ "Ordered Items:");
		for (int i = 0; i < qtyOrdered; i++)
		{
			System.out.println((i+1) + itemsOrdered[i].toString());			
		}
		System.out.println("Total cost: " + totalCost() + " $\n***************************************************");
		
	}
	
	public void Search_by_ID(int id) {
		int i = 0;
		for ( ; i < qtyOrdered; i++)
			if(itemsOrdered[i].getID() == id) {
				System.out.println(itemsOrdered[i].toString());
				break;
			}
		if(i == qtyOrdered) System.out.println("No match is found");
	}
	
	public void Search_by_Title(String title) {
		int i = 0;
		boolean check = false;
		for ( ; i < qtyOrdered; i++)
			if(itemsOrdered[i].isMatch(title) == true) {
				System.out.println(itemsOrdered[i].toString());
				check = true;
			}
		if(check == false) System.out.println("No match is found");
	}
}

package hust.soict.dsai.aims.store;
import java.util.ArrayList;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
	
	private ArrayList<DigitalVideoDisc> itemsInStore = 
			new ArrayList<>();
	
	public void addDVD(DigitalVideoDisc disc) {
		
		itemsInStore.add(disc);
		System.out.println("The disc has been added.");
	}
	public void removeDVD(DigitalVideoDisc disc) {
		int i = 0;
		for(; i < itemsInStore.size() ; i++)
			if (itemsInStore.get(i) == disc)
			{	
				itemsInStore.remove(i);
				System.out.println("The disc has been removed.");
				break;				
			}
		if(i == itemsInStore.size()) System.out.println("The disc is not in the cart");
	}

	public void print() {
		int j = 0;
		System.out.println("***********************STORE***********************\r\n"
				+ "Items in Store:");
		for (DigitalVideoDisc i : itemsInStore)
		{
			j++;
			System.out.println(j + i.toString());			
		}
		System.out.println("***************************************************");
		
	}
}

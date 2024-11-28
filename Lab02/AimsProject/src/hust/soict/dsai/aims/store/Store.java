package hust.soict.dsai.aims.store;
import java.util.ArrayList;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class Store {
	
	private ArrayList<Media> itemsInStore = 
			new ArrayList<Media>();
	
	public void addMedia(Media item) {
		
		itemsInStore.add(item);
		System.out.println("The disc has been added.");
	}
	public void addMedia(Media... itemsList) {
		for(Media add_item : itemsList) {
			if(add_item == null) continue;
			boolean check = true;
			for(Media item : itemsInStore)
			{
				if(item == add_item) {
					check = false;
					System.out.println("The item is already in the store.");
					break;
				}
			}
			if(check == true) {
				itemsInStore.add(add_item);
				System.out.println("The item has been added.");
			}
		}
	}
	public void removeMedia(Media item) {
		boolean check = itemsInStore.remove(item);
		if(check == false) System.out.println("The disc is not in the cart");
		else System.out.println("The disc has been removed.");

	}

	public void print() {
		int j = 0;
		System.out.println("***********************STORE***********************\r\n"
				+ "Items in Store:");
		for (Media i : itemsInStore)
		{
			j++;
			System.out.println(j + i.toString());			
		}
		System.out.println("***************************************************");
		
	}
}

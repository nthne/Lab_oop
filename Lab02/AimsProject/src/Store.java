
public class Store {
	
	private static final int MAX_NUMBERS_ITEMS = 100;
	private DigitalVideoDisc itemsInStore[] = 
			new DigitalVideoDisc[MAX_NUMBERS_ITEMS];
	
	private int qtyOrdered = 0;
	public void addDVD(DigitalVideoDisc disc) {
		if (qtyOrdered < MAX_NUMBERS_ITEMS)
		{
			itemsInStore[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println("The disc has been added.");
		}
		else System.out.println("The cart is almost full.");
	}
	public void removeDVD(DigitalVideoDisc disc) {
		int i = 0;
		for(; i < qtyOrdered ; i++)
			if (itemsInStore[i] == disc)
			{	
				qtyOrdered--;
				for(int j = i ; j < qtyOrdered ; j++)
					itemsInStore[j] = itemsInStore[j+1];
				System.out.println("The disc has been removed.");
				break;				
			}
		if(i == qtyOrdered) System.out.println("The disc is not in the cart");
	}

}

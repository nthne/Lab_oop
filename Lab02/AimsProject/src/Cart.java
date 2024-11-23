import java.math.BigDecimal;
import java.math.RoundingMode;

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
	
//	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
//		for(int i = 0; i < dvdList.length; i++)
//			if (qtyOrdered < MAX_NUMBERS_ORDERED && dvdList[i] != null)
//		{
//			itemsOrdered[qtyOrdered] = dvdList[i];
//			qtyOrdered++;
//			System.out.println("The disc has been added.");
//		}
//		else System.out.println("The cart is almost full or the list is empty.");
//	
//	}
//	
	public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
		for(DigitalVideoDisc dvd : dvdList)
			if (qtyOrdered < MAX_NUMBERS_ORDERED && dvd != null)
		{
			itemsOrdered[qtyOrdered] = dvd;
			qtyOrdered++;
			System.out.println("The disc has been added.");
		}
		else System.out.println("The cart is almost full or no more any disc.");
	
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2){
		if (qtyOrdered < MAX_NUMBERS_ORDERED)
		{
			itemsOrdered[qtyOrdered] = dvd1;
			qtyOrdered++;
			System.out.println("The disc has been added.");
		}
		else System.out.println("The cart is almost full.");
	
		if (qtyOrdered < MAX_NUMBERS_ORDERED)
		{
			itemsOrdered[qtyOrdered] = dvd2;
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
	
}

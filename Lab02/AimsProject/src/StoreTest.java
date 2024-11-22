
public class StoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a new cart
		Store Items = new Store();
		
		//Create new dvd objects and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Allers", 87, 19.95f);
		Items.addDVD(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
				"Science Fiction", "George Lucas", 87, 24.95f);
		Items.addDVD(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
				"Animation", 18.99f);
		Items.addDVD(dvd3);
		
		Items.print();
		
		Items.removeDVD(dvd1);
		Items.removeDVD(dvd2);
		
		Items.print();

	}

}


public class CartTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a new cart
		Cart cart = new Cart();
		
		//Create new dvd objects and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Allers", 87, 19.95f);
		cart.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
				"Science Fiction", "George Lucas", 87, 24.95f);
		cart.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
				"Animation", 18.99f);
		cart.addDigitalVideoDisc(dvd3);
		
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Kings of African Wildlife",
				"Animation", 17.99f);
		cart.addDigitalVideoDisc(dvd4);

		//Test the print method
		cart.print();
		//To-do: Test the search methods 
		cart.Search_by_ID(5);
		cart.Search_by_ID(2);

		cart.Search_by_Title("lion and monkey");
		cart.Search_by_Title("star");
		cart.Search_by_Title("king of forest");

			
	}

}

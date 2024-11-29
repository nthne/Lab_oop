package hust.soict.dsai.aims;
import java.util.Scanner;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Track;
import hust.soict.dsai.aims.store.Store;

public class Aims {

	 public static void showMenu() {
		 System.out.println("AIMS: ");
		 System.out.println("--------------------------------");
		 System.out.println("1. View store");
		 System.out.println("2. Update store");
		 System.out.println("3. See current cart");
		 System.out.println("0. Exit");
		 System.out.println("--------------------------------");
		 System.out.println("Please choose a number: 0-1-2-3");
	}
	 
	 public static void storeMenu() {
		 System.out.println("Options: ");
		 System.out.println("--------------------------------");
		 System.out.println("1. See a media’s details");
		 System.out.println("2. Add a media to cart");
		 System.out.println("3. Play a media");
		 System.out.println("4. See current cart");
		 System.out.println("0. Back");
		 System.out.println("--------------------------------");
		 System.out.println("Please choose a number: 0-1-2-3-4");
	 }

	 
	 public static void mediaDetailsMenu() {
		 System.out.println("Options: ");
		 System.out.println("--------------------------------");
		 System.out.println("1. Add to cart");
		 System.out.println("2. Play");
		 System.out.println("0. Back");
		 System.out.println("--------------------------------");
		 System.out.println("Please choose a number: 0-1-2");
	 }
	 
	 public static void mediaDetailsMenuBook() {
		 System.out.println("Options: ");
		 System.out.println("--------------------------------");
		 System.out.println("1. Add to cart");
		 System.out.println("0. Back");
		 System.out.println("--------------------------------");
		 System.out.println("Please choose a number: 0-1-2");
	 }
	 
	 public static void cartMenu() {
		 System.out.println("Options: ");
		 System.out.println("--------------------------------");
		 System.out.println("1. Filter medias in cart");
		 System.out.println("2. Sort medias in cart");
		 System.out.println("3. Remove media from cart");
		 System.out.println("4. Play a media");
		 System.out.println("5. Place order");
		 System.out.println("0. Back");
		 System.out.println("--------------------------------");
		 System.out.println("Please choose a number: 0-1-2-3-4-5");
	 }
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		 
		//Create store
		Store store = new Store();
		
		//Create a new cart
		Cart cart = new Cart();
		
		//Create new dvds and add them to the store
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Allers", 87, 19.95f);		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
				"Science Fiction", "George Lucas", 87, 24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
				"Animation", 18.99f);
		
		//Create new CD
		CompactDisc CD = new CompactDisc("Huyen", "Quang Hung");
		Track t = new Track("Troi Trong xanh");
		CD.addTrack(t);
		t = new Track("Tinh dau qua chen", 520);
		CD.addTrack(t);
		
		//Create new Book
		Book book = new Book("Conan","vvf",2.5f);
		Book book1 = new Book("Cona","vvf",4.4f);
		Book book2 = new Book("fefd","vvf",0.4f);
		Book book3 = new Book("veede","vvf",0.5f);
		
		store.addMedia(dvd1,dvd2,dvd3,CD,book,book1,book2,book3);
		
		showMenu();
		int menuMain = scanner.nextInt();
		switch(menuMain) {
		case 0:
			break;
		case 1:
			store.print();
			storeMenu();
			int menuStore = scanner.nextInt();
			switch(menuStore) {
			case 0:
				break;
			case 1:
				scanner.nextLine();
				System.out.println("Enter the title of the media: ");
				String title = scanner.nextLine();
				boolean c = false;
				for(Media item : store.itemsInStore) {
					if(item.isMatch(title)) {
						System.out.println(item.toString());
						Book check = new Book();
						if(item.getClass() == check.getClass()) mediaDetailsMenuBook();
						else mediaDetailsMenu();
						c = true;
						break;
					}	
				}
				if(c == false) 	System.out.println("No match is found.");
				break;
			case 2:
				store.print();
				scanner.nextLine();
				System.out.println("Enter the title of the media that you want to add to the cart: ");
				title = scanner.nextLine();
				c = false;
				for(Media item : store.itemsInStore) {
					if(item.isMatch(title)) {
						cart.addMedia(item);
						System.out.println("Number of medias in the cart: " + cart.itemsOrdered.size());
						c = true;
						break;
					}	
				}
				if(c == false) 	System.out.println("No media has this title.");
				break;
			case 3:
				store.print();
				scanner.nextLine();
				System.out.println("Enter the title of the media that you want to play: ");
				title = scanner.nextLine();
				c = false;
				for(Media item : store.itemsInStore) {
					if(item.isMatch(title)) {
						c = true;
						break;
					}	
				}
				if(c == false) 	System.out.println("No media has this title.");
				break;
			case 4:
				break;
			default:
				break;
			}
			break;
		case 2:
			System.out.println("You can add a media to or remove a media from the store.");

			break;
		case 3:
			cart.print();
			cartMenu();
			int menuCart = scanner.nextInt();
			switch(menuCart) {
			case 0:
				break;
			case 1:
				System.out.println("Choose one of two filtering options: \n 1. Id \n 2. Title");
				int choose = scanner.nextInt();
				if(choose == 1) {
					System.out.println("Enter the id: ");
					choose = scanner.nextInt();
					cart.Search_by_ID(choose);
				} else if(choose == 2) {
					System.out.println("Enter the title: ");
					String title = scanner.nextLine();	
					cart.Search_by_Title(title);
				} else 
					System.out.println("There are only two filtering options.");
				break;
			case 2:
				System.out.println("Choose one of two sorting options: \n 1. Title \n 2. Cost");
				choose = scanner.nextInt();
				if(choose == 1) {
					cart.sort_by_title();
					cart.print();
				} else if(choose == 2) {
					cart.sort_by_cost();
					cart.print();
				} else 
					System.out.println("There are only two sorting options.");
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				System.out.println("An order is created.");
				cart = new Cart();
				break;
			default:
				break;
			}
			break;
		default:
			break;
		}
		
	}

}

package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class Media {

	private int id;
	private String title;
	private String category;
	private float cost;
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = 
			new MediaComparatorByCostTitle();
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = 
			new MediaComparatorByTitleCost();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}

	public String toString() {
		return (". Media - " + this.getTitle() + " - " + this.getCategory() + ": " + this.getCost() + " $");
		
	}
	
	public boolean isMatch(String title) {
		title = title.toLowerCase();
		String titles[] = title.split(" ");
		boolean check = false;
		title = this.getTitle().toLowerCase();
		for(String t : titles) {
			if(title.contains(t)) {
				check = true;
				break;
			}
		}
		return(check);
	}

	public boolean equals(Media obj) {
		return (obj.title == this.title);
	}
	
	public Media() {}
	public Media(String title) {
		this.title = title;
	}
	public Media(String title, String category, float cost) {
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	
	public static void main(String[] args) {
		
		List<Media> mediae = new ArrayList<Media>();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Allers", 87, 19.95f);
		mediae.add(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("conan",
				"Animation", "Roger Allers", 87, 19.95f);
		mediae.add(dvd2);
		
		CompactDisc CD = new CompactDisc("Huyen", "Quang Hung");
		Track t = new Track("Troi Trong xanh");
		CD.addTrack(t);
		t = new Track("Tinh dau qua chen", 520);
		CD.addTrack(t);
		
		Book book = new Book("Conan","vvf",2.5f);
		mediae.add(book);
		Book book1 = new Book("Cona","vvf",4.4f);
		mediae.add(book1);
		Book book2 = new Book("fefd","vvf",0.4f);
		mediae.add(book2);
		Book book3 = new Book("veede","vvf",0.5f);
		mediae.add(book3);
		book.addAuthor("nth");
		
		mediae.add(CD);
		
		
		
		
		for(Media m : mediae) {
			System.out.println(m.toString());
		}
		
		System.out.println("COMPARE_BY_COST_TITLE\n\n");
		Collections.sort(mediae, Media.COMPARE_BY_COST_TITLE);		
		for(Media m : mediae) {
			System.out.println(m.toString());
		}
		System.out.println("COMPARE_BY_TITLE_COST");

		Collections.sort(mediae, Media.COMPARE_BY_TITLE_COST);		
		for(Media m : mediae) {
			System.out.println(m.toString());
		}//each type of media use the toString method that was overided in its class.
	}
	

	

}

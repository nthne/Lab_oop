package hust.soict.dsai.aims.media;

public class Disc extends Media{

	private int length;
	private String director;

	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	public Disc() {}
	public Disc(String title) {
		super();
		this.setTitle(title);
	}
	public Disc(String title, String category, float cost) {
		super();
		this.setTitle(title);
		this.setCategory(category);
		this.setCost(cost);
	}
	public Disc(String title, String category, String director, float cost) {
		super();
		this.setTitle(title);
		this.setCategory(category);
		this.setDirector(director);
		this.setCost(cost);
	}
	public Disc(String title, String category, String director, int length, float cost) {
		super();
		this.setTitle(title);
		this.setCategory(category);
		this.setDirector(director);
		this.setLength(length);
		this.setCost(cost);
	}
	
	public String toString() {
		return (". DVD - " + super.getTitle() + " - " + super.getCategory() + " - " 
				+ director + " - " + length + ": " + super.getCost() + " $");
		
	}
	
	public boolean isMatch(String title) {
		title = title.toLowerCase();
		String titles[] = title.split(" ");
		boolean check = false;
		title = super.getTitle().toLowerCase();
		for(String t : titles) {
			if(title.contains(t)) {
				check = true;
				break;
			}
		}
		return(check);
	}
}

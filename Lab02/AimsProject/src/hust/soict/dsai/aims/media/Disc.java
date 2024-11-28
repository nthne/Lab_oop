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
		super(title);
	}
	public Disc(String title, String category, float cost) {
		super(title, category, cost);
	}
	public Disc(String title, String category, String director, float cost) {
		super(title, category, cost);
		this.director = director;
	}
	public Disc(String title, String category, String director, int length, float cost) {
		super(title, category, cost);
		this.director = director;
		this.length = length;
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

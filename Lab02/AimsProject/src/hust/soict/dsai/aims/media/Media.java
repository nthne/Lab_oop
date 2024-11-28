package hust.soict.dsai.aims.media;

public abstract class Media {

	private int id;
	private String title;
	private String category;
	private float cost;
	
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
		return (". DVD - " + this.getTitle() + " - " + this.getCategory() + ": " + this.getCost() + " $");
		
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

	public Media() {
		// TODO Auto-generated constructor stub
	}

}

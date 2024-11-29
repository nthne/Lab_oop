package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable{

	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	
	public String getArtist() {
		return artist;
	}

	public int getLength() {
		
		int sum = 0;
		for(Track track : this.tracks) {
			sum += track.getLength();
		}
		return sum;

	}
	
	public void addTrack(Track trackName) {
		if(this.tracks.contains(trackName)) {
			System.out.println("The input track is already in the list of tracks.");
		} else {
			this.tracks.add(trackName);
			System.out.println("The input track has been added.");
		}
	}
	
	public void removeTrack(Track trackName) {
		
		boolean check = this.tracks.remove(trackName);
		if(check == false) System.out.println("The input track is not in the list of tracks.");
	}

	public void play() {
		 System.out.println("Compact Disc Name: " + this.getTitle());
		 System.out.println("Artist: " + this.getArtist());
		 
		 System.out.println("There are " + this.tracks.size() + " tracks in the compact disc ");
		 int i = 1;
		 for(Track track : this.tracks) {
			 System.out.print(i + ". \n");
			 track.play();
			 i++;
		 }
	}
	
	public String toString() {
		return (". CD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getArtist() + ": " + this.getCost() + " $");
		
	}
	
	public CompactDisc(String title) {
		super(title);
	}
	public CompactDisc(String title, String artist) {
		super(title);
		this.artist = artist;
	}
	public CompactDisc(String title, String artist, String category, float cost) {
		super(title, category, cost);
		this.artist = artist;
	}
	public CompactDisc(String title, String artist, String category, String director, float cost) {
		super(title, category, director, cost);
		this.artist = artist;
	}
	public CompactDisc(String title, String artist, String category, String director, int length, float cost) {
		super(title, category, director, length, cost);
		this.artist = artist;
	}
	public CompactDisc(String title, String artist, List<Track> tracks) {
		super(title);
		this.artist = artist;
		this.tracks = tracks;
	}
	
	public static void main(String[] args) {
		
		CompactDisc CD = new CompactDisc("Huyen", "Quang Hung");
		Track t = new Track("Troi Trong xanh");
		CD.addTrack(t);
		t = new Track("Tinh dau qua chen", 520);
		CD.addTrack(t);
		CD.play();

	}


}



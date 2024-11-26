package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc{

	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	
	public String getArtist() {
		return artist;
	}

	public void addTrack(Track trackName) {
		
		boolean check = true;
		for(Track track : this.tracks) {
			if(track.getTitle() == trackName.getTitle()) {
				check = false;
				System.out.println("The input track is already in the list of tracks.");
				break;
			}
			if(check == true) this.tracks.add(trackName);
			
		}
	}
	
	public void removeTrack(Track trackName) {
		
		boolean check = true;
		for(Track track : this.tracks) {
			if(track.getTitle() == trackName.getTitle()) {
				check = false;
				this.tracks.remove(trackName);
				break;
			}
			if(check == true) System.out.println("The input track is not in the list of tracks.");
			
		}
	}

	public int getLength() {
		
		int sum = 0;
		for(Track track : this.tracks) {
			sum += track.getLength();
		}
		return sum;

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

}

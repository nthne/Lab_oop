package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{

	private List<String> authors = new ArrayList<String>();
	
	
	public List<String> getAuthors() {
		return authors;
	}
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	public void addAuthor(String authorName) {
		boolean check = true;
		for(String author : authors) {
			if(author == authorName) {
				check = false;
				break;
			}
		if(check == true) {
			authors.add(authorName);
		}
		}
	}
	
	public void removeAuthor(String authorName) {
		
		for(String author : authors) {
			if(author == authorName) {
				authors.remove(authorName);
				break;
			}
		}
	}

	public Book() {
		// TODO Auto-generated constructor stub
	}

}

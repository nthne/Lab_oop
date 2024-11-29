package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media>{

	@Override
	public int compare(Media o1, Media o2) {
		float c1 = o1.getCost();
		float c2 = o2.getCost();
		if(c1 > c2) return -1;
		else if(c1 < c2) return 1;
		return compare_by_title(o1, o2);
	}

	public int compare_by_title(Media o1, Media o2){

		String str1 = o1.getTitle().toLowerCase();
		String str2 = o2.getTitle().toLowerCase();
		for(int i = 0; i < min(str1.length(),str2.length()); i++) {
			if(str1.charAt(i) < str2.charAt(i)) return -1;
			else if(str1.charAt(i) > str2.charAt(i)) return 1;
		}
		if(str1.length() < str2.length()) return -1;
		else if(str1.length() > str2.length()) return 1;
		return 0;
		
	}

	public int min(int l1, int l2) {
		if(l1 < l2) return l1;
		else return l2;
	}

}

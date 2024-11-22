
public class TestPassingParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		
		swap(jungleDVD, cinderellaDVD);
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());

//		changeTitle(jungleDVD, cinderellaDVD.getTitle());
//		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
	}

	public static void swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		String tmp = dvd1.getTitle();
		dvd1.setTitle(dvd2.getTitle());
		dvd2.setTitle(tmp);
		
		tmp = dvd1.getCategory();
		dvd1.setCategory(dvd2.getCategory());
		dvd2.setCategory(tmp);
		
		tmp = dvd1.getDirector();
		dvd1.setDirector(dvd2.getDirector());
		dvd2.setDirector(tmp);
		
		float tmpCost = dvd1.getCost();
		dvd1.setCost(dvd2.getCost());
		dvd2.setCost(tmpCost);
		
		int tmpLength = dvd1.getLength();
		dvd1.setLength(dvd2.getLength());
		dvd2.setLength(tmpLength);
		
	}
	
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}
}

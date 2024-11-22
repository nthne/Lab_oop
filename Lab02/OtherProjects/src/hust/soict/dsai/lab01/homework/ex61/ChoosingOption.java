package hust.soict.dsai.lab01.homework.ex61;

import javax.swing.JOptionPane;
public class ChoosingOption {
	public static void main(String[] args) {
		//origin: If users choose "Cancel", it will return "You've chosen: No"
		int option = JOptionPane.showConfirmDialog(null,  "Do you want to change to the first class ticket?");
		
		JOptionPane.showMessageDialog(null,  "You've chosen: " + (option == JOptionPane.YES_OPTION?"Yes":"No"));


		//customize only two options "Yes" and "No" 
		int option1 = JOptionPane.showConfirmDialog(
				null, 
				"Do you want to change to the first class ticket?",
				"Choose your option", 
				JOptionPane.YES_NO_OPTION
		);
		JOptionPane.showMessageDialog(null, "You're chosen: " + (option1==JOptionPane.YES_OPTION?"Yes":"No"));
		
		
		//customize options "I do" and "I don't" 
		Object[] options = {"I do", "I don't"};
		int option2 = JOptionPane.showOptionDialog(
	            null, 
	            "Do you want to change to the first class ticket?", 
	            "Choose your option", 
	            JOptionPane.YES_NO_OPTION, 
	            JOptionPane.QUESTION_MESSAGE, 
	            null, 
	            options, 
	            options[0]
	        );
		
		JOptionPane.showMessageDialog(null, "You're chosen: " + (option2==JOptionPane.YES_OPTION?"I do":"I don't"));
		
		System.exit(0);
	}
}

//If users choose "Cancel", it will return "You've chosen: No"
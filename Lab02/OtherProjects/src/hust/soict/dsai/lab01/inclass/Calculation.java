package hust.soict.dsai.lab01.inclass;

import javax.swing.JOptionPane;
public class Calculation {
	public static void main(String[] args){
		String strNum1, strNum2;
		
		strNum1 = JOptionPane.showInputDialog(null,
				"Please input the first number: ","Input the first number",
				JOptionPane.INFORMATION_MESSAGE);
		
		double num1 = Double.parseDouble(strNum1);

		strNum2 = JOptionPane.showInputDialog(null,
				"Please input the second number: ","Input the second number",
				JOptionPane.INFORMATION_MESSAGE);
		
		double num2 = Double.parseDouble(strNum2);

		double sum = num1+num2, dif = num1 - num2, pro = num1*num2;
		
		if(num2==0) JOptionPane.showMessageDialog(null,"The sum of two numbers is: " + sum + '\n' + "The difference of two numbers is: " + dif + '\n' + "The product of two numbers is: " + pro + '\n' + "The quotient of two numbers is: Error because the divisor = 0" + '\n',"Show results", JOptionPane.INFORMATION_MESSAGE);
		else JOptionPane.showMessageDialog(null,"The sum of two numbers is: " + sum + '\n' + "The difference of two numbers is: " + dif + '\n' + "The product of two numbers is: " + pro + '\n' + "The quotient of two numbers is: " + (num1/num2) + '\n',"Show results", JOptionPane.INFORMATION_MESSAGE);

		System.exit(0);
	}
}
package hust.soict.dsai.lab01.inclass;

import javax.swing.JOptionPane;
public class SolveEquation {
	public static void main(String[] args){
		
//Solve the first-degree equation with one variable: ax + b = 0
		String stra, strb;
		
		stra = JOptionPane.showInputDialog(null,
				"Please input a: ",
				"Solve equation: ax + b = 0",
				JOptionPane.INFORMATION_MESSAGE);
		
		double a = Double.parseDouble(stra);

		strb = JOptionPane.showInputDialog(null,
				"Please input b: ",
				"Solve equation: ax + b = 0",
				JOptionPane.INFORMATION_MESSAGE);
		
		double b = Double.parseDouble(strb);

		if(a == 0 && b==0) JOptionPane.showMessageDialog(null,"The equation has infinitely many solution","Result", JOptionPane.INFORMATION_MESSAGE);
		else if(a == 0) JOptionPane.showMessageDialog(null,"The equation has no solution","Result", JOptionPane.INFORMATION_MESSAGE);
		else JOptionPane.showMessageDialog(null,"The root of equation is: x = " + (-b/a),"Result", JOptionPane.INFORMATION_MESSAGE);




//Solve system of first-degree equation with two variable: a11.x1 + a12.x2 = b1.a21.x1 + a22.x2 = b2
		String stra11, stra12, stra21, stra22, strb1, strb2;
		
		stra11 = JOptionPane.showInputDialog(null,
				"Please input a11: ",
				"Solve equation: a11.x1 + a12.x2 = b1.a21.x1 + a22.x2 = b2",
				JOptionPane.INFORMATION_MESSAGE);
		
		double a11 = Double.parseDouble(stra11);

		stra12 = JOptionPane.showInputDialog(null,
				"Please input a12: ",
				"Solve equation: a11.x1 + a12.x2 = b1.a21.x1 + a22.x2 = b2",
				JOptionPane.INFORMATION_MESSAGE);
		
		double a12 = Double.parseDouble(stra12);

		stra21 = JOptionPane.showInputDialog(null,
				"Please input a21: ",
				"Solve equation: a11.x1 + a12.x2 = b1.a21.x1 + a22.x2 = b2",
				JOptionPane.INFORMATION_MESSAGE);
		
		double a21 = Double.parseDouble(stra21);

		stra22 = JOptionPane.showInputDialog(null,
				"Please input a22: ",
				"Solve equation: a11.x1 + a12.x2 = b1.a21.x1 + a22.x2 = b2",
				JOptionPane.INFORMATION_MESSAGE);
		
		double a22 = Double.parseDouble(stra22);


		strb1 = JOptionPane.showInputDialog(null,
				"Please input b1: ",
				"Solve equation: a11.x1 + a12.x2 = b1.a21.x1 + a22.x2 = b2",
				JOptionPane.INFORMATION_MESSAGE);
		
		double b1 = Double.parseDouble(strb1);


		strb2 = JOptionPane.showInputDialog(null,
				"Please input b2: ",
				"Solve equation: a11.x1 + a12.x2 = b1.a21.x1 + a22.x2 = b2",
				JOptionPane.INFORMATION_MESSAGE);
		
		double b2 = Double.parseDouble(strb2);

		if(a11*a22 == a12*(b1*a21)) 
		{
			if(a12 == a22) JOptionPane.showMessageDialog(null,"The equation has infinitely many solution","Result", JOptionPane.INFORMATION_MESSAGE);
			else JOptionPane.showMessageDialog(null,"The equation has no solution","Result", JOptionPane.INFORMATION_MESSAGE);
		}
		else JOptionPane.showMessageDialog(null,"The roots of equation is:\n x1 = " + (b2*(a12-a22))/(b1*a12*a21-a11*a22) + "\n x2 = " + (b2*(a11-b1*a21))/(a11*a22-a12*a21*b1),"Result", JOptionPane.INFORMATION_MESSAGE);



//Solve the second-degree equation with one variable: cx^2 + dx + e = 0
		String strc, strd, stre;
		
		strc = JOptionPane.showInputDialog(null,
				"Please input c: ",
				"Solve equation: cx^2 + dx + e = 0",
				JOptionPane.INFORMATION_MESSAGE);
		
		double c = Double.parseDouble(strc);

		strd = JOptionPane.showInputDialog(null,
				"Please input d: ",
				"Solve equation: cx^2 + dx + e = 0",
				JOptionPane.INFORMATION_MESSAGE);
		
		double d = Double.parseDouble(strd);

		stre = JOptionPane.showInputDialog(null,
				"Please input e: ",
				"Solve equation: cx^2 + dx + e = 0",
				JOptionPane.INFORMATION_MESSAGE);
		
		double e = Double.parseDouble(stre);


		if(c == 0) JOptionPane.showMessageDialog(null,"The equation isn't the second-degree equation","Result", JOptionPane.INFORMATION_MESSAGE);
		else { double delta = d*d - 4*c*e;
		if(delta == 0) JOptionPane.showMessageDialog(null,"The equation has a double root: \n x = " + (-d/(2*c)),"Result", JOptionPane.INFORMATION_MESSAGE);

		else if(delta < 0) JOptionPane.showMessageDialog(null,"The equation has no root","Result", JOptionPane.INFORMATION_MESSAGE);

		else JOptionPane.showMessageDialog(null,"The equation has two roots: \n x1 = " + ((-d-Math.sqrt(delta))/(2*c)) + "\n x2 = " + ((-d+Math.sqrt(delta))/(2*c)),"Result", JOptionPane.INFORMATION_MESSAGE);

		}

		System.exit(0);
	}
}
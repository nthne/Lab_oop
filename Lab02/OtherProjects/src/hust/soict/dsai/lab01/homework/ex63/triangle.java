package hust.soict.dsai.lab01.homework.ex63;

import java.util.Scanner;
public class triangle {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		
		int n = keyboard.nextInt();
		
		for(int i = 1; i <= n; i++)
		{
			for(int j = 0; j < n-i; j++)
				System.out.print(' ');
			for(int j = 0; j < (i-1)*2+1; j++)
				System.out.print('*');
			System.out.println();
		}
	}

}

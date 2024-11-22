package hust.soict.dsai.lab01.homework.ex65;

import java.util.Scanner;
import java.util.Arrays;
public class sort {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Input the length of array n = ");
		int n = keyboard.nextInt();
		
		System.out.println("Input your Array with length n:");
		int[] Arr = new int[n];
		for(int i=0;i<n;i++)
			Arr[i] = keyboard.nextInt();
		
		Arrays.sort(Arr);
		
		int sum = 0;
		for(int i=0;i<n;i++)
			sum+=Arr[i];
		int avg = sum/n;
		
		System.out.println("Sorted array: " + Arrays.toString(Arr));
		System.out.println("Sum of array: " + sum);
		System.out.println("Average of array: " + avg);
		
	}

}

package hust.soict.dsai.lab01.homework.ex66;

import java.util.Scanner;
import java.util.Arrays;
public class add_two_matrices {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Input the number of the matrix's row: ");
		int row = keyboard.nextInt();
		
		System.out.print("Input the number of the matrix's collum: ");
		int col = keyboard.nextInt();
		
		System.out.println("Input the first matrix:");
		int[][] matrix1 = new int[row][col];
		for(int i = 0 ; i < row ; i++)
			for(int j = 0 ; j < col ; j++)
				matrix1[i][j] = keyboard.nextInt();
		
		System.out.println("Input the second matrix:");
		int[][] matrix2 = new int[row][col];
		for(int i = 0 ; i < row ; i++)
			for(int j = 0 ; j < col ; j++)
				matrix2[i][j] = keyboard.nextInt();
		
		int[][] matrix_sum = new int[row][col];
		
		for(int i = 0 ; i < row ; i++)
			for(int j = 0 ; j < col ; j++)
				matrix_sum[i][j] = matrix1[i][j] + matrix2[i][j];
		
		System.out.println("The sum of two matrices of the same size is:");
		for(int i = 0 ; i < row ; i++)
		{
			for(int j = 0 ; j < col ; j++)
			{
				System.out.print(matrix_sum[i][j] + "\t");
			}
			
			System.out.println();
		}
					
	}

}

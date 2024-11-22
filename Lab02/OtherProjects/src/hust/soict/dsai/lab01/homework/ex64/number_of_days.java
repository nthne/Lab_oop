package hust.soict.dsai.lab01.homework.ex64;

import java.util.Scanner;
public class number_of_days {
	public static void main(String agrs[]) {
		Scanner keyboard = new Scanner(System.in);
		
		String[] months1 = new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		String[] months2 = new String[] {"Jan.", "Feb.", "Mar.", "Apr.", "May", "June", "July", "Aug.", "Sept.", "Oct.", "Nov.", "Dec."};
		String[] months3 = new String[] {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		
		int month_num = 0;
		while(month_num <= 0 || month_num > 12)
		{
			System.out.print("Input the month: ");
			String month = keyboard.nextLine();
			
			try {
				month_num = Integer.parseInt(month);
			} catch (NumberFormatException e){
				for(int i = 0; i < 12 ; i++)
				{
					if(month.equalsIgnoreCase(months1[i]) || month.equalsIgnoreCase(months2[i]) || month.equalsIgnoreCase(months3[i])) month_num = i+1;
				}
				
			}
			
			if(month_num <= 0 || month_num > 12) System.out.println("It is an invalid month, try again.");
		}
		
		int year = -1;
		while(year < 0)
		{
			System.out.print("Input the year: ");
			year = keyboard.nextInt();
			if(year < 0) System.out.println("It is an invalid year, try again.");
		}
		
		
		System.out.print("The number of days of " + months1[month_num - 1] + " is: ");
		if(month_num == 2) 
		{
			if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) System.out.print("29");
			else System.out.print("28");
		}
		else if((month_num <= 7 && month_num % 2 == 1) || (month_num >= 8 && month_num % 2 == 0)) System.out.print("31");
		else System.out.print("30");
	}

}

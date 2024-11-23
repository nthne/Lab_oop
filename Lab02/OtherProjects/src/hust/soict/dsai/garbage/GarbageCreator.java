package hust.soict.dsai.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class GarbageCreator {
    public static void main(String[] args) {
    	
    	Scanner keyboard = new Scanner(System.in);
    	
    	int n = keyboard.nextInt();
    	int a[] = new int[n];
    	for(int i = 0; i < n; i++)
        {
        	int x = keyboard.nextInt();
        	a[i] = x;
        }
        for(int i = 0; i < n; i++)
        {
        	// Generate garbage objects
        	int Arr[] = new int[a[i]]; //when n is large, there is create a lot of "garbage" Arr
        	int j = 0;
        	for(int k = 1; k < a[i]; k++) {
        		if(a[i] % k == 0) {
        			Arr[j] = k;
        			j ++;
        		}
        	}
        	if(j == 1) System.out.println(a[i] + " is a prime number.");
        	else {
        		System.out.print(a[i] + " is not a prime number and has " + j + " divisors: ");
        		for(int k = 0; k < j; k++) System.out.print(Arr[k] + ", ");
        		System.out.println(a[i]);
        	}
        	
        }
        
//        String filename = "F:/năm hi/lab oop/Lab02/OtherProjects/src/hust/soict/dsai/garbage/test/test.exe";
//        byte[] inputBytes = {0};
//        long startTime, endTime;
//        
//        try {
//			inputBytes = Files.readAllBytes(Paths.get(filename));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        startTime = System.currentTimeMillis();
//        System.out.println(startTime);
//        String outputString = "";
//        for (byte b : inputBytes) {
//        	outputString += (char)b;
//        }
//        endTime = System.currentTimeMillis();
//        System.out.println(endTime - startTime);
// When i choose a very long file, it print the startTime but don't print the final result, 
// so maybe it's not finished or need more time.
    }
}

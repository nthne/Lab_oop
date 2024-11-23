package hust.soict.dsai.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class NoGarbage {
    public static void main(String[] args) {
    	
    	Scanner keyboard = new Scanner(System.in);
    	long start = System.currentTimeMillis();
    	
    	int n = keyboard.nextInt();
    	int a[] = new int[n];
    	int max = 0;
    	for(int i = 0; i < n; i++)
        {
        	int x = keyboard.nextInt();
        	a[i] = x;
        	if(max < x) max = x;
        }
    	int Arr[] = new int[max]; //There is only one array has been created and reuse after each loop.

        for(int i = 0; i < n; i++)
        {
        	int j = 0;
        	for(int k = 2; k <= a[i]/2; k++) {
        		if(a[i] % k == 0) {
        			Arr[j] = k;
        			j++;
        		}
        	}
        	if(j == 0) System.out.println(a[i] + " is a prime number.");
        	else {
        		System.out.print(a[i] + " is not a prime number and has " + j + " divisors: 1, ");
        		for(int k = 0; k < j; k++) System.out.print(Arr[k] + ", ");
        		System.out.println(a[i]);
        	}
        	
        }
//        
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
//        StringBuffer outputStringBuffer = new StringBuffer();
//        for (byte b : inputBytes) {
//        	outputStringBuffer.append((char)b);
//        }
//        endTime = System.currentTimeMillis();
//        System.out.println(endTime - startTime);
//This code gives me the result very fast.
    }
}

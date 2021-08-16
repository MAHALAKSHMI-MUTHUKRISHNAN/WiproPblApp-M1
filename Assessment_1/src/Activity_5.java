package demo;

import java.util.Scanner;

public class Activity_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n=10, count = 1;   
	      float  x, average, sum= 0;   
	      Scanner sc = new Scanner(System.in);  
	      System.out.println("Enter 10 values");
	      while (count <= n)   
	             { 
	                  x = sc.nextInt();  
	                  sum+= x;   
	                  ++count;   
	             }   
	                  average = sum/n;   
	        System.out.println("The Average is"+average);  
	}

}

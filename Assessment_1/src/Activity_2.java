package demo;
import java.util.Scanner;

public class Activity_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int [25] ; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements");
        int n = sc.nextInt();
        
        for (int i=0;i<n;i++) {
        	System.out.println("Element "+(i+1)+":");
        	arr[i] = sc.nextInt();
        }
        
        int max = arr[0],count =0;
        for (int i = 1; i < n; i++) {
        	if (arr[i] > max)
                max= arr[i];   
        }
        
        for (int i=0; i < n ; i++) {
        if (arr[i] == max)
            count++;
        }
        System.out.println("Maximum Element :"+max+"\nCount :"+count);
        
   
	}

}

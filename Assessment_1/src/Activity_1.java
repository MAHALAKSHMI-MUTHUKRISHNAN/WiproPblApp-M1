import java.util.Scanner;

class Activity_1 {
	
	    public static void main(String[] args) {  
	  
	        
	        int [] arr = new int [25] ; 
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the elements");
	        for (int i=0;i<25;i++) {
	        	System.out.println("Element "+(i+1)+":");
	        	arr[i] = sc.nextInt();
	        }
	        
	        int max = arr[0];  
	          
	        for (int i = 0; i < arr.length; i++) {  
	           
	           if(arr[i] > max)  
	               max = arr[i];  
	        }  
	        System.out.println("Largest element present in given array: " + max);  
	    
	    }
}

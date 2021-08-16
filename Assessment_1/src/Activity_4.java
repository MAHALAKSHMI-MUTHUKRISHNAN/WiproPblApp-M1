import java.util.*;
public class Activity_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner sc= new Scanner(System.in); 
		  int i,fact=1;  
		  System.out.println("Enter the number:");
		  int number= sc.nextInt();  
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is "+fact);    

	}

}

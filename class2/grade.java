package class2;

import java.util.Scanner;

public class grade {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
	      System.out.println("enter marks of 3 subjects:-");
	      
	      int a = sc.nextInt();
	      int b = sc.nextInt();
	      int c = sc.nextInt();
	      
		  int avg=(a+b+c)/3;
		 System.out.println("your grade is:- ");
		  if(avg>=90 && avg<100)
		  {
			  System.out.println("A");
		  }
		  if(avg>=80 && avg<89)
		  {
			  System.out.println("B");
		  }
		  if(avg>=70 && avg<79)
		  {
			  System.out.println("C");
		  }
		  
		  if(avg>=60 && avg<69)
		  {
			  System.out.println("D");
		  }
		  if(avg>=0 && avg<59)
		  {
			  System.out.println("F");
		  }
	}
}

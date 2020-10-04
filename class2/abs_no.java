package class2;
import java.lang.*;
import java.util.Scanner;

public class abs_no {

	public static void main(String[] args) {
		
		      // get some integers to find their absolute values
		      Scanner sc= new Scanner(System.in);
		      System.out.println("enter number:-");
		      
		      int a=sc.nextInt();
		   
		      System.out.println("absolute value of (" + a + ")=" + Math.abs(a));

	}

}

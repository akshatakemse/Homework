import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		
	        int num;
	        
	        System.out.println("Enter the number: ");
	        Scanner scanner = new Scanner(System.in);
	        
	        num = scanner.nextInt();
	        long fact = 1;
	        int i = 1;
	        
	        while(i<=num)
	        {
	            fact = fact * i;
	            i++;
	        }
	        
	        System.out.println("Factorial of "+num+" is: "+fact);
	    }

	}

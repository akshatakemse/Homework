package class4;

import java.util.Scanner;

public class question8 {

	public static void main(String[] args) {
		
		int fact,sign=-1;

		float p,sum=0;
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the value of x : ");

		float x=sc.nextFloat();

		System.out.println("Enter the value of n : ");

		int n=sc.nextInt();


		for(int i=1;i<=n;i+=2)
		{ 
			p=1;
	                
			 fact=1;
			 
			for(int j=1;j<=i;j++)
			{
				p=p*x;
				fact=fact*j;
			}
			sign=-1*sign;
			sum+=sign*p/fact;
		}

		System.out.println("sin "+ x +"=" +sum);


	}

}

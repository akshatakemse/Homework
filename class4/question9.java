package class4;
import java.util.Scanner;

public class question9 {

	public static void main(String[] args) {
		
		int fact,sign=-1;

		float p,sum=0;
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the value of x : ");

		float x=sc.nextFloat();

		System.out.println("Enter the value of n : ");

		int n=sc.nextInt();



		for(int i=2;i<=n;i+=2)

		{
	         p=1;
			fact=1;

			for(int j=1;j<=i;j++)

			{

				p=p*x;

				fact=fact*j;

			}

			sum+=sign*p/fact;

			sign=-1*sign;

		}

		System.out.println("cos "+ x +"=" +(1+sum));

	}

}

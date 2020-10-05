package class4;

import java.util.Scanner;

public class question6 {

	public static void main(String[] args) {
		int sign=-1;
		float sum=0;
		System.out.println("Enter the value of n ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		for(int i=1;i<=n;i++)
		{
			sign *= -1;
			sum += sign*1.0/i;
		}
		System.out.println("log 2 : "+sum);


	}

}

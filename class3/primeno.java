import java.util.Scanner;
public class primeno {

	public static void main(String[] args) {
		
		int temp;
		boolean isPrime=true;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number:");
		
		int num=sc.nextInt();
	   
		for(int i=2;i<=num/2;i++)
		{
	           temp=num%i;
		   if(temp==0)
		   {
		      isPrime=false;
		      break;
		   }
		}

		if(isPrime)
		   System.out.println("YES");
		else
		   System.out.println("NO");

	}

}

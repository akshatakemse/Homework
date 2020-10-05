package class4;

public class question7 {

	public static void main(String[] args) {
		//pattern1
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
	
	
	//pattern2
 	
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}

	
	System.out.println();
	
	//pattern3
	for(int i=1;i<=5;i++)
	{
		for(int j=5;j>i;j--)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
		System.out.print("*");
	    }
		System.out.println();
	}
	
	System.out.println();
	
	
	//pattern4
	for(int i=1;i<=5;i++)
	{
		for(int j=9-i;j>=i;j--)
		{
			System.out.print(" ");
		}
		  for(int k=1;k<=((2*i)-1);k++)
		 {
			System.out.print("*");
		 }
		System.out.println();
	}
	
	
	System.out.println();
	
	
	
	//pattern5
	
	for(int i=1;i<=5;i++)
	{
		for(int j=9-i;j>=i;j--)
		{
			System.out.print(" ");
		}
		  for(int k=1;k<=((2*i)-1);k++)
		 {
			System.out.print(i);
		 }
		System.out.println();
	}
	
	
	System.out.println();

	
	
	//pattern6
	
	for(int i=1;i<=5;i++)
	{
		for(int j=9-i;j>=i;j--)
		{
			System.out.print(" ");
		}
		for(int k=i;k>=1;k--)
		{
			System.out.print(k);
	    }
		for(int l=2;l<=i;l++)
		{
			System.out.print(l);
		}
		System.out.println();
	}
	}
}



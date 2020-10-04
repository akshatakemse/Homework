import java.util.Scanner;
public class even_odd_sum {

	public static void main(String[] args) {
		
		
		        int n, esum = 0, osum = 0;
		        Scanner s = new Scanner(System.in);
		        System.out.print("Enter the no. of elements in array:");
		        n = s.nextInt();
		        int[] a = new int[n];
		        System.out.println("Enter the elements of the array:");
		        for(int i = 0; i < n; i++)
		        {
		            a[i] = s.nextInt();
		        }
		        for(int i = 0; i < n; i++)
		        {
		            if(a[i] % 2 == 0)
		            {
		                esum = esum + a[i];
		            }
		            else
		            {
		                osum = osum + a[i];
		            }
		        }
		        System.out.println("Sum of Even Numbers:"+esum);
		        System.out.println("Sum of Odd Numbers:"+osum);
		    }

	}

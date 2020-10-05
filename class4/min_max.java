package class4;
import java.util.Scanner;
public class min_max {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		    System.out.println("enter limit of numbers: ");
	        int n=sc.nextInt();
	        System.out.println("enter numbers: ");

	        int arr[]=new int[n];
	        int max=0;
	        int min=0;

	        for(int i=0;i<n;i++){
	            arr[i]=sc.nextInt();
	        }
	        max=arr[0];
	        min=arr[0];
	        for(int i=1;i<n;i++){
	            if(arr[i]>max){
	                max=arr[i];
	            }
	            if(arr[i]<min){
	                min=arr[i];
	            }
	        }
	        System.out.println("Largest number "+max);
	        System.out.println("Smallest number "+min);

	}

}

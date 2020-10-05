package class4;
import java.util.Scanner;
public class question1 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        System.out.println("enter limit of numbers: ");
	        int n=sc.nextInt();
	        System.out.println("enter numbers: ");
	        
	        int positive =0;
	        int negative =0;
	        int zero=0;
	        
	       
	        
	        for(int i=0;i<n;i++){
	            int num=sc.nextInt();
	            if(num==0){
	                zero++;
	            }
	            else if(num<0){
	                negative ++;
	            }else{
	                positive ++;
	            }
	        }
	        
	        System.out.println("Positive number "+positive);
	        System.out.println("Negative Number "+negative);
	        System.out.println("Zero "+zero);

	}

}

package class4;
import java.util.Scanner;

public class question5 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.print("upto how many terms you want to sum =" );
	        int n=sc.nextInt();
	        double sum=0;
	        
	        for(double i=1;i<=n;i++){
	            sum=sum+(1/i);
	        }

	        System.out.println(sum);

	}

}

import java.util.Scanner;
public class naturalno_sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
        System.out.println("Enter the No.:");
        
        int n=sc.nextInt();
        long sum=0;
        
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        
        System.out.println(sum);

	}

}

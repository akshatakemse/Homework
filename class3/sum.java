import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int choice;
        int num1,num2;
        do{
            System.out.println("enter first no:");
            num1=sc.nextInt();
            System.out.println("enter second no:");
            num2=sc.nextInt();

            System.out.println("press 1 to continue and 0 to terminate");
            System.out.println("enter your choice:");
            choice=sc.nextInt();
            
            System.out.println("sum: "+(num1+num2));
        }
        while(choice==1);

	}

}

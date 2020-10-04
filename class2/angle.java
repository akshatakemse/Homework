package class2;

import java.util.Scanner;

public class angle {

	public static void main(String[] args) {
		
			        Scanner sc=new Scanner(System.in);
			        System.out.println("enter three angles: ");
			        
			        int ang1=sc.nextInt();
			        int ang2=sc.nextInt();
			        int ang3=sc.nextInt();
			        
			        int angle=ang1+ang2+ang3;
			        
			        if(angle==180){
			            System.out.println("triangle is Valid");
			        }
			        else{
			            System.out.println("triangle is not valid");
			        }
			    }

	}

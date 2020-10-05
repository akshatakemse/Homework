package class4;

public class question3 {

	public static void main(String[] args) {
		
			
		        for(int i=1;i<500;i++){
		            if(isArmstr(i)){
		                System.out.println(i);
		            }
		        }

		    }

		    public static boolean isArmstr(int num){
		        int sum=0;
		        int t=num;
		        while(num!=0){
		            int rem=num%10;
		            sum=sum+(rem*rem*rem);
		            num=num/10;
		            //System.out.println(sum);
		        }
		        if(t==sum){
		            return true;
		        }
		        return false;

	}

}

//15.	Accept person’s gender (character m for male and f for female), age (integer), 
//as input and then check whether person is eligible for marriage or not
import java.util.*;

class Question15{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String gender;
		do{
			System.out.print("Enter your gender(Enter m for male and f for female):");
			 gender = sc.next();	
			if(gender.equals("m") || gender.equals("f")){
					count=1;
			}
		}while(count==0);
	
		System.out.print("Enter your age:");
		int age = sc.nextInt();
		if(gender.equals("m") && age>=21){
			System.out.print("Eligible for marriage");
		}else if(gender.equals("f") && age>=18){
			System.out.print("Eligible for marriage");
		}else{
			System.out.print("Not eligible for marriage");
		}
		
	}
}
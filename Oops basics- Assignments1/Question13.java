import java.util.*;
class Question13
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num1 = sc.nextInt();
		System.out.print("Enter a number:");
		int num2 = sc.nextInt();
		System.out.print("Enter a number:");
		int num3 = sc.nextInt();
		
		System.out.println("Using if else statement:-");
		if(num1>num2 && num1>num3){
			System.out.println(num1+" is greatest");
		}else if(num2>num1 && num2>num3){
			System.out.println(num2+" is greatest");
		}else if(num3>num1 && num3>num2){
			System.out.println(num3+" is greatest");
		}else{
			System.out.println("All are equal");
		}
		
		System.out.println();
		int num, count;
		System.out.println("Using Ternary operator:");
		num = num3>(num1>num2 ? num1 :num2)? num3 :(num1>num2 ? num1 :num2);
		if(num1==num2 && num1==num3 && num2==num3){
			System.out.print("All are equal");
		}else{
			System.out.print(num+" is greatest");
		}
		
	}
}
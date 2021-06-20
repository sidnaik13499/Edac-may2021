import java.util.*;
class Question11
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number:");
		int num1 = sc.nextInt();
		System.out.print("Enter second number");
		int num2 = sc.nextInt();
		System.out.println("1st number:"+num1+" 2nd number:"+num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("Swapped numbers:-");
		System.out.println("1st number:"+num1+" 2nd number:"+num2);
	}
}
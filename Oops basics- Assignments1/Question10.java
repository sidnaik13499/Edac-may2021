//10.	Write a program to convert temperature from Fahrenheit to Celsius.
 //Take Fahrenheit as input using Scanner class. [ formula : C= 5*(f-32)/9 ]
import java.util.*; 
class Question10
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter temperature into Fahrenheit:");
		float f = sc.nextFloat();
		float C =(float) 5*(f - 32)/9; 
		System.out.println(C);
	}
}
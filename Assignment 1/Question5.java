import java.util.Scanner;
class Question5
{
	public static void main(String args[])
	{	
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Input first number:");
		int a = sc.nextInt();
		System.out.print("Input second number:");
		int b = sc.nextInt();
		int prod = a * b;
		System.out.println(a + " x " +b + " = " +prod);
	}
}
import java.util.Scanner;
class Question12	
{
	public static void main(String args[])
  {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your First number:");
	int a = sc.nextInt();
	System.out.println("Enter your Second number:");
	int b = sc.nextInt();
	System.out.println("Enter your Third  number:");
	int c = sc.nextInt();
	int avg = (a+b+c)/3;
	System.out.println("Average of entered three numbers is: "+avg);
  }
}
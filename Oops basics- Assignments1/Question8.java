import java.util.Scanner;
class Question8
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter principle amount:");
		int p = sc.nextInt();
		System.out.print("Enter time:");
		int n = sc.nextInt();
		System.out.print("Enter rate of interest:");
		int r = sc.nextInt();
		float SI = (float)(p*n*r)/100;
		System.out.println("Simple Interest is "+SI);
	}
}
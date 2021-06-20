import java.util.Scanner;
class Question6
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of the circle:");
		float radius = sc.nextInt();
		float pi = 3.14F;
		float area =  pi * (radius * radius);
		float circum = 2 * pi  * radius;
		System.out.println("Area: "+area);
		System.out.println("Area: "+circum);
		
	}
}
import java.util.Scanner;
class Question7
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a number:");
		int no = sc.nextInt();
		for(int i=1;i<=10;i++){
			System.out.println(no + " x " +i + " = " + i*no);
		}
				
	}
}
import java.util.Scanner;
class Question7
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int marks = 0;
		for(int i=1;i<=5;i++){
			System.out.println("Enter the marks of subject "+i);
			marks = sc.nextInt();
			sum = sum + marks;	
			System.out.println(sum);
		}
		float perc = (float)(100*sum)/500;
		System.out.println(perc+"%");
	}
}
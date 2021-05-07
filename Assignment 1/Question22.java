import java.util.*;
import java.lang.*;

class Question22
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Binary number:");
		int n = sc.nextInt();
		sc.close();
		int i = 0;
		int temp = 0;
		while(n!=0){
		 int k = n % 10;
		 double power = Math.pow(2,i);
		 temp = temp + (k * (int)power);
		 n /=10;
		 i++;
		}
		System.out.println(temp);
	}
}
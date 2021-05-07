import java.util.*;
import java.lang.*;

class Question23
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
		int rem;
		String str = " ";
		char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
			
		while(temp>0){
			rem = temp %16;
			str=hex[rem]+str;
			temp/=16;
		}
		System.out.println("Binary to Hexadecimal number: "+str);
	}
}
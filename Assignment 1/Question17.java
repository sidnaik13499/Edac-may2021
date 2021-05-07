import java.util.*;
import java.lang.*;

class Question17
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first Binary number:");
		String binary1 = sc.next();

		System.out.println("Enter second Binary number:");
		String binary2 = sc.next();
		
		Integer num1 = Integer.parseInt(binary1,2);
		Integer num2 = Integer.parseInt(binary2,2);
		
		Integer result = num1 + num2;
		
		
		System.out.println(Integer.toBinaryString(result));
	}
}
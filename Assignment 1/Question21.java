import java.util.*;

class Question21
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a decimal number:");
		int inp = sc.nextInt();
		int rem;
		int i=1;
		int octal = 0;
		while(inp!=0){
			
			rem = inp%8;
			inp = inp/8;
			octal = octal + rem * i; 
			i*=10;	
		}
		System.out.println(octal);
		
	}
}
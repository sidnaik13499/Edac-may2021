import java.util.*;
class Question15
{
public static void main(String [] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two number to be swapped:");
	int x = sc.nextInt();
	int y = sc.nextInt();
	System.out.println("x:"+x);	
	System.out.println("y:"+y);	
	x = x + y;
	y = x - y;
	x = x - y;
	System.out.println("Swapped x:"+x);	
	System.out.println("Swapped y:"+y);	
}
}


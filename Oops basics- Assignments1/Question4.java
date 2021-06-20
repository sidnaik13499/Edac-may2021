import java.util.*;
class Question4
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first byte input:");
		byte var1 = sc.nextByte();
		System.out.print("Enter the first byte input:");
		byte var2 = sc.nextByte();
		byte ans = (byte) (var1 + var2);
		System.out.println(ans);
	}
}
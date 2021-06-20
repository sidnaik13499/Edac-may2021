import java.util.*;
class Question9
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of days:");
		int days = sc.nextInt();
		int years = days/365;
		days= days%365;
		int months = days/30;
		days= days%30;
		System.out.println(years+" year(s) "+months+" month(s) "+days+" day(s) ");
	}
}


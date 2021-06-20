/* Make a class named Fruit with a data member to calculate the
	number of fruits in a basket. Create two other class named
	Apples and Mangoes to calculate the number of apples and
	mangoes in the basket. Print the number of fruits of each type
	and the total number of fruits in the basket.
*/

import java.util.*;

abstract class Fruit{	
	 abstract int Calculate(int number);	
}

class Apples extends Fruit{
	int apples;
	Apples(int apples){
		this.apples = apples;
	}
	public int Calculate(int apples) {
		return apples;
	}
	
}

class Mangoes extends Fruit {
	int mangoes;
	Mangoes(int mangoes){
		this.mangoes = mangoes;
	}
	
	public int Calculate(int mangoes) {
		return  mangoes;
	}
	
}

public class Question2{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of apples:");
		int a = sc.nextInt();
		System.out.print("Enter number of mangoes:");
		int b = sc.nextInt();
		sc.close();
 
		Apples apple = new Apples(a);
		Mangoes mango = new Mangoes(b);
	
		System.out.println("Number of apples:"+apple.Calculate(a));
		System.out.println("Number of mangoes:"+mango.Calculate(b));
		System.out.println("Total:"+(apple.Calculate(a) + mango.Calculate(b)));
	}

}

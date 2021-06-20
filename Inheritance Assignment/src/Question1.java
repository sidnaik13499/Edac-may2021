/*Q1.Create two classes named Mammals and MarineAnimals.
	Create another class named BlueWhale which inherits both the
	above classes. Now, create a function in each of these classes
	which prints "I am mammal", "I am a marine animal" and "I
	belong to both the categories: Mammals as well as Marine
	Animals" respectively. Now, create an object for each of the
	above class and try calling
		1 - function of Mammals by the object of Mammal
		2 - function of MarineAnimal by the object of MarineAnimal
		3 - function of BlueWhale by the object of BlueWhale
		4 - function of each of its parent by the object of BlueWhale */

class Animals{
	Animals(){
		this.display1();
		this.display2();
		this.display3();
	}
	public  void display1() {};
	public  void display2() {};
	public  void display3() {};
	 
}

class Mammal extends Animals{
	
	public void display1() {
		System.out.println("I am mammal ");
	} 	
	
}


class MarineAnimals extends Animals{
	
	public void display2() {
		System.out.println("I am marine animals ");
	}

	
}
 

class Bluewhale extends Animals{
	
	public void display3(){
		System.out.println("I belong to both the categories");	
	}
	
	public void parentFunc() {
		Mammal func1 = new Mammal();
		MarineAnimals func2 = new MarineAnimals();
	}
	
}

public class Question1 {

	public static void main(String[] args) {
		System.out.println("Function of Mammals by the object of Mammal:-");
		Mammal type1 = new Mammal();
		System.out.println();
		
		System.out.println("Function of MarineAnimal by the object of MarineAnimal:-");
		MarineAnimals type2 = new MarineAnimals();	
		System.out.println();
		
		System.out.println("Function of BlueWhale by the object of BlueWhale");
		Bluewhale type3 = new Bluewhale();
		System.out.println();
		
		System.out.println("Function of each of its parent by the object of BlueWhale");
		Bluewhale parent= new Bluewhale();
		parent.parentFunc();
			
	}

}













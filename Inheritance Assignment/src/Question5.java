/*
 	Create a class named Shape with a function that prints "This is a
	shape". Create another class named Polygon inheriting the Shape
	class with the same function that prints "Polygon is a shape".
	Create two other classes named Rectangle and Triangle having
	the same function which prints "Rectangle is a polygon" and
	"Triangle is a polygon" respectively. Again, make another class
	named Square having the same function which prints "Square is a
	rectangle".
	Now, try calling the function by the object of each of these
	classes.
 */

class Shape{
	
	void display() {
		System.out.println("This is a shape");
	}
}

class Polygon extends Shape{
	
	void display() {
		System.out.println("Polygon block:");
		System.out.println("Polygon is a shape");
	}
	
}

class Rectangle extends Polygon{

	void display() {
		System.out.println("Rectangle is a polygon");
	}
}

class Traingle extends Polygon{
	
	void display() {
		System.out.println("Triangle is a polygon");
	}
}

class Square extends Rectangle{
	
	void display() {
		System.out.println("Square is a rectangle");
	}
}

public class Question5 {

	public static void main(String[] args) {
		new Shape().display();
		new Polygon().display();
		new Rectangle().display();
		new Traingle().display();
		new Square().display();
	}

}

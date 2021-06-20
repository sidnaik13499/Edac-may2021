/*
	We want to store the information of different vehicles. Create a
	class named Vehicle with two data member named mileage and
	price. Create its two subclasses
	* 	Car with data members to store ownership cost, warranty (by
		years), seating capacity and fuel type (diesel or petrol).
	* 	Bike with data members to store the number of cylinders,
		number of gears, cooling type(air, liquid or oil), wheel
		type(alloys or spokes) and fuel tank size(in inches)
		Make another two subclasses Audi and Ford of Car, each having
		a data member to store the model type.
	*	Next, make two subclasses Bajaj and TVS, each having a data member to store
		the make-type.Now, store and print the information of an Audi and a Ford car
		(i.e. model type, ownership cost, warranty, seating capacity, fuel
		type, mileage and price.) Do the same for a Bajaj and a TVS
		bike.
 */

abstract class Vehicle{
	float mileage;
	int price;
	Vehicle(float mileage, int price ){
		this.mileage = mileage;
		this. price =  price;
	}
    public abstract void display();	
}

class Car extends Vehicle{	
	int ownershipCost;
	int warranty;
	int seatingCapacity;
	String fuelType;
	
	Car(float mileage,int price, int owenrshipCost, int warranty, int seatingCapacity, String fuelType){
		super(mileage, price);	
		this.ownershipCost = owenrshipCost;
		this.warranty = warranty;
		this.seatingCapacity = seatingCapacity;
		this.fuelType = fuelType;
	}
	
	public void display() {
		
		System.out.println("Mileage:"+mileage+" Km/L");
		System.out.println("Price: Rs."+price);
		System.out.println("Ownership Cost:"+ownershipCost);
		System.out.println("Warranty:"+warranty+" years");
		System.out.println("Seating Capacity:"+seatingCapacity+" persons");
		System.out.println("Fuel type:"+fuelType);
	}
		
}

class Bike extends Vehicle{
	int noOfCyclinders;
	int noOfGears;
	String coolingType;
	String wheelType;
	int fueltankSize;
	
	Bike(float mileage, int price, int noOfCyclinders, int noOfGears, String coolingType, String wheelType, int fueltankSize) {
		super(mileage, price);
		this.noOfCyclinders = noOfCyclinders;
		this.noOfGears = noOfGears;
		this.coolingType = coolingType;
		this.wheelType = wheelType;
		this.fueltankSize = fueltankSize;
		
	}
	
	
	
	public void display() {
		System.out.println("Number of cyclinders:"+noOfCyclinders );
		System.out.println("Number of gears:"+noOfGears);
		System.out.println("Cooling type:"+coolingType);
		System.out.println("Wheel Type:"+wheelType);
		System.out.println("Fuel Tank size:"+fueltankSize);
	}
}


class Audi extends Car{
	
	String modelType;
	
	Audi(String modelType, float mileage,int price, int ownershipCost, int warranty, int seatingCapacity, String fuelType){		
		super(mileage, price, ownershipCost, warranty, seatingCapacity, fuelType );	
		this.modelType = modelType;
	}
	public void display(){
		System.out.println("Model Type:"+modelType);
		super.display();
	}	
	
}	

class Ford extends Car{
	String modelType;
	
	Ford(String modelType, float mileage,int price, int ownershipCost, int warranty, int seatingCapacity, String fuelType){		
		super(mileage, price, ownershipCost, warranty, seatingCapacity, fuelType );	
		this.modelType = modelType;
	}
	public void display(){
		System.out.println("Model Type:"+modelType);
		super.display();
	}	
	
	
}



class Bajaj extends Bike{
	

	Bajaj(String makeType, float mileage, int price, int noOfCyclinders, int noOfGears, String coolingType, String wheelType,
			int fueltankSize) {
		super(mileage, price, noOfCyclinders, noOfGears, coolingType, wheelType,    fueltankSize);
		this.makeType = makeType;
	}
	
	public void display(){
		super.display();
		System.out.println("Make type:"+makeType);
	}

	String makeType;
	
}

class Tvs extends Bike{
	String makeType;
	
	Tvs(String makeType, float mileage, int price, int noOfCyclinders, int noOfGears, String coolingType, String wheelType,
			int fueltankSize) {
		super(mileage, price, noOfCyclinders, noOfGears, coolingType, wheelType,    fueltankSize);
		this.makeType = makeType;
	}
	public void display() {
		super.display();
		System.out.println("Make type:"+makeType);
	}

}


public  class Question4 {

	public static void main(String [] args) {
		
		Car car [] = new Car [2];
		car[0] = new Audi("Premium",10, 10000000, 500000, 1, 4, "Diesal");
		car[1] = new Ford("Suv",15, 800000, 15000, 5, 7, "Petrol");
		car[0].display();
		System.out.println();
		car[1].display();
		System.out.println();
		
		Bike bike [] = new Bike [2];
		bike[0] = new Bajaj("Standard",50,50000,1,4,"Air cooled","tube", 5);
		bike[1]= new Tvs("Sports",25,30000,2,6,"Liquid cooled","tubeless", 4);
		bike[0].display();
		System.out.println();
		bike[1].display();
		System.out.println();	
	}

}

import java.util.Scanner;

class Distance{
	int feets;
	int inches;

	Scanner sc = new Scanner(System.in);
	
	void getDistance() {
		System.out.print("Enter feets:");
		feets = sc.nextInt();
		System.out.print("Enter inches:");
		inches = sc.nextInt();
	}
	
	void calcDistance(Distance d1, Distance d2) {
		inches = d1.inches + d2.inches;
		feets = d1.feets+d2.feets+(inches/12);
		inches = inches%12;
	}
	
	void displayDistance() {
		System.out.println("Sum of distance is:");
		System.out.println("Feet:"+feets+" Inches:"+inches);
	}
}
public class Q11 {

	public static void main(String[] args) {
		Distance dist1 = new Distance();
		System.out.println("Enter distance 1:");
		dist1.getDistance();
		Distance dist2 = new Distance();
		System.out.println("Enter distance 2:");
		dist2.getDistance();
		
		Distance d = new Distance();
		d.calcDistance(dist1, dist2);
		
		d.displayDistance();
		

	}

}

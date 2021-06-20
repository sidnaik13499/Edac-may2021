/* 	We want to calculate the total marks of each student of a class in
	Physics,Chemistry and Mathematics and the average marks of
	the class. The number of students in the class are entered by the
	user. Create a class named Marks with data members for roll
	number, name and marks. Create three other classes inheriting
	the Marks class, namely Physics, Chemistry and Mathematics,
	which are used to define marks in individual subject of each
	student. Roll number of each student will be generated
	automatically
*/

import java.util.*;
class Marks{
	static int rollno = 1;
	String name;
	int marks ;
	
	
	
	public int getMarks(int marks) {
		return marks;
	}
	
	
}

class Physics extends Marks{
	
	public int getMarks(int marks) {
		return marks;
	}
	

}

class Chemistry extends Marks{
	
	public int getMarks(int marks) {
		return marks;
	}
	
	
}

class Maths extends Marks{
	public int getMarks(int marks) {
		return marks;
	}
	
}

public class Question3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of students:");
		int n = sc.nextInt();
		
		
		Marks marks = new Marks();
		Physics physics = new Physics();
		Maths maths = new Maths();
		Chemistry chem = new Chemistry();
		
		String students [][] = new String [n][6];
		
		for(int i=0;i<n;i++) {
				
				students[i][0] = Integer.toString(marks.rollno);
				
				sc.nextLine();
				System.out.print("Enter name:");
				marks.name = sc.nextLine();
				
				students[i][1] = marks.name;
				
				System.out.print("Enter Physics marks:");
				int phyMarks = sc.nextInt();
				students[i][2] = Integer.toString(physics.getMarks(phyMarks));
				
				System.out.print("Enter Maths marks:");
				int mathMarks = sc.nextInt();
				students[i][3] = Integer.toString(maths.getMarks(mathMarks));
				
				System.out.print("Enter Chem marks:");
				int chemMarks = sc.nextInt();
				students[i][4] = Integer.toString(chem.getMarks(chemMarks));

				int total = phyMarks + mathMarks + chemMarks;
				students[i][5] = Integer.toString(marks.getMarks(total));
				
				System.out.println();
	
				marks.rollno++;
		}
		
		
		
		for(int i=0;i<n;i++) {
	
				System.out.println("Roll no:"+students[i][0]);
				System.out.println("Name:"+students[i][1]);
				System.out.println("Physics Marks:"+students[i][2]);
				System.out.println("Maths Marks:"+students[i][3]);
				System.out.println("Chemistry Marks:"+students[i][4]);
				System.out.println("Total Marks:"+students[i][5]);
				System.out.println();
		}
		
	}

}

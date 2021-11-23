//==================================
// Foundations of Computer Science
// students: Deepak Kumar Sharma
// id: a1778228	
// Semester: 2
// Year:33
// Practical Number: 05 Part I
//===================================
import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args) throws FileNotFoundException {
		Student st = new Student();	
		Student[] students = readData("students.txt"); // reading array of students			
		System.out.println("Student " + "AverageScore " + "Physic " + "Chemistry " + "Maths ");
		Student[] students1 = st.sortStudents(students); // sorting array of students
		printStudents(students1); // prinitng sorted array of students
		

	}
	// method to read txt file and store in an array of students
	private static Student[] readData (String fileName) throws FileNotFoundException {
		Student[] st = new Student[20];	
		for(int j = 0; j < 20; j++){
			st[j] = new Student(); // initialising all index of object of students class 
		}	
		Scanner sc = new Scanner (new File(fileName)); // reading file with filename 
		int i = 0;	
		while(sc.hasNextLine()){	// loop until scanner read the last line of input file 

			// passing successive strings separated by whitespace as arguments inside students constructor 
			st[i] = new Student(sc.next(), st[i].getAverage(), Integer.parseInt(sc.next()), 
						Integer.parseInt(sc.next()), Integer.parseInt(sc.next()));
			
			i++;
		}
		return st;	// returning array of students after storing all data from the file 	
	}
	// method to print data of array of students 
	private static void printStudents(Student[] students){
		
		for(int i = 0; i < students.length; i++){
			System.out.printf("%-7s %-11.1f %-8d %-9d %-4d", students[i].getName(), students[i].getAverage(), students[i].getPhysic(),
								students[i].getChemistry(), students[i].getMath());
			System.out.println();
		}

	}
	
}
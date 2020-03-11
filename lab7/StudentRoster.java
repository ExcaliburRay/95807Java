package lab7;

import java.util.ArrayList;
import java.util.List;

/**StudentRoster class reads data from roster.csv file and loads Student objects into its studentList.
 * It has two inner classes FirstNameComparator and ScoreComparator to sort students on their firstName and score respectively.
 */
public class StudentRoster {
	List<Student> studentList = new ArrayList<>();
	
	//Do not change this method
	public static void main(String[] args) {
		StudentRoster sr = new StudentRoster();
		sr.readData();
		sr.sortByLastName();
		System.out.println("********************** Sorted by Last name **********************");
		sr.printRoster();
		sr.sortByFirstName();
		System.out.println("********************** Sorted by First name **********************");
		sr.printRoster();
		sr.sortByScore();
		System.out.println("********************** Sorted by Score **********************");
		sr.printRoster();
	}
	
	//Do not change this method
	void printRoster() {
		System.out.println(" #. Last name\t\tFirst name\tAndrew ID\tScore");
		System.out.println("----------------------------------------------------------------------");
		int count = 1;
		for (Student s: studentList) System.out.printf("%2d. %-15s\t%-15s\t%-10s\t%.2f%n", count++,
				s.lastName, s.firstName, s.andrewID, s.score);
	}
	
	/**readData() method opens and reads roster.csv file and 
	 * loads the studentList arrayList with Student objects. 
	 */
	void readData() {
		//write your code here
	}
	
	
	void sortByLastName() {
		//write your code here
	}
	
	void sortByFirstName() {
		//write your code here
	}
	
	void sortByScore() {
		//write your code here
	}
	
	//write your Comparators here
}

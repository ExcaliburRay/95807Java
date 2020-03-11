//Andrew-id: ruixinh Name: Ruixin Huang
package lab3;

import java.util.Scanner;

public class DocAnalyst {

	public static void main(String args[]) {
		System.out.println("Enter file name");
		Scanner sc = new Scanner(System.in);
		String fileName = sc.nextLine();
		//obtain the suffix of file name 
		String[] type = fileName.split("\\.");
		if(type[1].equals("csv")) {
			//derive the CSVDoc to obtain the num of row and column
			CSVDoc csv = new CSVDoc(fileName);
			csv.readFile();
			csv.collectDocInfo();
		}else {
			//derive the RegularDoc to obtain the num of words
			RegularDoc doc = new RegularDoc(fileName);
			doc.readFile();
			doc.collectDocInfo();
		}
	}
}

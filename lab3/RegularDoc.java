//Andrew-id: ruixinh Name: Ruixin Huang
package lab3;

public class RegularDoc extends Document{

	int wordCount;

	RegularDoc(String filename) {
		super(filename);
		// TODO Auto-generated constructor stub
	}

	@Override
	void collectDocInfo() {
		// TODO Auto-generated method stub
		//insert the separate words into one Array
		String[] num = fileContent.toString().split(" ");
		//the num of words is the length of this array
		wordCount = num.length;
		System.out.println("This file has "+wordCount+" words");
	}

}

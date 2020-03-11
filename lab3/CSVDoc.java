//Andrew-id: ruixinh Name: Ruixin Huang
package lab3;

public class CSVDoc extends Document{
	
	int rowCount;
	int columnCount;
	CSVDoc(String filename) {
		super(filename);
		// TODO Auto-generated constructor stub
	}

	@Override
	void collectDocInfo() {
		// TODO Auto-generated method stub
		//insert each sentences to one Array
		String[] row = fileContent.toString().split("\n");
		//pick one item of this array and count its num of words to get the length of column
		String[] column = row[0].split(",");
		rowCount = row.length;
		columnCount = column.length;
		System.out.println(filename+" has "+rowCount+" rows and "+columnCount+" columns");
	}

}

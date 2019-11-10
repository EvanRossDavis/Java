//main driver class

public class StudentTeacherDatabase {

	public static void main(String[] args) throws FileNotFoundException {

		//scanner object to read from input file
		Scanner fileInput = new Scanner(System.in);
		
		//read the line, n are the number of records in the input file
		int n = Integer.parseInt(fileInput.nextLine());
		
		//hold the records in an array
		CSVPrintable record[] = new CSVPrintable[n];
		
		//printwriter object to print data to output file
		PrintWriter out = new PrintWriter(new File("out.csv"));
	
	//Iterate through n records from the input file.
	for (int i = 0; i < n; ++i) {

		//split the line through space
		String inputLine[] = fileInput.nextLine().split(" ");

		if(inputLine[0].equalsIgnoreCase("student")) {

			try {

				String name = inputLine[1] + " " + inputLine[2];
				
				//Gets the integer value of the parsed id
				int id = Integer.parseInt(inputLine[3]);
				
				//Gets the integer value of the parsed phone number
				long phone = Long.parseLong(inputLine[5]);
				
				//Student object created
				Student st = new Student();
				st.studentId = id;
				st.studentName = name;
				st.phoneNumber = phone;
				
				//Prints information to .csv output file
				st.csvPrintln(out);

			}

		catch(Exception e) {

				System.out.println("Some exception occured! Enter the string again.");

				continue;

			}

	}

		else if(inputLine[0].equalsIgnoreCase("teacher")) {

			try {

				String name = inputLine[1] + " " + inputLine[2];
				int id = Integer.parseInt(inputLine[4]);
				int phone = Integer.parseInt(inputLine[5].substring(inputLine[5].length() - 4, inputLine[5].length()));
				
				//Teacher object created
				Teacher t = new Teacher();
				t.teacherId = id;
				t.teacherName = name;
				t.phoneNumber = phone;
				t.csvPrintln(out);

			}

			catch(Exception e) {

				System.out.println("Some exception occured! Enter the string again.");

				continue;

				}

			}

			else if (inputLine[0].equalsIgnoreCase("ta")) {

			try {

				String name = inputLine[1] + " " + inputLine[2];
				int id = Integer.parseInt(inputLine[4]);
				long phone = Long.parseLong(inputLine[5]);

				//TA object created
				TA t = new TA();
				
				//Set name, ID, and phone number.
				t.studentId = id;
				t.studentName = name;
				t.phoneNumber = phone;
				
				//Write those values to output file out.csv
				t.csvPrintln(out);

				}

			catch(Exception e) {

				System.out.println("Some exception occured! Please enter the string again!");

				continue;

				}

			}

			else {

				System.out.println("Invalid input! Enter again!");

				continue;

			}

	}

		//Close streams
		out.close();
		fileInput.close();

}
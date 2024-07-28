package FinalProject;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ViewAttendance extends Attendance {
Scanner userinput = new Scanner(System.in);
	@Override
	public void DailyAttendance(String studentid) {
		
		
		String daysPresent = studentid+"Present";
		String daysAbscent = studentid+"Abscent";
		  // Create a BufferedReader object to read the file
        BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("Dailyattendance.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        // Initialize a counter to keep track of the number of lines that contain the string
        int daysstudentpresent = 0;
        int daysstudentabscent = 0; 
        // Read each line of the file
        String line;
        try {
			while ((line = reader.readLine()) != null) {

			    // Check if the line contains the string
			    if (line.contains(daysPresent)) {

			        // Increment the counter
			        daysstudentpresent++;
			    }
			    if (line.contains(daysAbscent)) {

			        // Increment the counter
			        daysstudentabscent++;
			    }
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        

        // Close the BufferedReader object
        try {
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        // Print the number of lines that contain the string
        System.out.println("The number of days this student was present is "+ daysstudentpresent + " and the"
        		+ " number of days the student was abscent is "+ daysstudentabscent
        		);
        boolean repeat1 = false;
    	int userresponse = 0;
    		try {
    			System.out.println("Press 1 to go back to main menu and 2 to close down the program");
    			 userresponse = userinput.nextInt();
    		}catch(InputMismatchException e) {
    			try {
					StudentManagmentSystem.main(null);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
    		}
    		
    		if(userresponse == 1) {
    			try {
    				StudentManagmentSystem.main(null);
    			} catch (IOException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
    		}
    		else {
    			System.exit(0);
    		}
   
    }
        
	
	
	@Override
	public void IndividualCourseAttendance(String studentid, String coursename) {

		String daysPresent = studentid+coursename+"Present";
		String daysAbscent = studentid+coursename+"Abscent";
		  // Create a BufferedReader object to read the file
        BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("IndividualCourseAttendance.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        // Initialize a counter to keep track of the number of lines that contain the string
        int daysstudentpresent = 0;
        int daysstudentabscent = 0; 
        // Read each line of the file
        String line;
        try {
			while ((line = reader.readLine()) != null) {

			    // Check if the line contains the string
			    if (line.contains(daysPresent)) {

			        // Increment the counter
			        daysstudentpresent++;
			    }
			    if (line.contains(daysAbscent)) {

			        // Increment the counter
			        daysstudentabscent++;
			    }
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        

        // Close the BufferedReader object
        try {
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        // Print the number of lines that contain the string
        System.out.println("The number of days this student was present is "+ daysstudentpresent + " and the"
        		+ " number of days the student was abscent is "+ daysstudentabscent
        		);
        boolean repeat1 = false;
    	int userresponse = 0;
    	
    		try {
    			System.out.println("Press 1 to go back to main menu and 2 to close down the program");
    			 userresponse = userinput.nextInt();
    		}catch(InputMismatchException e) {
    			try {
					StudentManagmentSystem.main(null);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
    		}
    		
    		if(userresponse == 1) {
    			try {
    				StudentManagmentSystem.main(null);
    			} catch (IOException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
    		}
    		else {
    			System.exit(0);
    		}
    	
		
	}
}

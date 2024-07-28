package FinalProject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TakeAttendance extends Attendance{

	@Override
	public void DailyAttendance(String studentid) {
		Scanner userinput = new Scanner(System.in);
		
		//creates login for new user
		File file = new File("DailyAttendance.txt");
		if (file.exists()) {
		 
		} else {
		    try {
		        file.createNewFile();
		        System.out.println("The file was created.");
		    } catch (IOException e) {
		        System.out.println("An error occurred while creating the file.");
		    }
		}
		System.out.println("Type Present if student was present and Abscent if student was abscent");
		String usersresponse = userinput.next();
		
		String thingtowrite = studentid+usersresponse;
		try {
		    FileWriter fw = new FileWriter("DailyAttendance.txt", true); //the true parameter enables append mode
		    fw.write(thingtowrite + "\n");
		    fw.close();
		} catch (IOException e) {
		} 
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
Scanner userinput = new Scanner(System.in);
		
		//creates login for new user
		File file = new File("IndividualCourseAttendance.txt");
		if (file.exists()) {
		 
		} else {
		    try {
		        file.createNewFile();
		        System.out.println("The file was created.");
		    } catch (IOException e) {
		        System.out.println("An error occurred while creating the file.");
		    }
		}
		System.out.println("Type Present if student was present and Abscent if student was abscent");
		String usersresponse = userinput.next();
		
		String thingtowrite = studentid+coursename+usersresponse;
		try {
		    FileWriter fw = new FileWriter("IndividualCourseAttendance.txt", true); //the true parameter enables append mode
		    fw.write(thingtowrite + "\n");
		    fw.close();
		} catch (IOException e) {
		} 
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

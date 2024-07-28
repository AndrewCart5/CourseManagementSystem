package FinalProject;
import java.io.FileWriter;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Date;
import java.util.List;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
public class StudentRegistration {
Scanner userinput = new Scanner(System.in);

public void registerStudent() {
	boolean repeatagain = false;
	String userpass = null;
	int id = 0;
	String firstname = null;
	String lastname = null;
	int yearborn = 0;
	int month = 0;
	int day = 0;
	Date date = null;
	String contact = null;
	int enrollment = 0;
	
		try {
			System.out.println("Please create an id: "); 
			 id = userinput.nextInt();
			System.out.println("Please enter the first name: ");
			 firstname = userinput.next();
			System.out.println("Please enter the last name");
			 lastname = userinput.next();
			System.out.println("Please enter the year born: ");
			 yearborn = userinput.nextInt();
			System.out.println("Please enter the month born, starting at 0 for January and 11 for December");
			 month = userinput.nextInt();
			System.out.println("Please enter the day born");
			 day = userinput.nextInt();
			 
			 date = new Date((yearborn-1900),month,day);

			System.out.println("Please enter your contact");
			 contact = userinput.next();

			System.out.println("Please enter your enrollment");
			 enrollment = userinput.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("You entered wrong information");
			try {
				StudentManagmentSystem.main(null);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		

	
	

	//creates login for new user
	File file = new File("StudentUsernames&Passwordlist.txt");
	if (file.exists()) {
	 
	} else {
	    try {
	        file.createNewFile();
	        System.out.println("The file was created.");
	    } catch (IOException e) {
	        System.out.println("An error occurred while creating the file.");
	    }
	}
	try {
	    FileWriter fw = new FileWriter("StudentUsernames&Passwordlist.txt", true); //the true parameter enables append mode
	    Scanner userscan = new Scanner(new File("myfile.txt"));
	    boolean repeated = false;
	   
	    	System.out.println("Please create a username");
	    	String username = userinput.next();
	    	System.out.println("Please create a password: ");
	    	String password = userinput.next();
	    	  userpass = username+password;
	    	 
		    
		    
	    	
	   
	    
	    fw.write(userpass + "\n");
	    fw.close();
	} catch (IOException e) {
	} 

	Student.addStudent(id, firstname, lastname, date, contact, enrollment);	
	System.out.println("Student successfully registered");
	boolean repeat1 = false;
	int userresponse = 0;
	do {
		try {
			System.out.println("Press 1 to go back to main menu and 2 to close down the program");
			 userresponse = userinput.nextInt();
		}catch(InputMismatchException e) {
			repeat1 = true;
		}
		
		if(userresponse == 1) {
			try {
				StudentManagmentSystem.main(null);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(userresponse == 2){
			System.exit(0);
		}
	}while(repeat1 || (userresponse !=1 && userresponse != 2));
	
	
	
	
}

public void registerTeacher() {
	int id = 0;
	String firstname = null;
	String lastname = null;
	int yearborn = 0;
	int month = 0;
	int day = 0;
	Date date = null;
	String contact = null;
	int employeeid = 0;
	String Qualification = null;
	String username = null;
	String password = null;
	String userpass = null;
	
	try {
		System.out.println("Please create an id: "); 
		 id = userinput.nextInt();
		System.out.println("Please enter the first name: ");
		 firstname = userinput.next();
		System.out.println("Please enter the last name");
		 lastname = userinput.next();
		System.out.println("Please enter the year born: ");
		 yearborn = userinput.nextInt();
		System.out.println("Please enter the month born, starting at 0 for January and 11 for December");
		 month = userinput.nextInt();
		System.out.println("Please enter the day born");
		 day = userinput.nextInt();

		 date = new Date((yearborn-1900),month,day);

		System.out.println("Please enter your contact");
		 contact = userinput.next();
		
		System.out.println("Please enter your employee id: ");
		 employeeid = userinput.nextInt();

		System.out.println("Please enter your Qualification");
		 Qualification = userinput.next(); 
	}catch(InputMismatchException e) {
		System.out.println("You entered the wrong info");
		try {
			StudentManagmentSystem.main(null);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	try {
	    FileWriter fw = new FileWriter("TeacherUsernames&Passwordlist.txt", true); //the true parameter enables append mode
	    Scanner userscan = new Scanner(new File("TeacherUsernames&Passwordlist.txt"));
	    boolean repeated = false;
	   
	    
	    	System.out.println("Please create a username");
	    	 username = userinput.next();
	    	System.out.println("Please create a password: ");
	    	 password = userinput.next();
	    	  userpass = username+password;
	    	
	    	
	    
	    
	    fw.write(userpass + "\n");
	    fw.close();
	} catch (IOException e) {
	} 
	
	
	Teacher.addTeacher(id, firstname, lastname, date, contact, employeeid, Qualification);
	System.out.println("Teacher successfully registered");
	boolean repeat1 = false;
	int userresponse = 0;
	do {
		try {
			System.out.println("Press 1 to go back to main menu and 2 to close down the program");
			 userresponse = userinput.nextInt();
		}catch(InputMismatchException e) {
			repeat1 = true;
		}
		
		if(userresponse == 1) {
			try {
				StudentManagmentSystem.main(null);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(userresponse == 2){
			System.exit(0);
		}
	}while(repeat1 || (userresponse !=1 && userresponse != 2));
}

public void registerAdmin() {
	int id = 0;
	String firstname = null;
	String lastname = null;
	int yearborn = 0;
	int month = 0;
	int day = 0;
	Date date = null;
	String contact = null;
	int enrollment = 0;
	String username = null;
	String password = null;
	String userpass = null;
	
	try {
		System.out.println("Please create an id: "); 
		 id = userinput.nextInt();
		System.out.println("Please enter the first name: ");
		 firstname = userinput.next();
		System.out.println("Please enter the last name");
		 lastname = userinput.next();
		System.out.println("Please enter the year born: ");
		 yearborn = userinput.nextInt();
		System.out.println("Please enter the month born, starting at 0 for January and 11 for December");
		 month = userinput.nextInt();
		System.out.println("Please enter the day born");
		 day = userinput.nextInt();

		 date = new Date((yearborn-1900),month,day);

		System.out.println("Please enter your contact");
		 contact = userinput.next();

		System.out.println("Please enter your enrollment");
		 enrollment = userinput.nextInt();
	}catch(InputMismatchException e) {
		System.out.println("You entered the wrong info");
		try {
			StudentManagmentSystem.main(null);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	

	System.out.println("Please create a username");
	 username = userinput.next();
	System.out.println("Please create a password: ");
	 password = userinput.next();

	 userpass = username+password;
	//creates login for new user
	File file = new File("AdminUsernames&Passwordlist.txt");
	if (file.exists()) {
	 
	} else {
	    try {
	        file.createNewFile();
	        System.out.println("The file was created.");
	    } catch (IOException e) {
	        System.out.println("An error occurred while creating the file.");
	    }
	}
	try {
	    FileWriter fw = new FileWriter("AdminUsernames&Passwordlist.txt", true); //the true parameter enables append mode
	    fw.write(userpass + "\n");
	    fw.close();
	} catch (IOException e) {
	} 
	Administrator.addAdmins(id, firstname, lastname, date, contact);
	System.out.println("Admin successfully registered");
	boolean repeat1 = false;
	int userresponse = 0;
	do {
		try {
			System.out.println("Press 1 to go back to main menu and 2 to close down the program");
			 userresponse = userinput.nextInt();
		}catch(InputMismatchException e) {
			repeat1 = true;
		}
		
		if(userresponse == 1) {
			try {
				StudentManagmentSystem.main(null);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(userresponse == 2){
			System.exit(0);
		}
	}while(repeat1 || (userresponse !=1 && userresponse != 2));

}
}



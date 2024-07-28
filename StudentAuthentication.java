package FinalProject;
import java.io.BufferedReader;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
public class StudentAuthentication extends UserAuthentication {


public void authenticationUser() throws FileNotFoundException {


Scanner userinput = new Scanner(System.in);

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






outerloop:
for(int i = 0; i<5; i++) { //gives user 5 attemps for a successful login and if doesn't have one, exits proggram
	System.out.println("Please enter your username");
	String username = userinput.next();
	System.out.println("Please enter your password");
	String password = userinput.next();

	String usernameandpassword = username+password;
	Scanner scanner = new Scanner(file);
	boolean successfullogin = false;

	
	
	 
	do {
	
		String line = scanner.nextLine();
	
        if (line.contains(usernameandpassword)) {
            successfullogin = true;
            break outerloop; // Exit the loop once the login is found
        }
	}while(scanner.hasNextLine());
	

	}

System.out.println("You have successfully logged in");//code to run after user successfully logs in
int useraction = 0;
do {
	System.out.println("Press 1 if you would like to update a course"
			+ " a course\nPress 2 to view attendance\nPress 3 to view grades");
	 useraction = userinput.nextInt();	
}while(useraction !=1 && useraction !=2 && useraction != 3);

switch(useraction){ 
case 1: {
	CourseManager coursemanager = new CourseManager();
	coursemanager.updatecourse();
	
	//if student wants to go to courses
}
	
case 2:{
	int attendanceinput = 0;
	Attendance viewattendance = new ViewAttendance();
	do {
		System.out.println("Press 1 to view daily attendance and 2 to view course"
				+ " based attendance ");
		attendanceinput = userinput.nextInt();
	}while(attendanceinput != 1 && attendanceinput != 2);
	if(attendanceinput == 1) {
		System.out.println("Please enter your student id to view your attendance"); //view daily attendance
		String studentid = userinput.next();
		viewattendance.DailyAttendance(studentid);
	}
	else {//view coursebased attendance for a student
		System.out.println("Please enter your student id to view your attendance"); //view daily attendance
		String studentid = userinput.next();
		System.out.println("Please enter your course id:");
		String courseid = userinput.next();
		viewattendance.IndividualCourseAttendance(studentid, courseid);
		
	}
	break;//if student wants to view attendance
}
	
case 3:{//if student wants to view grades
	System.out.println("The student would like to view grades");
	GradeManager grademanager = new GradeManager();
	int userinput2 = 0;
	do {
		System.out.println("Press 1 to view a quiz grade, 2 to view a test grade, 3 to view an assignment grade");
		 userinput2 = userinput.nextInt();
	}while(userinput2!=1 && userinput2!=2 && userinput2!=3);
	if(userinput2 == 1) {
		System.out.println("Please enter your course id");
		String courseid = userinput.next();
		System.out.println("Please enter the quiz name");
		String quizname = userinput.next();
		grademanager.quizgrade(courseid, quizname);
		
	}
	else if(userinput2 == 2) {
		System.out.println("Please enter your course id");
		String courseid = userinput.next();
		System.out.println("Please enter the test name");
		String testname = userinput.next();
		grademanager.testgrade(courseid, testname);
		
	}
	else if(userinput2 == 3) {
		
		System.out.println("Please enter your course id");
		String courseid = userinput.next();
		System.out.println("Please enter the assignment name");
		String assignmentname = userinput.next();
		grademanager.assignmentgrade(courseid, assignmentname);
		
	}
	
	break;
	
}
	
}
	


}
}




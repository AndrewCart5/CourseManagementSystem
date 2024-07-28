
package FinalProject;

import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;  
public class StudentManagmentSystem {



public static void main(String[] args) throws IOException {

Scanner userinput = new Scanner(System.in);
int usersans = 0;
do {
	try {
		System.out.println("Press 1 to login and 2 to create a new account");

		 usersans = userinput.nextInt();
	}catch(InputMismatchException e) {
		
	}
	
}while(usersans != 1 && usersans != 2);


if(usersans == 1) { //user wants to login

UserAuthentication user = null;




	int usertype = 0;
do {
	try {
		System.out.println("Press 1 if you are a student, 2 if you are an admin, and 3 if you are a teacher");

		 usertype = userinput.nextInt();
	}catch(InputMismatchException e) {
		
	}
	
}while(usertype != 1 && usertype != 2 && usertype != 3);

if(usertype ==1) {  //student login

user = new StudentAuthentication();

}

else if(usertype == 2) {   //Administrator Login

user = new AdministratorAuthenticator();

}

else if(usertype == 3) { //Teacher Login

user = new TeacherAuthenticator();

}


	user.authenticationUser();
} //goes to authentication page for each user type

else if (usersans == 2) { //user wants to register somebody
StudentRegistration newperson = new StudentRegistration();
System.out.println("Press 1 to register a teacher, 2 to register a student, and 3 to register an administrator");

int answers = userinput.nextInt();

if(answers ==1 ) {

newperson.registerTeacher();

}

else if(answers ==2) {

newperson.registerStudent();

}

else if(answers ==3) {

newperson.registerAdmin();

}

}
}


 



}


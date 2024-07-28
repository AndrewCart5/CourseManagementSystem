package FinalProject;
import java.io.BufferedReader;
import java.util.InputMismatchException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class GradeManager implements GradeManagement{
Scanner userinput = new Scanner(System.in);
	
@Override
public void quizgrade(String userid, String courseid, String quizname, double grade) { //adds quiz grade
	
		
		String thingtowrite = userid+" "+courseid+" "+quizname+" "+grade;
		File file = new File("QuizGrades.txt");
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
		    FileWriter fw = new FileWriter("QuizGrades.txt", true); //the true parameter enables append mode
		    fw.write(thingtowrite + "\n");
		    fw.close();
		} catch (IOException e) {
		} 
		boolean repeat = false;
		
		System.out.println("Quiz Grade successfully submitted");
		int userinput2 = 0;
		do {
			repeat = false;
			try {
				System.out.println("Press 1 to go back to main menu and 2 to exit program");
				 userinput2 = userinput.nextInt();
			}catch(InputMismatchException  e) {
				repeat = true;
			}
		}while(repeat);
		
		if(userinput2 == 1) {
			try {
				StudentManagmentSystem.main(null);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			System.exit(0);
		}
		}
		
	
	
@Override
public void quizgrade(String courseid, String quizname) { //lets you view quiz grade as either average for class or for specific student
	  //view specific student course grade on assignment
	System.out.println("What is your student id?");
	String studentid = userinput.next();
	String thingtocheckfor =studentid+" "+courseid+" "+quizname;
	BufferedReader reader = null;
	try {
		reader = new BufferedReader(new FileReader("QuizGrades.txt"));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

    
    String line;
    int count = 0;
    try {
		while ((line = reader.readLine()) != null) {

		    // Check if the line contains the string
		    if (line.contains(thingtocheckfor)) {
		    		count++;
		        
		        System.out.println(line); //prints the line that has the matching grade
		    }
		   
		    
		}
		if(count == 0) {
	    	System.out.println("Sorry no grades found");
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
    
    boolean repeat = false;
	
	
	int userinput2 = 0;
	do {
		repeat = false;
		try {
			System.out.println("Press 1 to go back to main menu and 2 to exit program");
			 userinput2 = userinput.nextInt();
		}catch(InputMismatchException  e) {
			repeat = true;
		}
	}while(repeat);
	
	if(userinput2 == 1) {
		try {
			StudentManagmentSystem.main(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}else {
		System.exit(0);
	}

	}


@Override
public void testgrade(String userid, String courseid, String quizname, double grade) {
	String thingtowrite = userid+" "+courseid+" "+quizname+" "+grade;
	File file = new File("TestGrades.txt");
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
	    FileWriter fw = new FileWriter("TestGrades.txt", true); //the true parameter enables append mode
	    fw.write(thingtowrite + "\n");
	    fw.close();
	} catch (IOException e) {
	} 
	boolean repeat = false;
	
	System.out.println("Test Grade successfully submitted");
	int userinput2 = 0;
	do {
		repeat = false;
		try {
			System.out.println("Press 1 to go back to main menu and 2 to exit program");
			 userinput2 = userinput.nextInt();
		}catch(InputMismatchException  e) {
			repeat = true;
		}
	}while(repeat);
	
	if(userinput2 == 1) {
		try {
			StudentManagmentSystem.main(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}else {
		System.exit(0);
	}
}

@Override
public void testgrade(String courseid, String quizname) {
	
	//view specific student course grade on assignment
	System.out.println("What is your student id?");
	String studentid = userinput.next();
	String thingtocheckfor =studentid+" "+courseid+" "+quizname;
	BufferedReader reader = null;
	try {
		reader = new BufferedReader(new FileReader("TestGrades.txt"));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

    
    String line;
    int count = 0;
    try {
		while ((line = reader.readLine()) != null) {

		    // Check if the line contains the string
		    if (line.contains(thingtocheckfor)) {
		    		count++;
		        
		        System.out.println(line); //prints the line that has the matching grade
		    }
		    
		}
		if(count == 0) {
	    	System.out.println("Sorry no grades found");
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
    boolean repeat = false;
	
	int userinput2 = 0;
	do {
		repeat = false;
		try {
			System.out.println("Press 1 to go back to main menu and 2 to exit program");
			 userinput2 = userinput.nextInt();
		}catch(InputMismatchException  e) {
			repeat = true;
		}
	}while(repeat);
	
	if(userinput2 == 1) {
		try {
			StudentManagmentSystem.main(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}else {
		System.exit(0);
	}

	}	



@Override
public void assignmentgrade(String userid, String courseid, String quizname, double grade) {
	String thingtowrite = userid+" "+courseid+" "+quizname+" "+grade;
	File file = new File("assignmentgrades.txt");
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
	    FileWriter fw = new FileWriter("assignmentgrades.txt", true); //the true parameter enables append mode
	    fw.write(thingtowrite + "\n");
	    fw.close();
	} catch (IOException e) {
	} 
	boolean repeat = false;
	
	System.out.println("Assignment Grade successfully submitted");
	int userinput2 = 0;
	do {
		repeat = false;
		try {
			System.out.println("Press 1 to go back to main menu and 2 to exit program");
			 userinput2 = userinput.nextInt();
		}catch(InputMismatchException  e) {
			repeat = true;
		}
	}while(repeat);
	
	if(userinput2 == 1) {
		try {
			StudentManagmentSystem.main(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}else {
		System.exit(0);
	}
}

@Override
public void assignmentgrade(String courseid, String quizname) {
	 //view specific student course grade on assignment
	System.out.println("What is your student id?");
	String studentid = userinput.next();
	String thingtocheckfor =studentid+" "+courseid+" "+quizname;
	BufferedReader reader = null;
	try {
		reader = new BufferedReader(new FileReader("assignmentgrades.txt"));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

    int count = 0;
    String line;
    try {
		while ((line = reader.readLine()) != null) {

		    // Check if the line contains the string
		    if (line.contains(thingtocheckfor)) {

		        count++;
		        System.out.println(line); //prints the line that has the matching grade
		    }
		    
		    
		}
		if(count == 0) {
	    	System.out.println("Sorry no grades found");
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
    boolean repeat = false;
	
	int userinput2 = 0;
	do {
		repeat = false;
		try {
			System.out.println("Press 1 to go back to main menu and 2 to exit program");
			 userinput2 = userinput.nextInt();
		}catch(InputMismatchException  e) {
			repeat = true;
		}
	}while(repeat);
	
	if(userinput2 == 1) {
		try {
			StudentManagmentSystem.main(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}else {
		System.exit(0);
	}

	}





}

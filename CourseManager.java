package FinalProject;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;

public class CourseManager implements CourseManagement {
	Scanner userinput = new Scanner(System.in);

	@Override
	public  void addcourse() {
		System.out.println("Enter the courseid");
		String courseid = userinput.next();
		String filename = courseid+".txt";
		File file = new File(filename);

        // Try to create the file
        try {
            file.createNewFile();
            System.out.println("File created successfully!");
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
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
	
	@Override
	public void updatecourse() { //adds or drops students from an existing course
		System.out.println("What is the course id of the course");
		String courseid = userinput.next();
		int useranswer = 0;
		do {
			System.out.println("Press 1 to add a student and 2 to drop a student");
			 useranswer = userinput.nextInt();
		}while(useranswer!=1 && useranswer!= 2);
		if(useranswer == 1) {//add a student
			String filename = courseid +".txt";
			File file = new File(filename);
			if (file.exists()) {
			 
			} else {
			    try {
			        file.createNewFile();
			        System.out.println("The file was created.");
			    } catch (IOException e) {
			        System.out.println("An error occurred while creating the file.");
			    }
			}
			System.out.println("What is the students id");
			String studentid = userinput.next();
			System.out.println("What is the students first name and last initial");
			String firstandlast = userinput.next();
			
			String thingtowrite = studentid +" "+ firstandlast;
			try {
			    FileWriter fw = new FileWriter(filename, true); //the true parameter enables append mode
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
		else {//drop a student
			String filename = null;
			String studentid = null;
			File tempfile = null;
			BufferedReader reader = null;
			boolean repeat = false;
			do {
				try {
					repeat = false;
					 filename = courseid +".txt";
					System.out.println("What is the students id");
					 studentid = userinput.next();
					
				     tempfile = new File("temp.txt");
				    
					reader = new BufferedReader(new FileReader(filename));
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					repeat = true;
				
			}
			}while(repeat);
		
		    BufferedWriter writer = null;
			try {
				writer = new BufferedWriter(new FileWriter(tempfile));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		    String currentLine;

		    // Read lines from input file
		    try {
				while ((currentLine = reader.readLine()) != null) {
				  // Check if line doesn't contain the word
				  if (!currentLine.toLowerCase().contains(studentid.toLowerCase())) {
				    // Write the line to the temporary file
				    writer.write(currentLine + System.getProperty("line.separator"));
				  }
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		    try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		    // Delete the original file
		    new File(filename).delete();

		    // Rename temporary file to original file name
		    tempfile.renameTo(new File(filename));
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
		
		
		
	
	
	@Override
	public void deletecourse() { //deletes an existing course
		System.out.println("What is the courseid of the course you would like to delete");
		String courseid = userinput.next();
		String filename = courseid+".txt";
		File file = new File(filename);

	    // Check if the file exists
	    if (file.exists()) {
	      // Delete the file
	      file.delete();

	      // Print a success message
	      System.out.println("Deleted the course: " + file.getName());
	    } else {
	      // Print an error message
	      System.out.println("The file does not exist.");
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

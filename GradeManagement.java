package FinalProject;

public interface GradeManagement {

	
	public void quizgrade(String userid, String coursename, String quizname, double grade);
	
	public void quizgrade(String coursename, String quizname); //views class wide average grade
	
	public void testgrade(String userid, String coursename, String quizname, double grade);
	
	public void testgrade(String coursename, String quizgrade); //views class wide test grade
	
	public void assignmentgrade(String userid, String coursename, String quizname, double grade);
	
	public void assignmentgrade(String coursename, String quizgrade);
	
	
	
	
	
}

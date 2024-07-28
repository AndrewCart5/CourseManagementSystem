package FinalProject;

import java.util.ArrayList;

import java.util.Date;

import java.util.List;

public class Student extends Person{

	static List<Student> ListofStudents = new ArrayList<>();



public Student(int id,String firstname,String lastname,Date dob, String Contact, int enrollment ) {

super(id,firstname,lastname,dob,Contact);

this.enrollment = enrollment;



}

public static void addStudent(int id,String firstname,String lastname,Date dob, String Contact, int enrollment ) {
	ListofStudents.add(new Student(id, firstname, lastname, dob, Contact,enrollment));




}
public static void PrintStudents() {
	
}

int enrollment;

}
package FinalProject;

import java.util.ArrayList;

import java.util.Date;

import java.util.List;

public class Teacher extends Person {

static List<Teacher> ListofTeachers = new ArrayList<>();



public Teacher(int id,String firstname,String lastname, Date dob, String Contact, int employeeid, String Qualification) {

super(id,firstname,lastname,dob,Contact);

this.employeeid = employeeid;

this.Qualification = Qualification;




}

public static void addTeacher(int id, String firstname, String lastname, Date dob, String Contact, int employeeid, String Qualification) {

ListofTeachers.add(new Teacher(id, firstname, lastname, dob, Contact, employeeid,Qualification));



}



int employeeid;

String Qualification;

}
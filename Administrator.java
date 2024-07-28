package FinalProject;

import java.util.ArrayList;

import java.util.Date;

import java.util.List;

public class Administrator extends Person {

static List<Administrator> Listofadmins = new ArrayList<>();





public Administrator(int id,String firstname, String lastname,Date dob, String Contact ) {

super(id, firstname, lastname, dob,Contact);

this.Contact = Contact;



}

public  static void addAdmins(int id,String firstname, String lastname,Date dob, String Contact ) {

Listofadmins.add(new Administrator(id, firstname, lastname, dob, Contact));



}

String Contact = null;

}
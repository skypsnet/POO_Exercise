package org.generation.clases;

public class Student {
    String firstName;
    String lastName;
    int registration;
    int grade;
    int year;
    
    public Student(String firstName, String lastName, int registration, int grade, int year) {
    	
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.registration = registration;
    	this.grade = grade;
    	this.year = year;
    	
    }
    
    public Student(String firstName, int registration, int grade, int year) {
    	
    	this.firstName = firstName;
    	this.lastName = "";
    	this.registration = registration;
    	this.grade = grade;
    	this.year = year;
    	
    }
    
    public Student(String firstName, int grade, int year) {
    	
    	this.firstName = firstName;
    	this.lastName = "";
    	this.registration = 1;
    	this.grade = grade;
    	this.year = year;
    	
    }
   
    public void printFullName(){
        System.out.println(this.firstName+" "+this.lastName);
     }

     public boolean isApproved(){
         //TODO implement: should return true if grade >= 60
    	 return this.grade>=60;
     }

     public void changeYearIfApproved(){
         //TODO implement: the student should advance to the next year if he/she grade is >= 60
         // Make year = year + 1, and print "Congratulations" if the student has been approved
    	 this.year = this.isApproved()?this.year+1:this.year;
    	 
    	 if(this.isApproved()){
    	 System.out.println("El alumno aprobó pasa al año "+this.year);
         }else {
         System.out.println("El alumno reprobo por lo que mantiene en el año");  	 
         }
     }
    
    
}

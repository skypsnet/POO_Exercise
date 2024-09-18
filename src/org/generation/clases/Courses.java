package org.generation.clases;

import java.util.ArrayList;
import java.util.List;

public class Courses {
     String courseName;
     String professorName;
     int year;
     List<Student> alumnosInscritos = new ArrayList<>();
     
     public Courses(String courseName, String professorName) {
    	 
    	 this.courseName = courseName;
    	 this.professorName = professorName;
    	 
     }
     
     
     public void enroll(Student student){
         //TODO add the student to the collection
    	 alumnosInscritos.add(student);
    	 System.out.println("El alumno "+student.firstName+" fue inscrito");
      }
     
     public void enroll(List<Student> students){
         //TODO add the student to the collection
    	 alumnosInscritos.addAll(students);
   
    	 System.out.println("Los alumnos fueron inscritos fue inscrito");
      }

      public void unEnroll(Student student){
          //TODO remove this student from the collection
          // Hint: check if that really is this student
    	  
    	  if(this.alumnosInscritos.contains(student)) {
    		  
    	  this.alumnosInscritos.remove(student);
    	  System.out.println("El alumno: "+student.firstName+" fue desinscrito");	  
    		  
    	  }else {
    		  
    	  System.out.println("El alumno no se encuentra en la lista de inscritos");
    	  }
    	  
      }

      public int countStudents(){
          //TODO implement
          return alumnosInscritos.size();
      }
      
      public int bestGrade(){
         int maxValue = alumnosInscritos.size()==0?0:alumnosInscritos.get(0).grade; 
    	   
    	   for(int i=1; i< alumnosInscritos.size();i++) {
    		   
    		   maxValue = alumnosInscritos.get(i).grade>maxValue ? alumnosInscritos.get(i).grade:maxValue;
    		   
    	   } 
    	  
          return maxValue;
      }
      
      public int average(){
          int sumValue = 0;
          
     	   for(int i=0; i< alumnosInscritos.size();i++) {
     		   
     		   sumValue += alumnosInscritos.get(i).grade;
     		   
     	   } 
     	    
           return sumValue/alumnosInscritos.size();
       }
      
      public void showStudentAverage(){
  
     	   for(int i=0; i< alumnosInscritos.size();i++) {
     		   
     		   if(alumnosInscritos.get(i).grade>average()){
     			   System.out.println("El alumno "+alumnosInscritos.get(i).firstName+" esta arriba del promedio");
     		   }else {
     			  System.out.println("El alumno "+alumnosInscritos.get(i).firstName+" esta debajo del promedio");
     		   }
     		   
     	   } 
     	   
       }
      
      public void showRanking(){
    	  
    	   for(int i=0; i< alumnosInscritos.size();i++) {
    		   
    		   if(alumnosInscritos.get(i).grade>average()){
    			   System.out.println("El alumno "+alumnosInscritos.get(i).firstName+" esta arriba del promedio");
    		   }else {
    			  System.out.println("El alumno "+alumnosInscritos.get(i).firstName+" esta debajo del promedio");
    		   }
    		   
    	   } 
    	   
      }
      
      
      
      
}

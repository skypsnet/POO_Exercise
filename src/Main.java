import java.util.ArrayList;
import java.util.List;

import org.generation.clases.*;

public class Main {
   public static void main(String[] args) {
	 
	   Student student1 = new Student("Ricardo","Balam",312333058,80,2);
	   Student student2 = new Student("Estefania","Solorzano",312333059,50,2);
	   Courses curso1 = new Courses("Filosofía","Javier Urrea");
	   
	   student1.printFullName();
	   student2.changeYearIfApproved();
	   
	   curso1.enroll(student1);
	   curso1.enroll(student2);
	   System.out.println("The best grade is: "+curso1.bestGrade());  
	   curso1.unEnroll(student1);
	   System.out.println("The number of students is: "+curso1.countStudents());	 
	   
	   Student student3 = new Student("Ulises","Miranda",312333018,10,2);
	   Student student4 = new Student("Elena","Escobar",312333039,70,2);
	   
	   List<Student> alumnosInscribir = new ArrayList<>();
	   alumnosInscribir.add(student3);
	   alumnosInscribir.add(student4);
	   
	   curso1.enroll(alumnosInscribir);
	   System.out.println("The number of students is: "+curso1.countStudents());
	   
	   System.out.println("The average of students is: "+curso1.average());
	   
	   curso1.showStudentAverage();
	     
	   
   }
}

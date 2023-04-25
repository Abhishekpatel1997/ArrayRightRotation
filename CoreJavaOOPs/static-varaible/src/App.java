import java.util.Scanner;

public class App {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	//Student.setTrainerName("Rehan Ahmad");
	//Student.setTrainerName("Abhishek patel");
	Student s1=new Student(2,"kundan");
//	s1.showDetails();
	Student s2=new Student(3,"Neeraj");
	Student s3=new Student(4,"Ashish");
	Student s4=new Student(5,"Ravi");
	s1.showDetails();
	s2.showDetails();
	s3.showDetails();
	s4.showDetails();
	
}
}

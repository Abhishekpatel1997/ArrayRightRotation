
public class App {
public static void main(String[] args) {
	Person p1,p2,p3;//code to create reference variables
	//code to create three objects from class Person and assigning 
	//reference of the object to the variable
	 p1=new Person("Abhishek",60,26);
	 p2=new Person("Kundan",74,21);
	 p3=new Person("Neeraj",59,28);

	// code to call showDeatails()method of class person
	 //	p1.showDetails();
//	p2.showDetails();
//	p3.showDetails();
	 System.out.println("p1 "+p1);
	 p1.showDetails();
	 p1=p2;
	 p2=p3;
	 p1.showDetails();
}
}

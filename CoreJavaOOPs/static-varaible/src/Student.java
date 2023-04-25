
public class Student {
private int sid;
private String name;
public static String trainerName="Reham Ahmad";
public Student(int id,String na)
{
	this.sid=id;
	this.name=na;
}
//public static void setTrainerName(String trainer)
//{
//	Student.trainerName=trainer;
//}
public void showDetails()
{
	System.out.println("Student id:"+this.sid);
	System.out.println("Student name:"+this.name);
	System.out.println("Trainer name:"+Student.trainerName);
	System.out.println("=================");
}

}

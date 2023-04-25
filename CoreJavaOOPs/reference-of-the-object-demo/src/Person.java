
public class Person {
//code to create instance variable
	private String name;
	private double weight;
	private int age;
	//Constructor
	public Person(String p1,double p2,int p3)
	{
		this.name=p1;
		this.weight=p2;
		this.age=p3;
	}
	//methods
	public void showDetails()
	{
		System.out.println("this "+this);
		System.out.println("Name of person :"+name);
		System.out.println("Weight of person :"+weight);
		System.out.println("Age of person "+age);
		System.out.println("=======================");
	}
}

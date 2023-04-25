
public class LeapYear {
public static void main(String[] args) {
	int year=400;
	if(year%4==0 && year%100!=0 || year%400==0)
	{
		System.out.println("The year is leap year");
	}
	else
	{
	System.out.println("the year is not leap year");
	}
}
}

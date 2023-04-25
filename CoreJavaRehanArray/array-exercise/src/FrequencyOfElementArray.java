import java.util.Scanner;

public class FrequencyOfElementArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = sc.nextLine();
		String list[] = new String[] { "Neeraj", "Kundan", "Abhishek", "pushpa" };
		int y = 0;
		for (int i = 0; i < list.length; i++) {
			if (name.equals(list[i])) {
				
				y = 1;
				break;
			}
		}
		if (y == 1)
			
			System.out.println("The name exist");
		else
			
			System.out.println("the name does not exist");
	}
}

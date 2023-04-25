import java.util.Scanner;

public class NameSearchInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int x = sc.nextInt();
		int n[] = new int[] { 3, 4, 5, 6, 7, 3, 3, 3, 11 };
		int y = 0;
		for (int i = 0; i < n.length; i++) {
			if (x == n[i]) {
				//y++;
				y=1;
				break;
			}
		}
		if (y==1)  //y != 0
			//System.out.println("Frequency of " + x + " is:" + y);
			System.out.println("The number exist");
		else
			//System.out.println(x + "dose not exits in list");
			System.out.println("the number does not exist");
	}
}

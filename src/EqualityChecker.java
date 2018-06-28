import java.util.Scanner;

public class EqualityChecker {
	
	public static void main(String args[]) {
		Scanner test = new Scanner(System.in);
		for (int i=0; i<16; i++) {
			System.out.println("First thing to compare: ");
			String first = test.nextLine();
			System.out.println("Second thing to compare: ");
			String second = test.nextLine();
			System.out.println(i+1);
			if (first.equals(second)) System.out.println("true");
			else System.out.println("false");
		}
		
	
	}
	
}

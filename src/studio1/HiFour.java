package studio1;

import java.util.Scanner;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter value for arg 0: ");
		String s0 = in.nextLine();
		s0 = ("Greetings Cormen,");
		System.out.print("Enter value for arg 1: ");
		String s1 = in.nextLine();
		s1 = ("Leiserson,");
		System.out.print("Enter value for arg 2: ");
		String s2 = in.nextLine();
		s2 = ("Rivest,");
		System.out.print("Enter value for arg 3: ");
		String s3 = in.nextLine();
		s3 = ("and Stein");
		//
		// Say hello to the names in s0 through s3.
		//

		Scanner name = new Scanner(System.in);
		System.out.print(s0);
		s0 = ("Greetings Cormen,");
		System.out.print(s1);
		s1 = ("Leiserson,");
		System.out.print(s2);
		s2 = ("Rivest,");
		System.out.print(s3);
		s3 = ("Stein");
		
	}
}

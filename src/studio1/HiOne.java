package studio1;

import java.util.Scanner;

public class HiOne {

	/**
	 * Says hello to the supplied argument
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter value for arg 0: ");
		String name = in.nextLine();
		System.out.print(name);
		
		//
		// Below this line, enter code so that this program's output says
		//      Hi, Pat.  How are you?
		// if the value of name is "Pat"
		// 
		
		Scanner inn = new Scanner(System.in);
		System.out.print("Hi Pat. How are you?");
		String greet = inn.nextLine();
		
	}

}

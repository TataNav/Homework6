/*
 *  Input a string. Check if string is a palindrome 
 *  (A palindrome is a sequence of characters which reads the same backward as forward, such as madam, racecar).
 */
import java.util.Scanner;
public class Problem3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//System.out.println("Input a string: ");
		String s = "mad_dam"; //scanner.nextLine();
		
		boolean res = true;
		for (int i  = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				res = false;
				break;
			}
		}
		
		if(res)
			System.out.println("palindrome");
		else
			System.out.println("not");
	}

}

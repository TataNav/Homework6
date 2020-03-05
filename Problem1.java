/*
 * Input a string and an integer k . Find the character at index k or print "out of bounds" if k is out of stings length.
 */
import java.util.Scanner;
public class Problem1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a string: ");
		String s = scanner.nextLine();
		System.out.print("Input an index: ");
		int k = scanner.nextInt();
		
		String result = "Out of bound";
		
		for (int i = 0; i < s.length() - 1; i++) {
			if (k == i) {
				result = String.valueOf(s.charAt(i));
				break;
			}
		}
		System.out.println(result);
	}
}
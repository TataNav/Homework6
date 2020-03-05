/*
 *  Input a string. Count number of words in that string. Word is any sequence of characters that doesn't contain space.
 */
import java.util.Scanner;
public class Problem2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		//System.out.println("Input a string: ");
		String s1 = " That's   life";//scanner.nextLine();
		String s2 = new String();
		
		
		if(!s1.isEmpty()) {
			if(s1.charAt(0) == ' '|| s1.charAt(s1.length()-1) == ' ') {
				s2 = s1.trim();
			}
			int word = 1;
			for (int i = 0; i < s2.length() - 1;) {
				if (s2.charAt(i) != ' ') {
					i++;
				}else {
					int j = i;
					while (s2.charAt(j) == ' ') {
						j++;
					}
					word += 1;
					i = j;
				}
			}				
			System.out.println("Number of words - " + word + ".");
		}
	}
}
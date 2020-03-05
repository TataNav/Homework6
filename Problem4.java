/*
 * Input a string and an integer n. Print nth rotation of that string. 
 * Rotations are formed by moving last character of the string to the start of the string. All rotations of string "abcd" are following:
	0th rotation is abcd
	1st rotation is bcda
	2nd rotation is cdab
	3th rotation is dabc
 */
public class Problem4 {
	public static void main(String[] args) {
		String s = "abcd";
		System.out.println("0th rotation is " + s);
//		for (int i = 1; i < s.length(); i++) {
//			s = s.charAt(s.length() - 1) + s.substring(0,s.length() - 1);
//			if (i == 1)
//				System.out.println(i + "st rotation is " + s);
//			else if (i == 2)
//				System.out.println(i + "nd rotation is " + s);
//			else
//		 		System.out.println(i + "th rotation is " + s);
//		}
		for (int i = 1; i < s.length(); i++) {
			s = s.substring(1,s.length()) + s.charAt(0);
			if (i == 1)
				System.out.println(i + "st rotation is " + s);
			else if (i == 2)
				System.out.println(i + "nd rotation is " + s);
			else
				System.out.println(i + "th rotation is " + s);
		}
	}
}
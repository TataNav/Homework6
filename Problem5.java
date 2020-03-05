/*
 * Input 2 strings. Check if one string is a rotation of another string, meaning that first string can be constructed by rotating the second string.
 * You can solve this problem without rotating any string. 
 */
public class Problem5 {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "loHel";
		
		for (int i = 0; i < str1.length(); i++) {
			str1 = str1.charAt(str1.length() - 1) + str1.substring(0, str1.length() - 1);
			if (str1.equals(str2)) {
				System.out.println("Is a rotation");
			}
		}
	}
}
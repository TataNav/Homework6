/*
 * 
 */

import java.util.Arrays;

public class Problem6 {
	public static void main(String[] args) {
		String s = ")(())";
		
		char[] s1 = s.toCharArray();
		
		char[] arr = new char[s1.length];
		
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (j % 2 == 0 && s1[i] == '(') {
					arr[j] = s1[i];
				} else if (j % 2 > 0 && s1[i] == ')')
					arr[j] = s1[i];
		}
		if (arr.length % 2 == 0) {
			System.out.println("Valid");
		} else
			System.out.println("Invalid");
		}
	}
}

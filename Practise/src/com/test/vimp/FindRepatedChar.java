package com.test.vimp;

public class FindRepatedChar {

	public static void main(String[] args) {

		String st = "ramaraja";
		char s[] = st.toCharArray();
		for (int i = 0; i < st.length(); i++) {

			for (int j = i + 1; j < st.length(); j++) {

				if (s[i] == s[j]) {

					System.out.println("Repeated chars " + s[j]);
					break;
				}
			}
		}

	}
}

package makeMetod;

import java.util.Scanner;

public class Anagrami {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("First string");
		String firstS = scan.nextLine();

		System.out.println("Second string");
		String secondS = scan.nextLine();

		System.out.println(anagrams(firstS, secondS));
		System.out.println(IsINRange.isInRange(12, 56, 44));
		LetterByLetter.firstLetter(firstS, secondS);
		System.out.println(MethodMaker.getNextOddNumber(5));
		System.out.println(StringMatches.stringMatches(firstS, secondS));

		scan.close();
	}

	public static boolean anagrams(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		int counter = 0;
		int counter2 = 0;
		char charac = ' ';
		for (int i = 0; i < s1.length(); i++) {
			charac = s1.charAt(i);
			System.out.println(charac + " sacuvani karakter");
			for (int j = 0; j < s1.length(); j++) {
				if (charac == s1.charAt(j)) {
					counter++;
					System.out.println(s1.charAt(j) + " trenutni karakter prvi string");
				}
			}
			for (int j = 0; j < s2.length(); j++) {
				if (charac == s2.charAt(j)) {
					counter2++;
					System.out.println(s2.charAt(j) + " trenutni karakter drugi string");
				}
			}
			System.out.println();
		}
		System.out.println(counter + " prvi counter");
		System.out.println(counter2 + " drugi counter");
		if (counter == counter2) {
			return true;
		} else {
			return false;
		}

	}
}

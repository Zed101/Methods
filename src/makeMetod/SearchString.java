package makeMetod;

import java.util.Scanner;

public class SearchString {

	public static final String ZELJKA = "zeljka";
	static boolean z = true;
	static boolean e = true;
	static boolean l = true;
	static boolean j = true;
	static boolean k = true;
	static boolean a = true;
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" Mr. Tomic please enter string who contains my name");
		String s1 = scan.nextLine();
		System.out.println(searchForString(s1));

		String name = findZeljkaInString(s1);
		System.out.println(name);

		scan.close();
	}

	public static String searchForString(String s1) {
		char chara = ' ';
		String myName = "";

		boolean z = true;
		boolean e = false;
		boolean l = false;
		boolean j = false;
		boolean k = false;
		boolean a = false;

		for (int i = 0; i < s1.length(); i++) {
			chara = s1.charAt(i);

			if (chara == 'z' && z == true) {
				myName += chara;
				z = false;
				e = true;
			} else if (chara == 'e' && e == true) {
				myName += chara;
				e = false;
				l = true;
			} else if (chara == 'l' && l == true) {
				myName += chara;
				l = false;
				j = true;
			} else if (chara == 'j' && j == true) {
				myName += chara;
				j = false;
				k = true;
			} else if (chara == 'k' && k == true) {
				myName += chara;
				k = false;
				a = true;
			} else if (chara == 'a' && a == true) {
				myName += chara;
				a = false;
			}
		}

		return myName;

	}

	public static String findZeljkaInString(String s) {
		String name = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			name += getStringIfCharacterMatches(c);
		}
		return getFinalString(name);
	}

	public static char getStringIfCharacterMatches(char c) {
		if (c == 'z' && z) {
			z = false;
			return c;
		} else if (c == 'e' && e) {
			e = false;
			return c;
		} else if (c == 'l' && l) {
			l = false;
			return c;
		} else if (c == 'j' && j) {
			j = false;
			return c;
		} else if (c == 'k' && k) {
			k = false;
			return c;
		} else if (c == 'a' && a) {
			a = false;
			return c;
		}
		return ' ';

	}
	
	public static String getFinalString(String name) {
		String checkName = "";
		for (int i = 0; i < name.length(); i++) {
			if(name.charAt(i) != ' ') {
				checkName += name.charAt(i);
			}
		}
		if (checkName.length() == ZELJKA.length()) {
			return "Zeljka";
		}
		return "Name not found";
	}
}

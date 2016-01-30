package makeMetod;

import java.util.Scanner;

public class LetterByLetter {

	public static void main(String[] args) {
		/*
		 * Napisati metodu koja ispisuje (ne vraća) na konzolu prvo slovo prvog,
		 * pa prvo slovo drugog, pa drugo slovo prvog, pa drugo slovo drugog,
		 * itd. Primjer 1: Ukoliko su ta dva String-a „Java“ i „Bit“ onda treba
		 * isprintati „JBaivta“. Primjer 2: Ukoliko su ta dva String-a
		 * „Programming“ i „int“ onda je „Pirnotgramming“.
		 */
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first string");
		String firstString = in.nextLine();

		System.out.println("Enter second string");
		String secondString = in.nextLine();
		firstLetter(firstString, secondString);

		in.close();
	}

	public static void firstLetter(String s1, String s2) {

		if (s2.length() > s1.length()) {
			for (int j = 0; j < s2.length(); j++) {

				if (j < s1.length()) {
					System.out.println(s1.charAt(j));
				}
				System.out.println(s2.charAt(j));
				
			}
		}
		if(s1.length() > s2.length()){
			for (int i = 0; i < s1.length(); i++) {
				System.out.println(s1.charAt(i));
				if(i < s2.length()){
					System.out.println(s2.charAt(i));
				}
				
			}
		}else{
			for (int i = 0; i < s1.length(); i++) {
				System.out.println(s1.charAt(i));
				System.out.println(s2.charAt(i));
			}
		}
	}

}

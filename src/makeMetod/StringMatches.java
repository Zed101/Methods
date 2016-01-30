package makeMetod;

import java.util.Scanner;

public class StringMatches {

	public static void main(String[] args) {
		/*
		 * Napisati metodu koja određuje da li se sva slova iz prvog String-a
		 * pojavljuju u drugom. Primjer 1: Za String-ove „Java“ i „Ajvar“ vraća
		 * true Primjer 2: Za String-ove „Ajvar“ i „Java“ vaća false
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("First string");
		String firstS = scan.nextLine();

		System.out.println("Second string");
		String secondS = scan.nextLine();

		System.out.println(stringMatches(firstS, secondS));

		scan.close();
	}

	public static boolean stringMatches(String s1, String s2) {
		boolean returns = false;

		for (int iteracija = 0; iteracija < s1.length(); iteracija++) {
			System.out.println(s1.charAt(iteracija));

			for (int i = 0; i < s2.length(); i++) {
				System.out.println(s2.charAt(i));

				if (s1.charAt(iteracija) == s2.charAt(i)) {
					returns = true;
					break;
				}else{
					returns = false;
				}

			}

		}
		return returns;

	}

}

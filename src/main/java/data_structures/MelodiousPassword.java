package data_structures;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MelodiousPassword {
	public static void main(String[] args) {
		generate(2);
	}

	public static void generate(int n) {
		List<String> ls = new ArrayList<>();

		char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};
		char[] consonants = new char[]{'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z'};
		boolean isVowelsProcessed = false;
		//start from vowels
		for (int i = 0; i < n; i++) {
			List<String> tmp = new ArrayList<>();

			for (int v = 0; v < vowels.length; v++) {

				if (!ls.isEmpty()) {
					for (int q = 0; q < ls.size(); q++) {
						String phrase = ls.get(q);
						if (!isVowelInTheEnd(phrase)) {
							tmp.add(phrase + String.valueOf(vowels[v]));
						}
					}
				} else {
					tmp.add(String.valueOf(vowels[v]));
				}
			}


			for (int v = 0; v < consonants.length; v++) {
				if (!ls.isEmpty()) {
					for (int q = 0; q < ls.size(); q++) {
						String phrase = ls.get(q);
						if (isVowelInTheEnd(phrase)) {
							tmp.add(phrase + String.valueOf(consonants[v]));
						}
					}
				} else {
					tmp.add(String.valueOf(consonants[v]));
				}
			}

			ls = tmp;

		}

		System.out.println(ls.stream().collect(Collectors.joining("\n")));
	}


	private static boolean isVowelInTheEnd(String word) {
		char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

		char endChar = word.charAt(word.length() - 1);

		for (char v : vowels) {
			if (v == endChar) {
				return true;
			}
		}

		return false;

	}
}

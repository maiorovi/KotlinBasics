package data_structures;

import java.math.BigInteger;
import java.util.ArrayList;

public class SchoolMultiplication {
// 2nd: attempt 651953220155345705436332966844547327291476832454299374976748010 7067743044893204848617875072216249073013374895871952806582723184

//biginteger    8539734222673567065463550869546574495034888535765114961879601127067743044893204848617875072216249073013374895871952806582723184
//              8539734222673567065463550869546574495034888535765114961879601127067743044893204848617875072216249073013374895871952806582723184
//              2020202021120110010100221200101101222120120201222121212112121020000000000000000000000000000000000000000000000000000000000000000


	// 7067743044893204848617875072216249073013374895871952806582723184
	// 1111111111111111111111111111111111111111111111111111111111111111
	// 1111111111111111111111111111111111111111111111111111111111111111



	public static void main(String[] args) {
//		System.out.println(addTwoStrings("1999999999999999999999999999999999", "1"));
		System.out.println(schoolMultiplication("150", "2"));
		System.out.println(schoolMultiplication("1234", "5678"));
		System.out.println(schoolMultiplication("3141592653589793238462643383279502884197169399375105820974944592", "2718281828459045235360287471352662497757247093699959574966967627"));


		BigInteger bi = new BigInteger("3141592653589793238462643383279502884197169399375105820974944592");
		System.out.println(bi.multiply(new BigInteger("2718281828459045235360287471352662497757247093699959574966967627")).toString());
//		System.out.println(addTwoStrings("12", "000"));
		System.out.println(addTwoStrings("", ""));
		System.out.println("Diff diff: " + new BigInteger("8539734222673567065463550869546574495034888535765114961879601127067743044893204848617875072216249073013374895871952806582723184").subtract(new BigInteger("6519532201553457055363329669445473272914768334542993749767480107067743044893204848617875072216249073013374895871952806582723184")));
		System.out.println();
		System.out.println(schoolMultiplication("1111111111111111111111111111111111111111111111111111111111111111", "1111111111111111111111111111111111111111111111111111111111111111"));
		System.out.println(new BigInteger("1111111111111111111111111111111111111111111111111111111111111111").multiply(new BigInteger("1111111111111111111111111111111111111111111111111111111111111111")).toString());

	}

	public static String schoolMultiplication(String x, String y) {
		ArrayList<String> tmp = new ArrayList<>();

		int xLength = x.length() - 1;
		int yLength = y.length() - 1;

		for(int i = 0; i < y.length(); i++) {
			int curY = Integer.valueOf(String.valueOf(y.charAt(yLength - i)));
			int valueToAdd = 0;
			String buffer = "";

			for (int j = 0; j < x.length(); j++) {
				int curX = Integer.valueOf(String.valueOf(x.charAt(xLength - j)));
				int r = curX*curY + valueToAdd;
				valueToAdd = r / 10;
				buffer = (r % 10) + buffer;

			}

			tmp.add(buffer);
		}

		String sum = "0";
		String zeroPads = "";

		for (String partialValue : tmp) {
			sum = addTwoStrings(sum, partialValue + zeroPads);
			zeroPads += "0";
		}

		return sum;
	}

	public static String addTwoStrings(String x, String y) {
		x = trimLeftZeroes(x);
		y = trimLeftZeroes(y);

		int n = Math.min(x.length(), y.length());
		int maxLength = Math.max(x.length(), y.length());
		int yLen = y.length() - 1;
		int xLen = x.length() - 1;
		String result = "";

		int valueToAdd = 0;

		for(int i = 0; i < maxLength; i++) {
			int ytmp = 0;
			int xtmp= 0;
			if ((yLen - i) >= 0) {
				ytmp = Integer.parseInt(String.valueOf(y.charAt(yLen - i)));
			}

			if ((xLen - i) >= 0) {
				xtmp = Integer.parseInt(String.valueOf(x.charAt(xLen - i)));
			}

			int sum = xtmp + ytmp + valueToAdd;

			valueToAdd = sum / 10;

			result = sum % 10 + result;
		}

		if (valueToAdd != 0) {
			result = valueToAdd + result;
		}
		return result;
	}

	public static String trimLeftZeroes(String number) {
		int index = 0;


		for (int i=0; i < number.length();i++) {
			if (number.charAt(i) != '0') {
				index = i;
				break;
			}
			if (i == number.length() - 1) {
				index = i;
			}
		}

		return number.substring(index, number.length());
	}




}

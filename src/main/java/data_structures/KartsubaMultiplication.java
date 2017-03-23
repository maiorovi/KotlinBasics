package data_structures;

public class KartsubaMultiplication {

	private static final int DEFAULT_BASE = 10;

	public String multiply(String x, String y) {
		if (x.length() == 1 || y.length() == 1) {
			return String.valueOf(Integer.parseInt(x) * Integer.parseInt(y));
		}

		if (x.length() > y.length()) {
			y = equality(x, y);
		} else if (x.length() < y.length()) {
			x = equality(y,x);
		}

		double len = Math.max(x.length(), y.length());
		int n = (int) Math.floor(len / 2);

		String xLow1 = x.substring(n, x.length());
		String xHigh1 = x.substring(0, n);

		String yLow2 = y.substring(n, y.length());
		String yHigh2 = y.substring(0, n);

		String z1 = multiply(yHigh2, xHigh1);
		String z2 = multiply(xLow1, yLow2);
		String z3 = multiply(addTwoStrings(xHigh1, xLow1), addTwoStrings(yHigh2,yLow2));

		return String.valueOf(
				Integer.valueOf(z1) * (int) Math.pow(DEFAULT_BASE, 2 * Math.ceil(len / 2)) +
						(Integer.valueOf(z3) - Integer.valueOf(z1) - Integer.valueOf(z2)) * (int) Math.pow(DEFAULT_BASE, Math.ceil(len / 2)) +
						Integer.valueOf(z2)
		);
	}

	public String equality(String longer, String shorter) {
		for (int i = 0; i < longer.length() - shorter.length(); i++) {
			shorter = "0" + shorter;
		}

		return shorter;
	}

	public String addZeroes(String x, int y) {

		while(y > 0) {
			x = x + "0";
			y = y / 10;
		}

		return x;
	}

	public String addTwoStrings(String x, String y) {
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

	public String trimLeftZeroes(String number) {
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

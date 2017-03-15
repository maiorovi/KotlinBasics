package data_structures;

public class KartsubaMultiplication {
	public static void main(String[] args) {
		KartsubaMultiplication karatsubaMultiplication = new KartsubaMultiplication();
		System.out.println(karatsubaMultiplication.karatsuba(123,456));
	}

	public int karatsuba(int x, int y) {
		if (x < 10 || y < 10) {
			return x * y;
		}

		int maxSize = Math.max(len(x), len(y));
		double m2 = (double) maxSize / 2;
		int low1 = split(x, (int)m2, len(x));
		int high1 = split(x, 0, (int)m2);
		int low2 = split(y, (int)m2, len(y));
		int high2 = split(y, 0, (int)m2);

		int z0 = karatsuba(low1, low2);
		int z1 = karatsuba((low1+high1), (low2 + high2));
		int z2 = karatsuba(high1, high2);

		return (z2*(int) Math.pow(10,2*m2)+((z1-z2-z0)*(int)Math.pow(10, m2))+z0);
	}

	private int len(int numb) {
		return String.valueOf(numb).length();
	}

	private int split(int numb, int startFrom, int pos) {
		return Integer.valueOf(String.valueOf(numb).substring(startFrom, pos));
	}
}

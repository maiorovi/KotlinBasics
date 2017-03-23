package data_structures;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountingInversions {

	public static void main(String[] args) throws IOException {
		CountingInversions countingInversions = new CountingInversions();
		File file = new File(countingInversions.getClass().getClassLoader().getResource("inversions.txt").getFile());
		Integer[] numbers = countingInversions.readLinesFrom(file);

//		Integer[] test = countingInversions.generateIntArray(19);
		Integer[] test = new Integer[]{5,4,3,2,1};
//		Arrays.stream(countingInversions.generateIntArray(20)).forEach(System.out::println);
		System.out.println("Inversions:" + countingInversions.countInversions(numbers));

		Arrays.stream(test).forEach(entry -> System.out.print(entry + " "));
	}


	public Integer[] readLinesFrom(File file) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		String line = bufferedReader.readLine();

		while(line != null) {
			Integer value = Integer.parseInt(line);
			numbers.add(value);
			line = bufferedReader.readLine();
		}

		bufferedReader.close();

		return numbers.toArray(new Integer[numbers.size()]);
	}

	public long countInversions(Integer[] arr) {
		return countInversions(arr, 0, arr.length - 1);
	}

	private long countInversions(Integer[] arr, int low, int high) {
		if (high <= low) {
			return 0;
		}

		int mid = low + (high - low) / 2;
		long x = countInversions(arr, low, mid);
		long y = countInversions(arr, mid+1, high);
		long z = countCrossInversions(arr, low, mid, high);

		return x + y + z;
	}


	private long countCrossInversions(Integer[] arr, int low, int mid, int high) {
		long inversions = 0;
		int[] tmp = new int[arr.length];
		int i = low;
		int j = mid+1;

		for(int k = low; k <= high; k++) {
			if (i > mid) tmp[k] = arr[j++];
			else if (j > high) { tmp[k] = arr[i++]; }
			else if (arr[j] >= arr[i]) tmp[k] = arr[i++];
			else  {
				tmp[k] = arr[j++];
				inversions = inversions + ((mid+1) - i);
			}
		}

		for(int k = low; k <= high; k++) {
			arr[k] = tmp[k];
		}

		return inversions;
	}

	public Integer[] generateIntArray(int n) {
		Random rnd = new Random();

		return Stream.generate(() -> rnd.nextInt(150)).limit(n).toArray(Integer[]::new);
	}
}

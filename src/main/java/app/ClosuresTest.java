package app;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ClosuresTest {

	public Function<String, String> functionReturn() {
		return a -> a;
	}


	public static void main(String[] args) {
		Stream.of(1,2,3,4,5).map( x -> x * 2)
				.filter(x -> x % 2 == 0)
				.sorted(Integer::compareTo)
				.limit(2)
				.collect(Collectors.toList());

		Stream.of("hello", "world")
				.map( word -> word.split(""))
				.flatMap(Arrays::stream)
				.distinct()
				.collect(Collectors.toList())
				.forEach(System.out::println);


		Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6);
		System.out.println(integerStream.reduce(0, (acc, x) ->  acc + x));

		Stream.of(1, 2, 3, 4, 5, 6).reduce(Math::max).ifPresent(System.out::println);

		// fib numbers

		Stream.iterate(0, n -> n + 2).limit(10).forEach(System.out::print);

		Stream.iterate(new int[] {0,1}, x -> new int[]{ x[1], x[0] + x[1]}).limit(10).forEach(tuple -> System.out.println("(" + tuple[0] +", " + tuple[1] + ") "));


	}
}

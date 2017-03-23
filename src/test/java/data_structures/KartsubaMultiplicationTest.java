package data_structures;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class KartsubaMultiplicationTest {

	private KartsubaMultiplication mult;

	@Before
	public void setUp() throws Exception {
		mult = new KartsubaMultiplication();
	}

	@Test
	public void multipliesTwoSingleDigitNumbers() throws Exception {
		assertThat(mult.multiply("5","4")).isEqualTo("20");
	}

	@Test
	public void multipliesTwoRandomDigits() throws Exception {
		assertThat(mult.multiply("12", "20")).isEqualTo("240");
	}

	@Test
	public void moreComplexExamples() throws Exception {
		assertThat(mult.multiply("1234", "5678")).isEqualTo("7006652");
	}

	@Test
	public void rndExample() throws Exception {
		assertThat(mult.multiply("256", "98")).isEqualTo("25088");
	}

		@Test
	public void krushTest() throws Exception {
		System.out.println(mult.multiply("3141592653589793238462643383279502884197169399375105820974944592", "2718281828459045235360287471352662497757247093699959574966967627"));
	}
}

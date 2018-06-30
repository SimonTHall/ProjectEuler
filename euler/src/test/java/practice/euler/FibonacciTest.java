package practice.euler;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

import org.junit.Test;

public class FibonacciTest {

	@Test
	public void testGetMaxFibonacci() {
		assertThat(Fibonacci.getMaxFibonacci(100)).isEqualTo(89);
	}

	@Test
	public void testMaxEvenFibonacci() {
		assertThat(Fibonacci.getMaxEvenFibonacci(100)).isEqualTo(34);
	}

	@Test
	public void testSumOfEvenFibonacci() {
		assertThat(Fibonacci.getSumOfEven(100)).isEqualTo(44);
	}

	@Test
	public void testSumOfEvenFibonacciLarge() {
		assertThat(Fibonacci.getSumOfEven(4000000)).isEqualTo(4613732);
	}
	
	@Test
	public void testGetFibonaccisUptoMaxNum() {
		assertThat(Fibonacci.getFibonaccisUptoMaxNum(100)).isEqualTo(
				Arrays.asList(0L, 1L, 1L, 2L, 3L, 5L, 8L, 13L, 21L, 34L, 55L, 89L));
	}
}

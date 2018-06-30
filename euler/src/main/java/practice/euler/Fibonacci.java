package practice.euler;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

	public static long getMaxFibonacci(long upToNumber) {
		return getFibonaccisUptoMaxNum(1, 2, upToNumber).stream().sorted((n1, n2)->-n1.compareTo(n2)).findFirst().get();
	}

	public static long getMaxEvenFibonacci(long upToNumber) {
		return getFibonaccisUptoMaxNum(1, 2, upToNumber).stream().sorted((n1, n2)->-n1.compareTo(n2)).filter(n->n%2==0).findFirst().get();
	}

	public static long getSumOfEven(long upToNumber) {
		return getFibonaccisUptoMaxNum(upToNumber).stream().filter(n->n%2==0).reduce(Long::sum).get();
	}
	
	public static List<Long> getFibonaccisUptoMaxNum(long maxNum){
		List<Long> result = new ArrayList<>();
		result.add(0L);
		result.add(1L);
		result.addAll(getFibonaccisUptoMaxNum(0, 1, maxNum));
		return result;
	}
	
	private static long calculateNextFibonacciUptoMaxNum(long firstNum, long secondNum, long maxNum) {
		long nextFibonacci = firstNum + secondNum;
		if (nextFibonacci > maxNum) {
			return secondNum;
		} else {
			return calculateNextFibonacciUptoMaxNum(secondNum, nextFibonacci, maxNum);
		}
	}
	
	private static List<Long> getFibonaccisUptoMaxNum(long firstNum, long secondNum, long maxNum) {
		List<Long> result = new ArrayList<>();
		long nextFibonacci = firstNum + secondNum;
		if (nextFibonacci > maxNum) {
			return result;
		} else {
			result.add(nextFibonacci);
			result.addAll(getFibonaccisUptoMaxNum(secondNum, nextFibonacci, maxNum));
			return result;
		}
	}
	
	public static List<Long> getFibonacciList(long upToNumber) {
		return getFibonaccisUptoMaxNum(1, 2, 100);
	}	
}

package zadaci;

import java.util.Arrays;


public class Main {

	public static void print(String name, int n) {
		if (n == 0) {
			return;
		}
		
		System.out.println(name);
		
		print(name, n - 1);
	}
	
	public static void printEverySecondNumber(int n) {
		if (n < 1) {
			return;
		}
		
		System.out.println(n);
		
		printEverySecondNumber(n - 2);
	}
	
	public static int getSum(int n) {
		if (n == 1) {
			return 1;
		}
		
		return n + getSum(n - 1);
	}
	
	public static int getFibonacciNumber(int n) {
		if (n == 0) {
			return 0;
		}
		
		if (n == 1) {
			return 1;
		}
		
		return getFibonacciNumber(n - 1) + getFibonacciNumber(n - 2);
	}
	
	public static void fillArray(int[] array, int n) {
		if (n == array.length) {
			return;
		}
		
		array[n] = n + 1;
		
		fillArray(array, n + 1);
	}
	
	public static void fillArray(int[] array) {
		fillArray(array, 0);
	}
	
	public static boolean areTheSame(int[] a1, int[] a2, int n) {
		if (n == a1.length) {
			return true;
		}
		
		return (a1[n] == a2[n]) && areTheSame(a1, a2, n + 1);
	}
	
	
	public static boolean areTheSame(int[] a1, int[] a2) {
		return areTheSame(a1, a2, 0);
	}
	
	public static boolean isInArray(int[] array, int n, int i) {
		if (i == array.length) {
			return false;
		}
		
		return (array[i] == n) || isInArray(array, n, i + 1);
	}
	
	public static boolean isInArray(int[] array, int n) {
		return isInArray(array, n, 0);
	}
	
	public static void fillArray2(int[] array, int i, int value, boolean goLeft) {
		if (i < 0 || i >= array.length) {
			return;
		}
		
		array[i] = value;
		
		if (goLeft) {
			fillArray2(array, i - 1, value - 1, true);
		} else {
			fillArray2(array, i + 1, value - 1, false);			
		}
	}
	
	public static void fillArray2(int[] array, int n) {
		array[n] = n;
		fillArray2(array, n - 1, n - 1, true);
		fillArray2(array, n + 1, n - 1, false);
	}
	
	public static void main(String[] args) {
		int[] arr = new int[10];
		fillArray2(arr, 3);
		System.out.println(Arrays.toString(arr));
	}

}

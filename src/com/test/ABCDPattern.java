package com.test;

public class ABCDPattern {
	public static void main(String arg[]) {
		int i, j, sum = 0;
		for (i = 'A'; i <= 'E'; i++) {
			for (j = i; j <= 'E'; j++)
				System.out.print((char) j + "");
			System.out.println();
		}
	}
}

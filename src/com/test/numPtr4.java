package com.test;

public class numPtr4 {

	public static void main(String arg[]) {

		int i, j, k, m, x;

		for (i = 0; i < 5; i++) {

			x = 1;

			// Left side numbers
			for (j = i; j < 5; j++) {
				System.out.print(x++);
			}

			// Middle spaces
			for (k = 0; k < i; k++) {
				System.out.print(" ");
			}

			// Right side numbers
			x = 5 - i;

			for (m = i; m < 5; m++) {

				if (i == 0 && m == 0) {
					x--;
					continue;
				}

				if (x > 0) {
					System.out.print(x--);
				}
			}

			System.out.println();
		}
	}

}

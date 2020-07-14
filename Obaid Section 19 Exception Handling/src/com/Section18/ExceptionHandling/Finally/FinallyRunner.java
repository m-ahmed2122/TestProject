package com.Section18.ExceptionHandling.Finally;

import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {

		Scanner scanner = null;

		try {

			scanner = new Scanner(System.in);

			int[] numbers = { 12, 3, 4, 5 };

			int number = numbers[5];

			System.out.println("Before Scanner Close");

			scanner.close();

		} catch (Exception e) {

			e.printStackTrace();
		} finally { // finally code executed even if there's exception
			System.out.println("Before Scanner Close");

			if (scanner != null) {
				scanner.close();
			}

			System.out.println("Just Before Closing Out Main");

		}

	}
}











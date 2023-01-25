package com.example.hellworld;

import javax.management.BadBinaryOpValueExpException;
import javax.management.ValueExp;
import java.util.Scanner;

public class Interactive {
	public void inputDemo() {
		Scanner reader = new Scanner(System.in); // std::cin in C++
		System.out.println("pls enter something like integers, float, string");
		int myInt = reader.nextInt();
		System.out.printf("your number is %d.%n%n", myInt);
		double myDouble = reader.nextDouble();
		System.out.printf("your real is %.2f.%n%n", myDouble);
		String myStr = reader.nextLine();
		System.out.println("your string is : " + myStr);
	}
	public void flowDemo() {
		Scanner reader = new Scanner(System.in);
		System.out.println("\nEnter an integer: ");
		int myInt = reader.nextInt();
		switch (myInt % 2) {
			case 1:
				System.out.printf("%d is an odd number", myInt);
				break;
			case 0:
				System.out.printf("%d is an even number%n", myInt);
				break;
			default:
				throw new IllegalStateException("Unexpected value: " + myInt);
		}
	}

	public double div(double a, double b) {
		if (b == 0) {
			throw new IllegalArgumentException();
		}
		return a / b;
	}
}

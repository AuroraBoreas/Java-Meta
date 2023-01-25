package com.example.hellworld;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class Variables {
	public void printTypeMinMaxValue() {
		/*
		type system
		-----------
		* category      : CSIL FD BBD
		* conversion    : cast(dynamic_cast, static_cast, const_cast, reinterpreter_cast)
		* lang feature  : byte vs Byte etc.
		* declare & definition : early-binding, late-binding
		* initialization: `initialization is resource allocation`
		* pattern       : TNV
		* exceptions    : underflow, overflow
		* box           : box, unbox; check; overhead
		* pass by       : reference, pointer, value
		*/
		ArrayList<Object> results = new ArrayList<>();
		results.add(Character.MIN_VALUE);
		results.add(Character.MAX_VALUE);
		results.add(Short.MIN_VALUE);
		results.add(Short.MAX_VALUE);
		results.add(Integer.MIN_VALUE);
		results.add(Integer.MAX_VALUE);
		results.add(Long.MIN_VALUE);
		results.add(Long.MAX_VALUE);
		results.add(Float.MIN_VALUE);
		results.add(Float.MAX_VALUE);
		results.add(Double.MIN_VALUE);
		results.add(Double.MAX_VALUE);
		results.add(Byte.MIN_VALUE);
		results.add(Byte.MAX_VALUE);
		results.add(Boolean.FALSE);
		results.add(Boolean.TRUE);

		System.out.println("=== type system in Java ===");
		for (Object obj: results) {
			System.out.println(obj);
		}
	}

	private <T extends Number> Number add(T a, T b) {
		return a.doubleValue() * b.doubleValue();
	}

	public void printFloatAddition() {
		System.out.println("=== float and double precision in Java ===");
		float a = .1f, b = .2f;
		System.out.println(this.add(a, b));
		System.out.println(add(1, 2));
		System.out.println(add(.1d, .2d));
	}

	public void printStringMethods() {
		/*
		String
		------
		* definition    : an array with elements of `Character`, immutable like int, float, double etc
		* methods       : length(), toUpperCase(), toLowerCase(), subString(), charAt(), equals(), split()
		*/
		System.out.println("=== String in Java ===");
		String s = "hello world!";
		System.out.println(s.length());
		System.out.println(s.toUpperCase(Locale.ROOT));
		System.out.println(s.toLowerCase(Locale.ROOT));
		System.out.println(s.substring(1, 2));
		System.out.println(s.charAt(0));
		System.out.println(s.equals("hello world!"));
		String[] result = s.split(" ");
		for(String str : result) {
			System.out.print(str + " ");
		}
		System.out.println();
	}
	public void printArray() {
		System.out.println("=== Array in Java ===");
		int[] numbers = {1, 2, 3};
		for (int number : numbers) {
			System.out.print(number);
			System.out.print(" ");
		}
		System.out.println();
		int[] arr1 = {0,2,4,6,8,10};
		int[] arr2 = {0,2,4,6,8,10};
		int[] arr3 = {10,8,6,4,2,0};
		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println(Arrays.equals(arr1, arr3));

		String[] src = {"1x", "2x", "3x"};
		String[] dst = Arrays.copyOfRange(src, 1, 2); // std::copy in C++
		System.out.println(Arrays.toString(dst));

		System.out.println(Arrays.toString(arr3));
		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3));

		int[] myInt = {21, 23, 34, 45, 56, 78, 99};
		int key = 78;
		int resIndex = Arrays.binarySearch(myInt, key);
		if (resIndex < 0) {
			System.out.println(String.format("Not found %d", key));
		} else {
			System.out.println(String.format("found %d!", key));
		}
		System.out.println(myInt.length);
	}
}

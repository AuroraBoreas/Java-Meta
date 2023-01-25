package com.example.webscrape;

public class main {
	public static void main(String[] args) {
		// FileIO fileIO = new FileIO();
		// fileIO.readText();
		// fileIO.writeText();
		// fileIO.readText();
		MyGenericClass<Double> a = new MyGenericClass<>(1d, 2d);
		System.out.println(a.toString());
		MyGenericClass<String> b = new MyGenericClass<>("hello", "world");
		System.out.println(b.toString());
		MyGenericDerivedClass c = new MyGenericDerivedClass(1f, 2f);
		System.out.println(c.toString());
		MyBoundedClass<Long, String> d = new MyBoundedClass<>(69l, "hello");
		System.out.println(d.toString());
	}
}

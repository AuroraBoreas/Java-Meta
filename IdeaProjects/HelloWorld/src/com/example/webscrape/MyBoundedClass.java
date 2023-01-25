package com.example.webscrape;

public class MyBoundedClass <T extends Number, U extends String>{
	private T a;
	private U b;

	public T getA() {
		return a;
	}

	public U getB() {
		return b;
	}

	public MyBoundedClass(T a, U b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "MyBoundedClass{" +
				"a=" + a +
				", b='" + b + '\'' +
				'}';
	}
}

package com.example.webscrape;

public class MyGenericClass <T> {
	private T a;
	private T b;

	public MyGenericClass(T a, T b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "MyGenericClass{" +
				"a=" + a +
				", b=" + b +
				'}';
	}
}

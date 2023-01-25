package com.example.letsgo;

public class Derived extends Base {
	public Derived() {
		System.out.println(super.publicNum);
		System.out.println(super.protectNum);
		// System.out.println(super.privateNum);
	}
}

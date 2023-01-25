package com.example.letsgo;
import com.example.hellworld.Staff;

public class main {
	public static void main(String[] args) {
		System.out.println("Let\'s go");
		Derived derived = new Derived();
		Staff yui = new Staff("yui", 12);
		yui.handle(new int[3]);
	}
}


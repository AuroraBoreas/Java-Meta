package com.example.hellworld;

public class Staff {
	private String name = "anonymous";
	private int age = 1;

	public Staff(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public Staff(String name) {
		this.name = name;
	}

	public Staff(int age) {
		this.age = age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Staff{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	public static final String greetings = "world!";
	public static final void print_hello() {
		System.out.println("hello " + greetings);
	}

	public void handle(int[] a) {
		try {
			System.out.printf("print the first element of the array is : %d%n", a[0]);
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
	public int[] returnArray() {
		int[] a = new int[3];
		for (int i = 0; i < a.length; i++) {
			a[i] = i * 2;
		}
		return a;
	}
}

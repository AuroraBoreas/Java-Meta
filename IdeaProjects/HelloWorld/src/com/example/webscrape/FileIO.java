package com.example.webscrape;

import java.io.*;
import java.util.stream.Stream;

public class FileIO {
	public void readText() {
		String path = "src/com/example/webscrape/file01.txt";
		String line;
		Stream<String> lines;
		try(BufferedReader reader = new BufferedReader(new FileReader(path))){
			lines = reader.lines();
			if(lines != null) {
				lines.forEach(System.out::println);
			}
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	public void writeText() {
		String path = "src/com/example/webscrape/file01.txt";
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))) {
			writer.write("hello CY");
			writer.write("\n");
			writer.write("CSN CY");
			writer.write("\n");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

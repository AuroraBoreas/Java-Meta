package com.example.overview;

import java.io.*;
import java.util.LinkedList;

public class FileHandler {
	private String path = "src/com/example/overview/db.csv";

	public LinkedList<Member> readFile() {
		LinkedList<Member> m = new LinkedList<>();
		String line;
		String[] splitRes;

		try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
			line = reader.readLine();
			while (line != null) {
				splitRes = line.split(",");
				if(splitRes[0].equalsIgnoreCase("s")) {
					m.add(new SingleClubMember('S',
									Integer.parseInt(splitRes[1]),
									splitRes[2],
									Double.parseDouble(splitRes[3]),
									Integer.parseInt(splitRes[4])
							)
					);
				} else if(splitRes[0].equalsIgnoreCase("M")) {
					m.add(new MultiClubMember('M',
									Integer.parseInt(splitRes[1]),
									splitRes[2],
									Double.parseDouble(splitRes[3]),
									Integer.parseInt(splitRes[4])
							)
					);
				}
				line = reader.readLine();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return m;
	}

	public void appendFile(String m) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(path,true))) {
			writer.write(m);
			writer.write("\n");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public void overWriteFile(LinkedList<Member> members) {
		String tempDB = "src/com/example/overview/members.temp";
		if (members == null) {
			throw new IllegalArgumentException();
		}
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempDB, false))) {
			for (Member member : members) {
				writer.write(member.toString());
				writer.write("\n");
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		try {
			File f = new File(path);
			File tf = new File(tempDB);
			f.delete();
			tf.renameTo(f);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

package com.example.overview;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class MembershipManagement {
	private final Scanner reader = new Scanner(System.in);

	private int getIntInput() {
		System.out.println("Enter an integer: ");
		int choice = 0;
		while (choice == 0) {
			try {
				choice = reader.nextInt();
				if(choice == 0)
					throw new InputMismatchException();
				reader.nextLine();
			} catch (InputMismatchException e) {
				reader.nextLine();
				System.out.println("Error: Invalid Input. Pls try again: ");
			}
		}
		return choice;
	}

	private void printClubOptions() {
		System.out.println("Pls choose club Id:");
		String[] clubs = new String[] {
			"1) Club Mercury",
			"2) Club Neptune",
			"3) Club Jupiter",
			"4) Multi Clubs",
		};
		for (String club : clubs) {
			System.out.println(club);
		}
	}

	public int getChoice() {
		String s = "WELCOME TO OZONE FITNESS CENTER\n" +
				"================================\n" +
				"1) Add Member\n" +
				"2) Remove Member\n" +
				"3) Display Member Information\n\n" +
				"Please select an option (or Enter -1 to quit):";
		System.out.println(s);
		return getIntInput();
	}

	public String addMembers(LinkedList<Member> members) {
		String name;
		int club;
		String mem;
		double fees = 0d;
		int memberID;
		Member mbr;
		Calculator<Integer> cal;

		System.out.println("Pls enter the member\'s name: ");
		name = reader.nextLine();

		printClubOptions();
		club = getIntInput();
		while (club < 1 || club > 4){
			System.out.println("Error: Invalid Choice. Pls try again:");
			club = getIntInput();
		}

		if (members.size() > 0)
			memberID = members.getLast().getMemberId() + 1;
		else
			memberID = 1;

		cal = (n) -> {
			switch (n) {
				case 1:
					return 900;
				case 2:
					return 950;
				case 3:
					return 1_000;
				default:
					return -1;
			}
		};

		if (club != 4) {
			fees = cal.calculateFees(club);
			mbr = new SingleClubMember('S', memberID, name, fees, club);
		} else {
			cal = (n) -> { return 1200; };
			fees = cal.calculateFees(club);
			mbr = new MultiClubMember('M', memberID, name, fees, 100);
		}
		members.add(mbr);
		mem = mbr.toString();

		return mem;
	}

	public void removeMember(LinkedList<Member> members) {
		int memberId;
		System.out.println("Pls enter memberID to remove: ");
		memberId = getIntInput();
		for (int i = 0; i < members.size(); i++) {
			if (members.get(i).getMemberId() == memberId) {
				members.remove(i);
				System.out.println("Remove the member successfully.");
				return;
			}
		}
	}

	public void printMemberInfo(LinkedList<Member> members) {
		int memberId;
		String[] memberInfo;
		String ss = "Member Type = %s%nMember ID = %s%nMember Name = %s%nMembership Fees = %s%nClub ID = %s%n%n";
		String ms = "Member Type = %s%nMember ID = %s%nMember Name = %s%nMembership Fees = %s%nMembership Points = %s%n%n";
		String tpl;

		System.out.println("Pls enter memberID to display info: ");
		memberId = getIntInput();

		for (Member member : members)
			if (member.getMemberId() == memberId) {
				memberInfo = member.toString().split(",");
				tpl = memberInfo[0].equalsIgnoreCase("S") ? ss : ms;
				System.out.printf(tpl, memberInfo[0], memberInfo[1], memberInfo[2], memberInfo[3], memberInfo[4]);
				return;
			}
	}
}

package com.example.overview;

public class SingleClubMember extends Member {
	private int club;
	public SingleClubMember(char memberType,
	                        int memberId,
	                        String name,
	                        double fees,
	                        int pClub) {
		super(memberType, memberId, name, fees);
		club = pClub;
	}

	public int getClub() {
		return club;
	}

	public void setClub(int club) {
		this.club = club;
	}

	@Override
	public String toString() {
		return super.toString() + ',' + club;
	}
}

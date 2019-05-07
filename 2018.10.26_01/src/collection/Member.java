package collection;

public class Member implements Comparable<Member> {
	private int memberID;
	private String memberName;
	
	public Member(int memberID, String memberName) {
		this.memberID = memberID;
		this.memberName = memberName;
	}

	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는 " + memberID + "입니다.";
	}

	@Override
	public boolean equals(Object arg0) {
		if(arg0 instanceof Member) {
			Member member = (Member) arg0;
			if(this.memberID == member.memberID) {
				return true;
			}
			else return false;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return memberID;
	}

/*	@Override
	public int compareTo(Member member) {
		return (this.memberID - member.memberID)*(-1);
	}
*/	
	@Override
	public int compareTo(Member member) {
		return this.memberName.compareTo(member.memberName);
	}
}

package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {
	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member mLee = new Member(1001, "LeeJW");
		Member mSon = new Member(1002, "SonMG");
		Member mPark = new Member(1003, "ParkSH");
		Member mHong = new Member(1004, "HongGD");
		
		memberArrayList.addMember(mLee);
		memberArrayList.addMember(mSon);
		memberArrayList.addMember(mPark);
		memberArrayList.addMember(mHong);
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(mPark.getMemberID());
		memberArrayList.showAllMember();
		
		memberArrayList.insertMember(mPark, 2);
		memberArrayList.showAllMember();
/*		
		memberArrayList.insertMember(new Member(1007, "P"), 2);
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(1007);
		memberArrayList.showAllMember();
*/
	}

}

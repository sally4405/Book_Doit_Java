package collection.TreeSet;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member mLee = new Member(1001, "ÀÌÁö¿ø");
		Member mSon = new Member(1002, "¼Õ¹Î±¹");
		Member mPark = new Member(1003, "¹Ú¼­ÈÍ");
		
		memberTreeSet.addMember(mLee);
		memberTreeSet.addMember(mSon);
		memberTreeSet.addMember(mPark);
		memberTreeSet.showAllMember();
		
		Member mHong = new Member(1003, "È«±æµ¿");
		memberTreeSet.addMember(mHong);
		memberTreeSet.showAllMember();
		

	}

}

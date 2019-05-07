package collection.hashset;

import collection.Member;

public class MemberHashSetTest {
	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member mLee = new Member(1001, "ÀÌÁö¿ø");
		Member mSon = new Member(1002, "¼Õ¹Î±¹");
		Member mPark = new Member(1003, "¹Ú¼­ÈÍ");
		
		memberHashSet.addMember(mLee);
		memberHashSet.addMember(mSon);
		memberHashSet.addMember(mPark);
		memberHashSet.showAllMember();
		
		Member mHong = new Member(1003, "È«±æµ¿");
		memberHashSet.addMember(mHong);
		memberHashSet.showAllMember();
		

	}

}

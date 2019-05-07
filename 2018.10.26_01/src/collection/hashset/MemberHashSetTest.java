package collection.hashset;

import collection.Member;

public class MemberHashSetTest {
	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member mLee = new Member(1001, "������");
		Member mSon = new Member(1002, "�չα�");
		Member mPark = new Member(1003, "�ڼ���");
		
		memberHashSet.addMember(mLee);
		memberHashSet.addMember(mSon);
		memberHashSet.addMember(mPark);
		memberHashSet.showAllMember();
		
		Member mHong = new Member(1003, "ȫ�浿");
		memberHashSet.addMember(mHong);
		memberHashSet.showAllMember();
		

	}

}

package collection.TreeSet;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member mLee = new Member(1001, "������");
		Member mSon = new Member(1002, "�չα�");
		Member mPark = new Member(1003, "�ڼ���");
		
		memberTreeSet.addMember(mLee);
		memberTreeSet.addMember(mSon);
		memberTreeSet.addMember(mPark);
		memberTreeSet.showAllMember();
		
		Member mHong = new Member(1003, "ȫ�浿");
		memberTreeSet.addMember(mHong);
		memberTreeSet.showAllMember();
		

	}

}

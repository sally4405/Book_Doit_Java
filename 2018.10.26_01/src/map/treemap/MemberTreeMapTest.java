package map.treemap;

import collection.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		Member mLee = new Member(1003, "������");
		Member mSon = new Member(1001, "�չα�");
		Member mPark = new Member(1004, "�ڼ���");
		Member mHong = new Member(1002, "ȫ�浿");
		
		memberTreeMap.addMember(mLee);
		memberTreeMap.addMember(mSon);
		memberTreeMap.addMember(mPark);
		memberTreeMap.addMember(mHong);
		
		memberTreeMap.showAllMember();
		
		memberTreeMap.removeMember(1004);
		memberTreeMap.showAllMember();

	}

}

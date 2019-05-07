package map.treemap;

import collection.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		Member mLee = new Member(1003, "ÀÌÁö¿ø");
		Member mSon = new Member(1001, "¼Õ¹Î±¹");
		Member mPark = new Member(1004, "¹Ú¼­ÈÍ");
		Member mHong = new Member(1002, "È«±æµ¿");
		
		memberTreeMap.addMember(mLee);
		memberTreeMap.addMember(mSon);
		memberTreeMap.addMember(mPark);
		memberTreeMap.addMember(mHong);
		
		memberTreeMap.showAllMember();
		
		memberTreeMap.removeMember(1004);
		memberTreeMap.showAllMember();

	}

}

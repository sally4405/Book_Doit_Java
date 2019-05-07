package map.hashmap;

import collection.Member;

public class MemberHashMapTest {
	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member mLee = new Member(1001, "ÀÌÁö¿ø");
		Member mSon = new Member(1002, "¼Õ¹Î±¹");
		Member mPark = new Member(1004, "¹Ú¼­ÈÍ");
		Member mHong = new Member(1003, "È«±æµ¿");
		
		memberHashMap.addMember(mLee);
		memberHashMap.addMember(mSon);
		memberHashMap.addMember(mPark);
		memberHashMap.addMember(mHong);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
		

	}

}

package thisex;

  class BirthDay {
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year; 	//	bDay.year = year; 와 같다는데 뭔 소린지 모르겠음
	}
	
	public void printThis() {
		System.out.println(this);
	}
}
	
	public class ThisExample {
		public static void main(String[] args) {
			BirthDay bDay = new BirthDay();
			bDay.setYear(2000);
			System.out.println(bDay);
			bDay.printThis();
		}
	}



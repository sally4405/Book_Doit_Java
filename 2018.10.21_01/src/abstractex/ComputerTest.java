package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
//		Computer c1 = new Computer();	//추상 클래스를 인스턴스로 생성할 수 없다.
		Computer c2 = new DeskTop();
//		Computer c3 = new NoteBook();
		Computer c4 = new MyNoteBook();
		
		c2.display();
		c4.typing();
		c4.display();
		
	}

}

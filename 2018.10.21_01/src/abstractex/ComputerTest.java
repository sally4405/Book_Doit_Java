package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
//		Computer c1 = new Computer();	//�߻� Ŭ������ �ν��Ͻ��� ������ �� ����.
		Computer c2 = new DeskTop();
//		Computer c3 = new NoteBook();
		Computer c4 = new MyNoteBook();
		
		c2.display();
		c4.typing();
		c4.display();
		
	}

}

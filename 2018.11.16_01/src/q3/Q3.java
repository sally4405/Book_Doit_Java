package q3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Q3 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("a.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		try(fos; osw) {
			osw.write("지금까지 자바 정말 재미있게 공부했어요^^");
		}
		System.out.println("end");
	}

}

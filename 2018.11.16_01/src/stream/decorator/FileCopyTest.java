package stream.decorator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {
	public static void main(String[] args) throws FileNotFoundException {
		long msec = 0;
		FileInputStream fis = new FileInputStream("a.zip");
		FileOutputStream fos = new FileOutputStream("copy.zip");
		try(fis;fos;){
			msec = System.currentTimeMillis();
			int i;
			while((i = fis.read()) != -1) {
				fos.write(i);
			}
			msec = System.currentTimeMillis() - msec;
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일 복사하는 데 " + msec + " milliseconds 소요되었습니다.");
		//49294 msec 걸림
	}

}

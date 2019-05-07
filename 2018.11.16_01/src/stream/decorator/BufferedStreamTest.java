package stream.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {
	public static void main(String[] args) throws FileNotFoundException {
		long msec = 0;
		FileInputStream fis = new FileInputStream("a.zip");
		FileOutputStream fos = new FileOutputStream("copy.zip");
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		try(bis; bos;) {
			msec = System.currentTimeMillis();
			int i;
			while((i = bis.read()) != -1) {
				bos.write(i);
			}
			msec = System.currentTimeMillis() - msec;
		} catch (IOException e) {
			e.printStackTrace();
		} 
		System.out.println("파일 복사하는 데 " + msec + " milliseconds 소용되었습니다.");
	}	//79 msec 걸림

}

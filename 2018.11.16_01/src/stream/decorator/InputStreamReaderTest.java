package stream.decorator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("reader.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		try(isr){
			int i;
			while ((i = isr.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

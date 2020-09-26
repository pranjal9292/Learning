package files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		File file = new File("test.text");
		FileWriter fileWriter = new FileWriter(file);
		fileWriter.write("Hi this is my test file");
		fileWriter.close();

		FileReader fileReader = new FileReader(file);

		int c;
		while ((c = fileReader.read()) != -1) {
			System.out.println(c);
		}
		fileReader.close();
	}

}

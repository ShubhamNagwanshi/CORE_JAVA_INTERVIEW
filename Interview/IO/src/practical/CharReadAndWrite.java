package practical;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharReadAndWrite {
	public static void main(String[] args) throws IOException {
		
		String source = "C:\\Users\\Lenovo\\OneDrive\\Desktop\\IO\\scanner.txt";
		String target = "C:\\Users\\Lenovo\\OneDrive\\Desktop\\IO\\sc.txt";
		
		FileReader fr = new FileReader(source);
		FileWriter fw = new FileWriter(target);
		
		int ch;
		
		while((ch = fr.read())!= -1) {
			fw.write(ch);
			
			System.out.print((char)ch);
		}
		fr.close();
		fw.close();
		
 	}

}

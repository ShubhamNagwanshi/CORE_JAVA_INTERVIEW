package practical;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWriteBinaryFile {

	public static void main(String[] args) throws IOException {
		
		String source = "C://Users//Lenovo//OneDrive//Desktop//IO//demon.webp";
		
		String target = "C://Users//Lenovo//OneDrive//Desktop//IO//slayer.jpg";
		
		FileInputStream in = new FileInputStream(source);
		FileOutputStream out = new FileOutputStream(target);
		
		int i;
		
		while((i = in.read())!= -1) {
			out.write(i);
		}
		System.out.println("success");
	}
}

package practical;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class ReadAndWriteFromKeyBoard {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		FileWriter fw = new FileWriter("C://Users//Lenovo//OneDrive//Desktop//IO//Shubh",true);
		
		System.out.println("enter here");
		
		String str = br.readLine();
		
		while(str != null) {
			fw.write(str);
			
			System.out.println(str);
			str = br.readLine();
		}
		br.close();
		
	}
}
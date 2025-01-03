package practical;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MergeFile {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("C:\\Users\\Lenovo\\OneDrive\\Desktop\\IO\\naman.txt");

		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\OneDrive\\Desktop\\IO\\pranav.txt"));

		String s1 = br.readLine(); // Read the first line
		
		while (s1 != null) { // Loop until the end of the file
			
			fw.write(s1 + "\n"); // Write the line to naman.txt
			
			s1 = br.readLine(); // Read the next line
		}
		br.close(); // Close the reader for pranav.txt

		br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\OneDrive\\Desktop\\IO\\nikki.txt"));

		String s2 = br.readLine();  // Read the first line
		
		while (s2 != null) {        // Loop until the end of the file
			
		    fw.write(s2);           // Write the line to naman.txt
		    
		    s2 = br.readLine();     // Read the next line
		}
		br.close();  // Close the reader for nikki.txt
		fw.close();

		System.out.println("success ....");
	}
}

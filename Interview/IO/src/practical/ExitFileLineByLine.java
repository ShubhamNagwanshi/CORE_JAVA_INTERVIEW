package practical;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExitFileLineByLine {

	public static void main(String[] args) throws IOException {

		FileWriter file = new FileWriter("C:\\Users\\Lenovo\\OneDrive\\Desktop\\IO\\SN.txt");

		PrintWriter out = new PrintWriter(file);

		out.println("Shubham");

		out.println("Nagwanshi");

		out.close();

		file.close();

		System.out.println("data write successfully...!!!");
	}
}

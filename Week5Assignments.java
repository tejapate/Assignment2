import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Week5Assignments  {
	
	public static int lineCount = 0;
	public static int wordCount = 0;
	public static int charCount = 0;

	public static void main(String[] args) {
		
		try {
			File text = new File("lear.txt");
			Scanner scan = new Scanner(text);
			
			while (scan.hasNextLine()) {
				String line = scan.nextLine(); 
				lineCount++;
				charCount += line.length();
				for (int i = 0; i < line.length(); i++) {
					if(line.charAt(i) == ' ') {
						wordCount++;
						charCount--;
					}
				}
			}
			
		
			catch (FileNotFoundException ex) {
				System.out.println("File not found.");
				
			
		System.out.println("File : lear.txt");
		System.out.println("Words: " + wordCount);
		System.out.println("Lines: " + lineCount);
		System.out.println("Chars" + charCount);
		
}

		}

	

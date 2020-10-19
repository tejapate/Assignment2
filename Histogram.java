import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Histogram {

	public static void main(String[] args) {
		
		//Writes 100 random numbers between 0-100 into a file called "scores.txt"
				try {
					FileWriter writer = new FileWriter("scores.txt");
					for(int i = 0; i < 100; i++) {
						int r = (int)(Math.random() * 100 + 1);
						writer.write(r + "\n");
					}
					writer.close();
				}catch(IOException e) {
						System.out.println("ERROR!!");
					}
				//Reads scores.txt and adds a '*' to the proper array index 
				try {
					File scores = new File("scores.txt");
					Scanner input = new Scanner(scores);
					String[] grades = new String[11];
					grades[0] = "00-09: ";
					grades[1] = "10-19: ";
					grades[2] = "20-29: ";
					grades[3] = "30-39: ";
					grades[4] = "40-49: ";
					grades[5] = "50-59: ";
					grades[6] = "60-69: ";
					grades[7] = "70-79: ";
					grades[8] = "80-89: ";
					grades[9] = "90-99: ";
					grades[10] = "100: ";
					while(input.hasNextLine()) {
						String num = input.nextLine();
						int temp = Integer.valueOf(num);
						if(temp > 0 && temp < 10) {
							grades[0] += "*";
						}else if(temp >= 10 && temp < 20) {
							grades[1] += "*";
						}else if(temp >= 20 && temp < 30) {
							grades[2] += "*";
						}else if(temp >= 30 && temp < 40) {
							grades[3] += "*";
						}else if(temp >= 40 && temp < 50) {
							grades[4] += "*";
						}else if(temp >= 50 && temp < 60) {
							grades[5] += "*";
						}else if(temp >= 60 && temp < 70) {
							grades[6] += "*";
						}else if(temp >= 70 && temp < 80) {
							grades[7] += "*";
						}else if(temp >= 80 && temp < 90) {
							grades[8] += "*";
						}else if(temp >= 90 && temp < 100) {
							grades[9] += "*";
						}else if(temp == 100) {
							grades[10] += "*";
						}
					}
					input.close();
					for(int i = 0; i < 11; i++) {
						System.out.println(grades[i]);
					}
				}catch(FileNotFoundException e) {
					System.out.println("ERROR!!");
				}
		

	}

}

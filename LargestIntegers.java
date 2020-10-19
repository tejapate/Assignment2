import java.util.ArrayList;
import java.util.Scanner;

public class LargestIntegers {
	public static void main(String[] args) {
		sort();
		
	}

	public static void sort() {
		int largest = 0, secondLargest = 0, i;
		ArrayList<Integer> ints = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		System.out.println("This program finds the largest and second largest integers entered into it. \n Enter as many integers as you want and enter 0 to end: ");
		do {
			i = input.nextInt();
			ints.add(i);
		}while(i != 0);
		for(int j = 0; j < ints.size(); j++) {
			if (ints.get(j) > largest) { 
				largest = ints.get(j);
			}
		}
		for(int j = 0; j < ints.size(); j++) {
			if(j == ints.indexOf(largest)) {
				continue;
			}else if(ints.get(j) > secondLargest) {
				secondLargest = ints.get(j);
			}
		}
		input.close();
		System.out.println("Largest number is: " + largest);
		System.out.println("Second Largest number is: " + secondLargest); 
	}
}

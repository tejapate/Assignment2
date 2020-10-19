import java.util.Scanner;

import java.util.*;

public class UniqueNames {

	public static void main(String[] args) {
		

		ArrayList<String> names = new ArrayList<String>();
		String temp = " ";
		Scanner input = new Scanner(System.in);
		while(!temp.equals("")) {
			System.out.println("Enter a name: ");
			temp = input.nextLine();
			if(names.contains(temp)) {
				continue;
			}else {
				names.add(temp);
			}
		}
		input.close();
		
		System.out.println("Unique name list contains: ");
		for(int i = 0; i < names.size(); i++) {
			temp = names.get(i);
			
			System.out.println(temp);
		}
		

	}

}

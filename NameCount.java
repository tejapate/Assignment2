import java.util.HashMap;
import java.util.Scanner;

public class NameCount {

	public static void main(String[] args) {
		
			HashMap<Integer, String> names = new HashMap<Integer, String>();
			Integer key = 0;
			
			Scanner input=new Scanner(System.in);
			String temp;
			System.out.println("Enter a list of names. Enter nothing to end: ");
			do {
			temp = input.nextLine();
			if(!temp.equals("")) {
				names.put(key, temp);
			}
			key++;
			}while(!temp.equals(""));} 
			
			
			nameCount(names);		
		
	
		public void nameCount(HashMap<Integer, String> names) {
			String name = "";
			int count = 0;
				for(int i = 0; !names.isEmpty(); i++) {
					if(names.containsKey(i)) {
						count = 0;
						name = names.get(i);
						for(int j = 0; names.containsValue(name); j++) {	
							if(names.remove(j, name)) {
								count++;
							}
						}
						System.out.println("Entry [" + name + "] has count: " + count);
					}else {
						continue;
					}
		
	}

}
}
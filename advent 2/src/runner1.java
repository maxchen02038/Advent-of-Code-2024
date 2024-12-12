import java.io.File;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class runner {
	public static boolean increasing(String[] list) {
		for(int i = 1; i < list.length; i++) {
			//check if it dosent meet requirement, exit right away
			int el1 = Integer.valueOf(list[i]);
			int el0 = Integer.valueOf(list[i-1]); 
			
			if (el1 <= el0) { //handles a 0 change
				return false;
			}
			
			else if (el1-el0 > 3) { //if the difference is > 3!				
				return false;
			}
		}
		
		//didnt find any bad pairs in the loop!
		return true;
		

	}
	public static boolean decreasing(String[] list) {
		for(int i = 1; i < list.length; i++) {
			//check if it dosent meet requirement, exit right away
			int el1 = Integer.valueOf(list[i]);
			int el0 = Integer.valueOf(list[i-1]);
			
			if (el1 >= el0) { //handles a 0 change
				return false;
			}
	
			else if (el0-el1 > 3) { //if the difference is > 3!				
				return false;
			}
			
		}
		
		//didnt find any bad pairs in the loop!
		return true;
		

	}
	public static void main(String[] args) {
		File file = new File("input4");
		try {
			Scanner scanner = new Scanner(file);
			int count = 0;
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				
				String[] elements = line.split(" ");
				
				if (increasing(elements) || decreasing(elements)) {
					count++;
				}else {
					System.out.println(Arrays.toString(elements));
				}

				
				
			}
			System.out.println("TOTAL SAFE " + count);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}   
    
}








package adventthingy;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class runner {
	
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> left = new ArrayList<Integer>();
		ArrayList<Integer> right = new ArrayList<Integer>();

		
		File file = new File("input.txt");
		try {
			Scanner scanner = new Scanner(file);
			
			while(scanner.hasNext()) {
				
				
				int first = scanner.nextInt();
				int second = scanner.nextInt();
				
				
				left.add(first);
				right.add(second);
				
			}
			
			while(left.size()>0) {
			
				int smallest = left.get(0);
				int smallestIndex = 0;
			
				for(int i = 0;i<left.size();i++) {
				
					if(left.get(i)<smallest) {
					smallest = left.get(i);
					smallestIndex = i;
					}
				
				}
			
			left.remove(smallestIndex);
			}
			
			while(right.size()>0) {
				
				int smallest = right.get(0);
				int smallestIndex = 0;
			
				for(int i = 0;i<right.size();i++) {
				
					if(right.get(i)<smallest) {
					smallest = right.get(i);
					smallestIndex = i;
					}
				
				}
			
			right.remove(smallestIndex);
			}

						
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
	}

}



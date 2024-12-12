package advent3;
import java.io.File;
import java.util.regex.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public class frame {

	   public static void main(String[] args) {
	       // The file where your input data is stored
	       File file = new File("input69.txt");
	       try {
	           Scanner scan = new Scanner(file);
	           long totalSum = 0;  // Use long to handle large numbers
	           boolean mulEnabled = true;  // Flag to track if mul instructions are enabled
	           // Loop through each line in the file
	           while (scan.hasNextLine()) {
	               String line = scan.nextLine();  // Read the entire line
	               String regex = "(mul\\((\\d+),(\\d+)\\))|\\b(do\\(\\))|\\b(don't\\(\\))";  // Regex for mul, do, and don't
	               // Create a matcher to find mul(X,Y), do(), and don't() patterns
	               Pattern pattern = Pattern.compile(regex);
	               Matcher matcher = pattern.matcher(line);
	               // Loop through all matches in the line
	               while (matcher.find()) {
	                   // Check if the match is a 'mul(X,Y)' instruction
	                   if (matcher.group(1) != null) {
	                       // Only process mul if mul is enabled
	                       if (mulEnabled) {
	                           int X = Integer.parseInt(matcher.group(2));
	                           int Y = Integer.parseInt(matcher.group(3));
	                           // Calculate the product and add it to the total sum
	                           totalSum += (long) X * Y;  // Use long to handle potential overflow
	                           // Optional: print each multiplication and sum
	                           System.out.println("Found: " + matcher.group(1) + " = " + (X * Y));
	                       }
	                   }
	                   // Check if the match is 'do()' instruction
	                   else if (matcher.group(4) != null) {
	                       mulEnabled = true;  // Enable mul instructions
	                       System.out.println("do() instruction encountered. mul instructions enabled.");
	                   }
	                   // Check if the match is 'don't()' instruction
	                   else if (matcher.group(5) != null) {
	                       mulEnabled = false;  // Disable mul instructions
	                       System.out.println("don't() instruction encountered. mul instructions disabled.");
	                   }
	               }
	           }
	           // After processing all lines, print the total sum
	           System.out.println("Total sum of all enabled multiplications: " + totalSum);
	           // Close the scanner
	           scan.close();
	       } catch (FileNotFoundException e) {
	           e.printStackTrace();
	       }
	   }


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*
public static void main(String[] args) {
       // The file where your input data is stored
       File file = new File("input69.txt");
       try {
           Scanner scan = new Scanner(file);
           long totalSum = 0;  // Use long to handle large numbers
           // Loop through each line in the file
           while (scan.hasNextLine()) {
               String line = scan.nextLine();  // Read the entire line
               String regex = "mul\\((\\d+),(\\d+)\\)";  // Regular expression to find mul(X,Y)
               // Create a matcher to find mul(X,Y) patterns
               Pattern pattern = Pattern.compile(regex);
               Matcher matcher = pattern.matcher(line);
               // Loop through all matches of mul(X,Y) in the line
               while (matcher.find()) {
                   // Extract the values of X and Y from the match
                   int X = Integer.parseInt(matcher.group(1));
                   int Y = Integer.parseInt(matcher.group(2));
                   // Calculate the product and add it to the total sum
                   totalSum += (long) X * Y;  // Use long to handle potential overflow
                   // Optional: print each multiplication and sum
                   System.out.println("Found: mul(" + X + "," + Y + ") = " + (X * Y));
               }
           }
           // After processing all lines, print the total sum
           System.out.println("Total sum of all multiplications: " + totalSum);
           // Close the scanner
           scan.close();
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       }
   }
*/
}





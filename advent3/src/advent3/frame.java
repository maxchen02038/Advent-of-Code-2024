package advent3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class frame {

	public String extractMult(String line) {
		
		
		
		if(line.indexOf("mul(") == -1) {
			return "";
		} else {
			
	
		int start = line.indexOf("mul(");
		int end = 0;
		
		return line.substring(start, end);
		}

	}
}




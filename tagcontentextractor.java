import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases >0){
			String line = in.nextLine();
            boolean matchfound=false;
            Pattern r=Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher m=r.matcher(line);
            while(m.find()){
                System.out.println(m.group(2));
                matchfound=true;

            }
			if(! matchfound){
                System.out.println("None");
            }
            testCases--;
          	//Write your code here
			
		
		}
	}
}



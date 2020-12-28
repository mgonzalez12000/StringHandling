package stringHandlingExcercise;

import java.util.Scanner;

public class StringHanlding {
	public static void main(String args[]) {
		//Ask user to enter a String
		System.out.println("Please enter a phrase to verify that all 26 letters of the alphabet exist.");
		//Create Scanner object
		Scanner sc = new Scanner(System.in);
		//Create string for scanner
		String input = sc.nextLine();
		
		//Print out what user entered
		System.out.println("You entered: " + input);
		
		int[]check = new int[26];
		String toLowerCase = input.toLowerCase();
		for(int i = 0; i < toLowerCase.length(); i++) {
	      if(toLowerCase.charAt(i) != 36 && toLowerCase.charAt(i) >= 97 && toLowerCase.charAt(i) <= 122) {
	        check[toLowerCase.charAt(i) - 97] = 1; 
	      }
	    }
		
	    for(int i = 0; i < 26; i++)
	    {
	      if(check[i] != 1)
	      {
	        System.out.println("RESULT: The phrase that you entered DOES NOT contain all the letters in the alphabet.");
	        //Close program
	        System.exit(0);
	      }
	    }
	    System.out.println("RESULT: The phrase that you entered DOES contain all the letters in the alphabet.");
	  }
}

package JavaTest;

import java.util.Scanner;

//Check if the input is pangram or not. (Pangram is a sentence that contains all the alphabet
//from a-z)
public class isPangram {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a string: ");
	        String input = sc.nextLine();

	        boolean isPangram = true;
	        for (char c = 'a'; c <= 'z'; c++) {
	            if (!input.contains(Character.toString(c))) {
	                isPangram = false;
	                break;
	            }
	        }

	        if (isPangram) {
	            System.out.println("The string is a pangram.");
	        } else {
	            System.out.println("The string is not a pangram.");
	        }
	}
	
}

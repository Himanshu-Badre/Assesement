package JavaTest;

import java.util.Scanner;
// Enter a Roman Number as input and convert it to an integer. (ex IX = 9) 
public class romanToInt {

	public static void main(String[] args) {
			//make a object
			romanToInt r1 = new romanToInt();
				
		      Scanner sc = new Scanner(System.in);
		      System.out.print("Enter a Roman Number in capital letters: ");
		      String inputRoman= sc.nextLine();
		      System.out.println("The Integer value of given Roman number is: "+r1.romanToInt(inputRoman));
		   }
			//method for checking roman numbers
		   int NumValue(char rom){
		      if (rom == 'I')
		         return 1;
		      if (rom == 'V')
		         return 5;
		      if (rom == 'X')
		         return 10;
		      if (rom == 'L')
		         return 50;
		      if (rom == 'C')
		         return 100;
		      if (rom == 'D')
		         return 500;
		      if (rom == 'M')
		         return 1000;
		      return -1;
		   } 
		   //for converting roman to int
		   int romanToInt(String str) {
			   
		      int sum = 0;
		      for (int i=0; i<str.length(); i++) {
		         int s1 = NumValue(str.charAt(i));
		         if (i+1 <str.length()) {
		            int s2 = NumValue(str.charAt(i+1));
		            if (s1 >= s2) {
		               sum = sum + s1;
		            }
		            else {
		               sum = sum - s1;
		            } 
		         }
		         else {
		            sum = sum + s1;
		         } 
		      }
		      return sum;
		   } 

	}


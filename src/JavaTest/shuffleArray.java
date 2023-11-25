package JavaTest;

import java.util.Random;
//. Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it
public class shuffleArray {
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6,7};

	//for random number 
	Random rand= new Random();
	
	for(int i=arr.length-1;i>0;i--) {
		int j=rand.nextInt(i+1);
		
		//here we swap the array
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		}
	for(int elements: arr) {
		System.out.println(elements);
	}
	}
}
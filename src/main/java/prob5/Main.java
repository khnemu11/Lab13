package prob5; //package prob5

import java.util.Scanner; //for using keyboard

/**
 * compare two array and know there are equal or not
 *
 */
public class Main {
	/**
	 * make array and display
	 * @param args
	 */
	public static void main(String[] args) {
		int row,col; //row,column variable
		
		Scanner scanf = new Scanner(System.in); //make instance of Scanner
		
		System.out.print("Enter row size(maximum 5): "); //ask row size for array1
		row = scanf.nextInt(); //save input number in row
		System.out.print("Enter column size(maximum 5): "); //ask column size for array1
		col = scanf.nextInt(); //save input number in col
		
		int [][] array1 = new int[row][col]; //make array based on row and col
		
		System.out.print("Enter row size(maximum 5): "); //ask row size for array1
		row = scanf.nextInt(); //save input number in row
		System.out.print("Enter column size(maximum 5): ");//ask column size for array1
		col = scanf.nextInt(); //save input number in col
		
		int [][] array2 = new int[row][col]; //make array based on row and col
		
		System.out.print("Enter List1: "); //print enter list1
		
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array1[i].length;j++) array1[i][j]=scanf.nextInt();
		}
		
		//input value in array1 to use for
		
		System.out.print("Enter List2: "); //print enter list2
		
		for(int i=0;i<array2.length;i++) {
			for(int j=0;j<array2[i].length;j++) array2[i][j]=scanf.nextInt();
		}
		
		//input value in array2 to use for
		
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array1[i].length;j++) System.out.print(array1[i][j]+" ");
			System.out.println();
		}
		System.out.println();
		
		//show value in array1
		
		for(int i=0;i<array2.length;i++) {
			for(int j=0;j<array2[i].length;j++) System.out.print(array2[i][j]+" ");
			System.out.println();
		}
		System.out.println();
		
		//show value in array2
		
		if(equals(array1,array2)) { //distinguish between array1 and arry2 are equals using equals method 
			System.out.println("The two arrays are approximately identical"); //print not equal
		}
		
		else {
			System.out.println("The two arrays are not identical"); //print equal
		}
		
		
	}
	/**
	 * distinguish between array1 and arry2 are equals
	 * 
	 * @param array1
	 * @param array2
	 * @return true or false
	 */
		public static boolean equals(int [][] array1,int [][] array2) {
		int count=0; //count for tolerance band
		
		if(array1.length!=array2.length)	return false; //if length of array1 and array2 are different, return false
		else {
			for(int i=0;i<array1.length;i++) {  
				for(int j=0;j<array1[i].length;j++) {
					if(array1[i][j]!=array2[i][j]) count++;  // if value in array1 and array2 are different, each by count++
				}
			}
			if(count>3)	return false; //if count>3, return false
			else return true; //if else, return true
		}
	}
}

package prob3; //package prob3

import java.util.Scanner; //import for use keboard
/**
 * main class for show area and perimeter of rectangle and circle
 *
 */
public class Main {
	/**
	 * main method for input and show
	 * @param args
	 */
	public static void main(String[] args) {
		double a,b; //input variable
		
		Scanner scanf = new Scanner(System.in); //instance of Scanner
		Circle circle = new Circle(); //instance of Circle
		Rectangle rect = new Rectangle(); //instance of Rectangle
		
		circle.Inputdisplay(); //Inputdisplay for Circle
		a=scanf.nextDouble(); //save keyboard value in a
		circle.set(a); //set circle
		circle.show_param(); //show_param
		circle.show_Area_Perimeter(); //show_Area_Perimeter
		
		rect.Inputdisplay(); //inputplay for rect
		a=scanf.nextDouble(); //save keyboard value in a
		b=scanf.nextDouble(); //save keyboard value in b
		rect.set(a, b); //set a,b
		rect.show_param(); //show_param
		rect.show_Area_Perimeter(); //show_Area_Perimeter
	}
}

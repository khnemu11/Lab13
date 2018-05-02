package prob3; //package prob3
/**
 * show and calculate of rectangle's area and perimeter
 * @author khnem
 *
 */
public class Rectangle extends Shape {
	private double length; //length variable
	private double width; //width variable
	/**
	 * display input sentence
	 */
	public void Inputdisplay() {
		System.out.print("Enter length and width: "); //display for inputing length and width
	}
	/**
	 * set length and width
	 * @param length
	 * @param width
	 */
	public void set(double length, double width) {
		this.length=length; //save input length in this.length
		this.width=width; //save input width in this.width
	}
	/**
	 * calculate area
	 */
	public double area() {
		return length*width; //return area
	}
	/**
	 * calculate perimeter
	 */
	public double perimeter() {
		return 2*(length+width); //return calcaulte
	}
	/**
	 * show param of rectangle
	 */
	public void show_param() {
		System.out.println("Length: "+length); //show length
		System.out.println("Width: "+width);//show width
	}
}

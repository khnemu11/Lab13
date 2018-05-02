package prob3; //package prob3
/**
 * 
 * area and perimeter for circle
 *
 */
public class Circle extends Shape{
	private double radius; //radius variable
	/**
	 * display input sentence
	 */
	public void Inputdisplay() {
		System.out.print("Enter radius: "); //display enter radius
	}
	/**
	 * set radius
	 * @param radius
	 */
	public void set(double radius) {
		this.radius=radius; //save input value in Circle
	}
	/**
	 * calculate area
	 */
	public double area() {
		return radius*radius*Math.PI; //return area value
	}
	/**
	 * calculate perimeter
	 */
	public double perimeter() {
		return radius*2*Math.PI; //return perimeter
	}
	/**
	 * show param of circle
	 */
	public void show_param() {
		System.out.println("Radius:"+radius);
	}
}

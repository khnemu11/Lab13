package prob3; //package prob3
/**
 * abstract class that has area ,perimeter and show them
 *
 */
public abstract class Shape {
	public abstract double area(); //area class
	public abstract double perimeter(); //perimeter class
	/**
	 * show area and perimeter
	 */
	public void show_Area_Perimeter() {
		System.out.println("Area: "+area()); //show area
		System.out.println("Perimeter: "+perimeter()+"\n"); //show perimeter
	}
}

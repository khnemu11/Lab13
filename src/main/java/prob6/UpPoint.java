package prob6; //package prob6
/**
 * uppoint information
 * @author khnem
 *
 */
public class UpPoint implements CapitalPrint{
	private int x,y; //variable of point
	/**
	 * set point x ,y
	 * @param x
	 * @param y
	 */
	public void set(int x,int y) {
		this.x=x; //input x is this.x
		this.y=y; //input y is this.y
	}
	/**
	 * override our toString when we used this instance in Printer
	 */
	public String toString() {
		return "x : " + x + " y: " + y; //return x and y string
	}
}
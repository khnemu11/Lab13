package prob6; //package prob6

/**
 * if point == uppoint, upper
 * else if porint == downpoint , lower
 * @author khnem
 *
 */
public class Main {
/**
 * main called part
 * @param args
 */
	public static void main(String[] args) {
		UpPoint p1 = new UpPoint(); //set point1 to uppoint
		DownPoint p2 = new DownPoint(); //set point2  to downpoint
		DownPoint p3 = new DownPoint(); //set point3 to downpoint
		UpPoint p4 = new UpPoint(); //set point4 to uppoint
		
		p1.set(3, 3); //set value in p1
		p2.set(2, 5); //set value in p2
		p3.set(4, 7); //set value in p3
		p4.set(9, 12); //set value in p4
		
		Printer.printer(p1); //print p1
		Printer.printer(p2); //print p2
		Printer.printer(p3);//print p3
		Printer.printer(p4);//print p4
	}

}

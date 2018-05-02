package prob6; //package prob6
/**
 * print x and y value after judge capitalize
 *
 */
public class Printer {
	/**
	 * print x and y value after judge capitalize
	 *
	 */
	public static void printer(Object point) {
		String print = point.toString(); //point.toString value is print
		
		if(point instanceof CapitalPrint) print=print.toUpperCase(); //if print inherited Uppoint, capitalize
		System.out.println(print); //print print
	}
}

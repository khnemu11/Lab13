package prob2; //package prob2

/**
 * 
 * class for basic model of book
 *
 */
public class Book {
	public static int count =1; //global variable count for id
	public int id; //variable for id
	public String name; //variable for name
	/**
	 * set name
	 * @param name
	 */
	public void set(String name) {
		this.name=name; //save param's name in this.name
		id=count++; // id=count and count++
	}
	/**
	 * show information
	 */
	public void display() {
		System.out.println("<<Book>>"); //print <<Book>>
		System.out.println("\tId: "+id); //print id
		System.out.println("\tBook name: "+this.name); //print book name
	}
}

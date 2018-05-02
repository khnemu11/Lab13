package prob2; //package prob2

/**
 * class for History extends Book
 * @author khnem
 *
 */
public class History extends Book{
	public String author; //variable for author
	/**
	 * set name and auathor
	 * @param name
	 * @param author
	 */
	public void set(String name, String author) {
		this.name=name; //save param's name ins this.name
		this.author=author; //save param's author ins this.author
		id=count++; //id =count and count++
	}
	/**
	 * show information
	 */
	public void display() {
		System.out.println("<<Hitory>>"); //print <<History>>
		System.out.println("\tId: "+id); //print id
		System.out.println("\tBook name: "+this.name);//print name
		System.out.println("\tAuthor: "+this.author); //print author
	}
}

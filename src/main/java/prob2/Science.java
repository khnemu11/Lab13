package prob2; //package prob2

/**
 * 
 * class for Science extends Book
 *
 */
public class Science extends Book{
	public String publisher; //publisher variable
	/**
	 * set name and publisher
	 * 
	 * @param name
	 * @param publisher
	 */
	public void set(String name, String publisher) {
		this.name=name; //save param's name ins this.name
		this.publisher=publisher; //save param's publisher ins this.publisher
		id=count++; //id =count and count++
	}
	/**
	 * display information
	 */
	public void display() {
		System.out.println("<<Science>>"); //print <<Sience>>
		System.out.println("\tId: "+id); //print id
		System.out.println("\tBook name: "+this.name);//print name
		System.out.println("\tPublisher: "+this.publisher); //print publisher
	}
}

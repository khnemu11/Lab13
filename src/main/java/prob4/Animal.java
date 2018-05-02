package prob4; //package prob4

/**
 * for basic information of animal
 * @author khnem
 *
 */
public class Animal {
	private String name; //name valuable
	private String food; //food valuable
	
	/**
	 * set name
	 * @param name
	 */
	public void setname(String name) {
		this.name=name; //save input name in this.name
	}
	
	/**
	 * print name
	 */
	public void getname() {
		System.out.println("Name: "+name); //print name
	}
}

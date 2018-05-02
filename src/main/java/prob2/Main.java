package prob2; //package prob2

/**
 * 
 * main class for set and display books
 *
 */
public class Main {
	/**
	 * main method for set and display books
	 * @param args
	 */
	public static void main(String[] args) {
		Book book1 =new Book(); // make instance of Book
		Science book2 =new Science(); //make instance of Science
		History book3 =new History(); //make instance of History
		
		book1.set("Simple Book"); //set book1 
		book2.set("Hello physics","SicenceWorld"); //set book2
		book3.set("What Is history", "E.H.Carr");//set book3
		
		book1.display(); //show book1
		book2.display(); //sho2 book2
		book3.display(); //show book3
	}

}
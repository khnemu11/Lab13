package prob4; //package prob4

import java.util.Scanner; //for using keyboard

/**
 * set name of dog and cat, and feed what kind of food for each animals
 * @author khnem
 *
 */
public class Main {
	/**
	 * main class
	 * @param args
	 */
	public static void main(String[] args) {
		String catname,dogname; //cat's name and dog'sname valuable
		
		Master master = new Master(); //make instance of Master
		Scanner scanf = new Scanner(System.in); //make instance of Scanner
		Cat cat = new Cat();//make instance of cat
		Dog dog = new Dog(); //make instance of dog
		
		System.out.print("Enter the cat name and dog name: "); //print cat name and dog name
		catname=scanf.next(); //save first input value in catname
		dogname=scanf.next(); //save second input value in dogname
		
		cat.setname(catname); //set catname
		cat.getname(); //show cat name
		master.feed(cat); //show kind of food for cat
		
		dog.setname(dogname); //set dog name
		dog.getname();// show dog name
		master.feed(dog); //show kind of food for dog
	}
}

package prob4; //package prob4

/**
 * feed food for each animals
 * @author khnem
 *
 */
public class Master {
	/**
	 * feed food for each animals
	 * @param pet
	 */
	public void feed(Pet pet) {
		System.out.println("feed: "+pet.food()); //print pet's food
	}
}

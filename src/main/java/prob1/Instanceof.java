
package prob1; //package prob1

/**
 * 
 * print what is instance of arguments
 *
 */
public class Instanceof {
	/**
	 * print what is instance of arguments
	 * @param friend
	 */
	public static void whatFriend(Friend friend) {
		if(friend instanceof ClassFriend) {
			((ClassFriend)friend).classFriend(); //if friend is instance of ClassFriend, execute friend.classFriend
		}
		else if(friend instanceof SchoolFriend) {
			((SchoolFriend)friend).schoolFriend(); //if friend is instance of SchoolFriend, execute School.classFriend
		}

		else {
			friend.friend(); //else, execute friend.Friend
		}	
	}
}
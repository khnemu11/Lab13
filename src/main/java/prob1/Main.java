package prob1; //package prob1

/**
 * 
 * main class for knowing instance of friend
 *
 */
public class Main {
	/**
	 * main method for knowing stance of friend
	 * @param args
	 */
	public static void main(String[] args) {
		Friend friend1 =new Friend(); // make instance of Friend
		SchoolFriend friend2 =new SchoolFriend(); //make instance of SchoolFriend
		ClassFriend friend3 =new ClassFriend(); //make instance of ClassFriend
		
		Instanceof.WhatFriend(friend1); //distinguish friend1 used Instanceof.whatFriend
		Instanceof.WhatFriend(friend2); //distinguish friend2 used Instanceof.whatFriend
		Instanceof.WhatFriend(friend3); //distinguish friend3 used Instanceof.whatFriend
	}

}
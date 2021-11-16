/*
Make an invitation to a birthday party at your place. Input your friend's name and print
the message :
"Hey <friendName>, it's my birthday this weekend and you are invited to the party at my place.
Bring gifts!!! "
Example -
Input: Tom
Output: Hey Tom, it's my birthday this weekend and you are invited to the party at my place.
Bring gifts!!!
 */
package com.internshala.javaapp.exersice;

import java.util.Scanner;

public class FriendsInvitation {
	public static void main(String[] args) {
		// write your code here
		Scanner sc = new Scanner(System.in);
		String friendName;
		System.out.println("Enter your friend\'s name : ");
		friendName = sc.nextLine();

		System.out.println("Hey "+friendName+", it's my birthday this weekend and you are invited to the party at my place. Bring gifts!!!");
		sc.close();

	}
}

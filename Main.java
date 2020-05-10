package net.object.test;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanLine = new Scanner(System.in);
		Scanner scanInt = new Scanner(System.in);
		
		String userAName, userBName;
		int userAChoice,userBChoice;
		boolean inputAVerif = false, inputBVerif = false, playerDied = false;


		/*Hi users*/
		System.out.println("Hi users !");
		
		/*User A Name*/
		System.out.print("[Name] User A: ");
		userAName = scanLine.nextLine();

		/*User B Name */
		System.out.print("[Name] User B: ");
		userBName = scanLine.nextLine();

		Player playerA = new Player(userAName, 300.0 , 100.0);
		Player playerB = new Player(userBName);

		/*Player A*/

		do {
			
			
				/*Verification */
					do {

						/*PlayerA Choice*/
						System.out.println("");
						System.out.println("["+playerA.getName()+"]" + ": " +"\n" +  
								"Actual PV:        " + playerA.getHealth() + "\n" +
								"1-Attack:         " + playerA.getAttack() + " DMG" + "\n" +
								"2-Fire Ball:      " + playerA.getFireBallDamage() + "DMG: " + playerA.getFireBallPerPlayer() + " potion of healing remaining" +  "\n" +
								"3-Healing Potion: " + playerA.getHealPotion() + "PV: " + playerA.getHealPotionPerPlayer() + " potion of healing remaining"

								);

						/*PlayerA action choosing*/
						System.out.println("");
						System.out.print("["+playerA.getName()+"]" + "Choice an action: ");
						if (scanInt.hasNextInt()) {
							userAChoice = scanInt.nextInt();
							inputAVerif = true; // Stop the boucle beacause no errors

							/*Choice processing */
							if (userAChoice > 0 && userAChoice <= 3) {
								switch(userAChoice) {
								case 1: playerA.attack(playerB); break;
								case 2: playerA.fireBallAttack(playerB);break;
								case 3: playerA.potionHeal();break;
								}
								

							}

							/*Error Management */
						} else {
							inputAVerif = false; // continue the boucle beaucause is here an errors
							System.err.println("Error: Not a valid choice: " + scanInt.next() );
						}
					}while(!inputAVerif);



			/*Player B*/


				/*Verification */

					do {
						
						if(playerB.isDeath()) {
							playerDied = true;
						} else {
							/*playerB Choice*/
							System.out.println("");
							System.out.println("["+playerB.getName()+"]" + ": " +"\n" +  
									"Actual PV:        " + playerB.getHealth() + "\n" +
									"1-Attack:         " + playerB.getAttack() + " DMG" + "\n" +
									"2-Fire Ball:      " + playerB.getFireBallDamage() + "DMG: " + playerB.getFireBallPerPlayer() + " potion of healing remaining" +  "\n" +
									"3-Healing Potion: " + playerB.getHealPotion() + "PV: " + playerB.getHealPotionPerPlayer() + " potion of healing remaining"

									);

							/*playerB action choosing*/
							System.out.println("");
							System.out.print("["+playerB.getName()+"]" + "Choice an action: ");
							if (scanInt.hasNextInt()) {
								userBChoice = scanInt.nextInt();
								inputBVerif = true; // Stop the boucle beacause no errors

								/*Choice processing */
								if (userBChoice > 0 && userBChoice <= 3) {
									switch(userBChoice) {
									case 1: playerB.attack(playerA); break;
									case 2: playerB.fireBallAttack(playerA);break;
									case 3: playerB.potionHeal();break;
									}
									
									if(playerA.isDeath()) {
										playerDied = true;
									}
									
								}

								/*Error Management */
							} else {
								inputBVerif = false; // continue the boucle beaucause is here an errors
								System.err.println("Error: Not a valid choice: " + scanInt.next() );
							}
						}

						
					}while(!inputBVerif);


					if(playerB.isDeath()) {
						playerDied = true;
					}
		}while(!playerDied);
		
		/*Program end*/
		
		scanLine.close();
		scanInt.close();
		
		System.out.println("Program end");
		
		/*Git Branch Test*/



	}
}







package project1;
/*
 * Ningyuan Xiong
 * NetID:nxiong
 * assignment 3
 * lab section: TR 6:15 - 7:30
 */

//I did not collaborate with anyone on this assignment.

import java.util.Random;
import java.util.Scanner;

public class Project {
	int v;		 //speed
	int theta;   //angle of elevation
	int h;		 //height of the wall
	int d;		 //distance
	

	public static void main(String[] args) {
		System.out.println("You are playing a TTY game.");
		System.out.println("In this game, you have a catapult that can launch projectiles.\n" + 
				"In each round of the game, the computer places a wall in front of you.\n" + 
				"Your will aim your catapult by setting the launch angle and speed.\n" + 
				"You will get points for clearing the wall and loses points for hitting the wall.");
		System.out.println("");
		System.out.println("Rules: Each launch costs 1 point. A close clear gets 5 points (so +4 net). " +
				"A far clear gets +2 net. \nA near miss loses 1 point net and a far miss loses 3 points net.");
		
		Scanner scan = new Scanner(System.in);
		boolean boo = true;		
		
		System.out.println("");
		int score = 0; // how many scores the user gets
		int round = 0; // count how many times the user plays
		int cost = 1; // each round costs 1

		do{	round++;
			long startTime; //start time
			long endTime;   //end time
			double time;    //time difference
			startTime = System.currentTimeMillis();

			System.out.println("");
			System.out.println("Round "+round);
			System.out.println("You score now is "+score);
			
			System.out.println("Please enter speed:"); // get speed
			double v = scan.nextDouble();
			
			System.out.println("");
			System.out.println("Please enter angle of elevation:"); // get height
			double theta = scan.nextDouble();
		
			int h = getRandom(); // get random height of the wall
			double d = getRandom(); // get random distance of the wall
			
			System.out.println("");
			System.out.println("The height of the wall: " + h);
			System.out.println("The distance of the wall: " + d);

			endTime = System.currentTimeMillis();
			time = (endTime - startTime) / 1000.0; // milisec to sec
			System.out.println("You took "+time+"s to launch");
			d = d - (1 * time ); //assume the wall's speed is 1

			double Y = d * Math.tan(Math.toRadians(theta))-(9.8*Math.pow(d, 2))/(2*(Math.pow(v*Math.cos(Math.toRadians(theta)), 2)));
			System.out.printf("Your height: %.2f",Y);
			System.out.println("");
			double diff = Math.abs(Y-h);

			if(d > 0){
				if(Y>h) {
					System.out.println("");
					if(diff<=4){
						System.out.println(WinOutput());
						System.out.println("Wanna try again? Enter [Y/N]");
						score = score + 5;
					}else{
						System.out.println(WinOutput());
						System.out.println("You have plenty of room! Go ahead, play again! Enter [Y/N]");
						score = score + 3;
					}

				}else {
					System.out.println("");
					if(diff<=4){
						System.out.println(LoseOutput());
						System.out.println("But you almost got it! Why don't you try again? Enter [Y/N]");
					}else{
						System.out.println(LoseOutput());
						System.out.println("You can do better. Go ahead, try again! Enter [Y/N]");
						score = score - 2;
					}
				}
			} else{
				System.out.println("Oops, you took so long to projectile. The wall has already reached you.");
			}


			score = score-cost; // each round cost 1 point
			System.out.println("Your total score is: " + score);
			System.out.println("");
			
			String play = scan.next();
			if(play.equals("N")) { // if the user doesn't want to play, print "game over" and stop the loop.
				System.out.println("Game over.");
				boo = false;
			}
			
		}while(boo);
		
		scan.close();
	}


	public static int getRandom() { // a method to get random non-zero value
		Random r = new Random();
		boolean boo = true;
		int value = 0;
		while (boo) {
			value = r.nextInt(40);
			if (value != 0) {
				boo = false;
			}
		}
		return value;
	}
	
	public static String WinOutput() { // different output for winning the game
		Random random = new Random();
		int i = random.nextInt(3);
		String[] output = {"Congratulation, you win.","That's great! You win.","What an excellent projectile! You win."};
		return output[i];
	}

	public static String LoseOutput() { // different output for losing the game
		Random random = new Random();
		int i = random.nextInt(3);
		String[] output = {"That's a shame!","Sorry, hit the wall.","You didn't make it."};
		return output[i];
	}

}

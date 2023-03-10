package gslc1;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class gslc {

	static Integer call() {
		Integer result = ThreadLocalRandom.current().nextInt(1, 10 + 1);

		if(result == 1) {
			System.out.println("You got an Ace\n");
		}
		else if(result == 10) {
			Integer temp = ThreadLocalRandom.current().nextInt(1, 4 + 1);
			if(temp == 1) {
				System.out.println("You got a 10\n");
			}
			if(temp == 2) {
				System.out.println("You got a Jack\n");
			}
			if(temp == 3) {
				System.out.println("You got a Queen\n");
			}
			if(temp == 4) {
				System.out.println("You got a King\n");
			}
		}
		else {
			System.out.println("You got a " + result);
			System.out.println("\n");
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println("WELCOME TO SOLO BLACKJACK. GET AS CLOSE TO 21 AS POSSIBLE\n");
		Integer score = 0;
		Integer size = 0;
		String[] hand = new String[20];
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Your score is " + score);
			System.out.println("Call or Fold?\n1. Call\n2. Fold\n3. View Hand");
			int choice = scan.nextInt();
			
			if(choice == 1) {
				Integer temp = call();
				score += temp;
				hand[size] = temp.toString();
				size++;
				
				if(score > 21) {
					System.out.println("Your score is " + score);
					System.out.println("YOU LOSS");
					System.out.print("Final hand: ");
					for(int i = 0; i < size; i++) {
						System.out.print(hand[i] +" ");
					}
					break;
				}
				if(score == 21) {
					System.out.println("Your score is " + score);
					System.out.println("YOU WON");
					System.out.print("Final hand: ");
					for(int i = 0; i < size; i++) {
						System.out.print(hand[i] +" ");
					}
					break;
				}
				continue;
			}
			if(choice == 2) {
				System.out.println("You folded");
				System.out.println("Final score: " + score);
				System.out.print("Final hand: ");
				for(int i = 0; i < size; i++) {
					System.out.print(hand[i] +" ");
				}
				break;
			}
			if(choice == 3) {
				System.out.print("Your hand: ");
				for(int i = 0; i < size; i++) {
					System.out.print(hand[i] +" ");
				}
				System.out.println();
				continue;
			}
		}

	}

}

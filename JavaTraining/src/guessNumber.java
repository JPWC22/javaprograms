
import java.util.Scanner;

class guesserRole {

	Scanner sc = new Scanner(System.in);
	int gnum;

	int guessNum1() {

		System.out.println("Please set a number between 1-100: ");
		gnum = sc.nextInt();
		return gnum;
	}

	void range(int x) {

		if (gnum > x) {

			System.out.println("Out of range");
			System.exit(0);
		}
	}
}

class playerRole {

	int pnum;
	Scanner sc = new Scanner(System.in);

	int guessNum() {

		System.out.println("Player - please guess a number: ");
		pnum = sc.nextInt();
		return pnum;
	}

	void range(int x) {

		if (pnum > x) {
			System.out.println("Out of range");
			System.exit(0);
		}

	}
}

class refereeRole {

	int gnum;
	int player1number, player2number, player3number;

	guesserRole g = new guesserRole();
	playerRole p1 = new playerRole();
	playerRole p2 = new playerRole();
	playerRole p3 = new playerRole();

	void collectGuesserNum() {

		gnum = g.guessNum1();
		g.range(100);
	}

	void collectPlayerNum() {

		player1number = p1.guessNum();
		p1.range(100);
		player2number = p2.guessNum();
		p2.range(100);
		player3number = p3.guessNum();
		p3.range(100);
	}

	void checkNumber() {

		if (gnum == player1number) {

			System.out.println("Player 1 got it!");
		}
		if (gnum == player2number) {

			System.out.println("Player 2 got it!");
		}
		if (gnum == player3number) {

			System.out.println("Player 3 got it!");
		} 
		
		if (gnum != player1number && gnum != player2number && gnum!=player3number){
			System.out.println("No one got it! Plese try again");
			collectPlayerNum();
			checkNumber();
		}
	}

}

public class guessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		refereeRole r = new refereeRole();
		r.collectGuesserNum();
		r.collectPlayerNum();
		r.checkNumber();
	}

}

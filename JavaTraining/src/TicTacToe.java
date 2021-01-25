import java.util.Random;
import java.util.Scanner;



	class initialize {
		void printBoard(String[] board) {
			System.out.println("|---|---|---|");
			System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
			System.out.println("|-----------|");
			System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
			System.out.println("|-----------|");
			System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
			System.out.println("|---|---|---|");
		}
	}

	 class check {

		String checkWinner(String[] board) {
			int a;
			for (a = 0; a < 8; a++) {
				String line = null;
				String winner = null;
				switch (a) {
				case 0:
					line = board[0] + board[1] + board[2];
					break;
				case 1:
					line = board[3] + board[4] + board[5];
					break;
				case 2:
					line = board[6] + board[7] + board[8];
					break;
				case 3:
					line = board[0] + board[3] + board[6];
					break;
				case 4:
					line = board[1] + board[4] + board[7];
					break;
				case 5:
					line = board[2] + board[5] + board[8];
					break;
				case 6:
					line = board[0] + board[4] + board[8];
					break;
				case 7:
					line = board[2] + board[4] + board[6];
					break;
				}
				
				if (line.equals("XXX")) {
					return "X";
				}

				
				else if (line.equals("OOO")) {
					return "O";
				}
				
			}
			for (a=0; a<8; a++) {
				if (board[a] != "X" || board[a] != "O" ) {
					return null;
				}
			}

			return "draw";
		}
		
	 }
	 public class TicTacToe {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner in = new Scanner(System.in);
			String winner = null;
			String[] board = new String[9];
			String turn = "X";
			initialize x = new initialize();
			check c = new check();
			Random random = new Random();
			for (int j = 0; j < 9; j++) {
				board[j] = String.valueOf(j + 1);
			}
			
			x.printBoard(board);
			
			while (winner == null) {
				int numInput;
				
				if (turn.equals("X")) {
					System.out.println("Player please enter an input");
					numInput = in.nextInt();
				} else {
					numInput = random.nextInt(8) + 1;
				}
				

				if (board[numInput - 1].equals(String.valueOf(numInput))) {
					board[numInput - 1] = turn;

					if (turn.equals("X")) {
						turn = "O";
					} else {
						turn = "X";
						x.printBoard(board);
					}
					
					winner = c.checkWinner(board);
				} else {
					if (turn.equals("X")) {
						System.out.println("Slot taken! Please renter");
					}
					
				}
			}
			x.printBoard(board);
			if (winner == "X") {
				System.out.println("Player won!");
			}
			if (winner == "O") {
				System.out.println("Sorry! You loss!");
			}
			if (winner == "draw") {
				System.out.println("Draw! please play again");
			}
		}
	}


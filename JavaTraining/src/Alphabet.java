import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the n value ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		sc.nextLine();

		System.out.println("Enter the name: ");
		String name = sc.nextLine();
		sc.close();

		int length = name.length();

		String upperName = name.toUpperCase();

		char[] ch = upperName.toCharArray();

		for (int k = 0; k < length; k++) {

			char character = ch[k];

			switch (character) {

			case 'A':
				for (int i = 1; i <= n; i++) // A
				{
					for (int j = 1; j <= n; j++) {
						if (i == 1 && (j != 1 && j != n) || j == n && i != 1 || i == n / 2 || j == 1 && i != 1) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}		
					}
					System.out.println();
				}
				System.out.println("\r");
				break;

			case 'B':
				
				// B
				for (int i = 1; i <= n; i++) {
					for (int j = 1; j <= n; j++) {
						if (i == 1 && j != n || j == n && (i != 1 && i != n && i != n / 2) || i == n / 2 && j != n
								|| j == 1 || i == n && j != n) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
				break;

			case 'C': // C
				for (int i = 1; i <= n; i++) {
					for (int j = 1; j <= n; j++) {
						if (i == 1 && j != 1 || i == n && j != 1 || j == 1 && i != 1 && i != n) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
				break;
			case 'D': // D
				for (int i = 1; i <= n; i++) {
					for (int j = 1; j <= n; j++) {
						if (i == 1 && j != n || i == n && j != n || j == 1 || j == n && i != 1 && i != n) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
				break;
			case 'E': // E
				for (int i = 1; i <= n; i++) {
					for (int j = 1; j <= n; j++) {
						if (i == 1 || i == n || i == n / 2 || j == 1) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
				break;

			case 'F':

				// F
				for (int i = 1; i <= n; i++) {
					for (int j = 1; j <= n; j++) {
						if (i == 1 || i == n / 2 || j == 1) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
				break;

			case 'G':

				System.out.println(); // G
				for (int i = 1; i <= n; i++) {
					for (int j = 1; j <= n; j++) {
						if (i == 1 && j != 1 || i == n && j != 1 || j == 1 && i != 1 && i != n
								|| j == n && i >= n / 2 + 1 || i == n / 2 + 1 && j >= n / 2 + 2) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
				break;

			case 'H':

				System.out.println(); // H
				for (int i = 1; i <= n; i++) {
					for (int j = 1; j <= n; j++) {
						if (j == 1 || j == n || i == n / 2) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();

				}
				break;

			case 'I':

				System.out.println(); // I
				for (int i = 1; i <= n; i++) {
					for (int j = 1; j <= n; j++) {
						if (i == 1 || i == n || j == n / 2) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
				break;

			case 'J':

				System.out.println(); // J
				for (int i = 1; i <= n; i++) {
					for (int j = 1; j <= n; j++) {
						if (i == 1 || i == n && j != n && j != 1 || j == n && i != 1 && i != n
								|| j == 1 && i >= n - 2 && i != n) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
				break;

			case 'K':

				System.out.println(); // K
				for (int i = 1; i <= n; i++) {
					for (int j = 1; j <= n; j++) {
						if (i >= n / 2 && i - 2 == j || j == 1 || i <= n / 2 && i == n / 2 + 3 - j) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
				break;

			case 'L':

				System.out.println(); // L
				for (int i = 1; i <= n; i++) {
					for (int j = 1; j <= n; j++) {
						if (j == 1 || i == n) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
				break;

			case 'M':

				System.out.println(); // M
				for (int i = 1; i <= n; i++) {
					for (int j = 1; j <= n; j++) {
						if (i <= n / 2 && i == j || j == 1 || j == n || i <= n / 2 && i == n + 1 - j) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
				break;

			case 'N':

				System.out.println(); // N
				for (int i = 1; i <= n; i++) {
					for (int j = 1; j <= n; j++) {
						if (i == j || j == 1 || j == n) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
				break;

			case 'O':

				System.out.println(); // O
				for (int i = 1; i <= n; i++) {
					for (int j = 1; j <= n; j++) {
						if (i == 1 && j != n && j != 1 || i == n && j != n && j != 1 || j == 1 && i != 1 && i != n
								|| j == n && i != 1 && i != n) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
				break;

			case 'P':

				System.out.println(); // P
				for (int i = 1; i <= n; i++) {
					for (int j = 1; j <= n; j++) {
						if (i == 1 && j != n || i == n / 2 && j != n || j == 1 || j == n && i != 1 && i <= n / 2 - 1) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
				break;

			case 'Q':

				System.out.println(); // Q
				for (int i = 1; i <= n; i++) {
					for (int j = 1; j <= n; j++) {
						if (i == 1 && j < 4 * n / 5 && j != 1 || i == 4 * n / 5 && j < 4 * n / 5 && j != 1
								|| j == 1 && i != 1 && i < 3 * n / 4 || j == 4 * n / 5 && i != 1 && i < 4 * n / 5
								|| i == j && i >= 2 * n / 3 && i != n) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
				break;

			case 'R':

				System.out.println(); // R
				for (int i = 1; i <= n; i++) {
					for (int j = 1; j <= n; j++) {
						if (i == 1 && j != n || i == n / 2 && j != n || j == 1 || j == n && i != 1 && i <= n / 2 - 1
								|| i >= n / 2 && i - 1 == j) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
				break;

			case 'S':

				System.out.println(); // S
				for (int i = 1; i <= n; i++) {
					for (int j = 1; j <= n; j++) {
						if (i == 1 && j != n && j != 1 || i == n / 2 + 1 && j != n && j != 1
								|| j == 1 && i <= n / 2 && i != 1 || j == n && i >= n / 2 + 2 && i != n
								|| i == n && j != n) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
				break;

			case 'T':

				System.out.println(); // T
				for (int i = 1; i <= n; i++) {
					for (int j = 1; j <= n; j++) {
						if (i == 1 || j == n / 2) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
				break;

			case 'U':

				System.out.println(); // U
				for (int i = 1; i <= n; i++) {
					for (int j = 1; j <= n; j++) {
						if (i == n && j != n && j != 1 || j == 1 && i != n || j == n && i != n) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
				break;

			case 'V':

				System.out.println(); // V
				for (int i = 1; i <= n; i++) {
					for (int j = 1; j <= n; j++) {
						if (j <= n && i - n / 2 == j || j >= n / 2 && i == 3 * n / 2 + 1 - j || j == 1 && i <= n / 2
								|| j == n && i <= n / 2) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
				break;

			case 'W':

				System.out.println(); // W
				for (int i = 1; i <= n; i++) {
					for (int j = 1; j <= n; j++) {
						if (i >= n / 2 && i == j || j == 1 || j == n || i >= n / 2 && i == n + 1 - j) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
				break;

			case 'X':

				System.out.println(); // X
				for (int i = 1; i <= n; i++) {
					for (int j = 1; j <= n; j++) {
						if (i == j || i == n + 1 - j) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}

				break;

			case 'Y':

				System.out.println(); // Y
				for (int i = 1; i <= n; i++) {
					for (int j = 1; j <= n; j++) {
						if (j <= n / 2 && i == j || j >= n / 2 && i == n - j || j == n / 2 && i >= n / 2) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}

				break;

			case 'Z':

				System.out.println(); // Z
				for (int i = 1; i <= n; i++) {
					for (int j = 1; j <= n; j++) {
						if (i == 1 || i == n || i == n + 1 - j) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}

			}
		}
	}

}

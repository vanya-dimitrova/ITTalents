import java.util.Scanner;



public class TicTacToe {

	public static void main(String[] args) {
		// Tic-Tac-Toe
		Scanner sc = new Scanner(System.in);

		System.out.println("   Play Tic-Tac-Toe!");
		System.out.println();
		System.out.println("- Decide a player for yourself:");
		System.out.println("- Player 1 gets token 'O' and Player 2 gets token 'X'.");
		System.out.println("- They get turns to fill in boxex with their own token.");
		System.out.println("- Each player's goal is to have their token placed in");
		System.out.println("   either row,column or diagonal of the table.");
		System.out.println();
		System.out.println("   The first one to manage is the Winner! Good Luck!");

		String[][] table = new String[7][7];

		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table.length; j++) {
				if (i % 2 == 0) {
					table[i][j] = "-";
					System.out.print(table[i][j]);
				} else if (i % 2 != 0 && j % 2 == 0) {
					table[i][j] = "|";
					System.out.print(table[i][j]);
				} else {
					table[i][j] = " ";
					System.out.print(table[i][j]);
				}
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i <= 4; i++) {
			boolean validEntry = true;
			do {
				System.out.println("Player 1");
				System.out.println("Choose an empty box from table to fill in your token:");
				System.out.println("Enter row number(1, 3 or 5)and press Enter");
				int row = sc.nextInt();
				System.out.println("Enter column number(1, 3 or 5)and press Enter");
				int col = sc.nextInt();

				if (row <= 5 && row >= 1 && col <= 5 && col >= 1 && 
						row%2 != 0 && col%2 != 0 && table[row][col] == " ") {
					validEntry = true;
					table[row][col] = "O";
					for (int k = 0; k < table.length; k++) {
						for (int k2 = 0; k2 < table.length; k2++) {
							System.out.print(table[k][k2]);
						}
						System.out.println();
					}
				} else {
					validEntry = false;
				}
			} while (!validEntry);

			if ((table[1][1] != "O" && table[1][3] == "O" && table[1][5] == "O")
					|| (table[3][1] == "O" && table[3][3] == "O" && table[3][5] == "O")
					|| (table[5][1] == "O" && table[5][3] == "O" && table[5][5] == "O")
					|| (table[1][1] == "O" && table[3][1] == "O" && table[5][1] == "O")
					|| (table[1][3] == "O" && table[3][3] == "O" && table[5][3] == "O")
					|| (table[1][5] == "O" && table[3][5] == "O" && table[5][5] == "O")
					|| (table[1][1] == "O" && table[3][3] == "O" && table[5][5] == "O")
					|| (table[1][5] == "O" && table[3][3] == "O" && table[5][1] == "O")) {
				System.out.println("Congratulations Player 1! You are the winner!");
				break;
			} else {
				int counter = 0;
				for (int j = 0; j < table.length; j++) {
					for (int j2 = 0; j2 < table.length; j2++) {
						if (table[j][j2] == " ") {
							counter++;
						}
					}
				}
				if (counter > 0) {
					do {
						System.out.println("Player 2");
						System.out.println("Choose an empty box from table to fill in your token:");
						System.out.println("enter row number and press Enter");
						int row = sc.nextInt();
						System.out.println("enter column number and press Enter");
						int col = sc.nextInt();
						if (row <= 5 && row >= 1 && col <= 5 && col >= 1 && table[row][col] == " ") {
							validEntry = true;
							table[row][col] = "X";
							for (int k = 0; k < table.length; k++) {
								for (int k2 = 0; k2 < table.length; k2++) {
									System.out.print(table[k][k2]);
								}
								System.out.println();
							}
						} else {
							validEntry = false;
						}
					} while (!validEntry);

					if ((table[1][1] != "X" && table[1][3] == "X" && table[1][5] == "X")
							|| (table[3][1] == "X" && table[3][3] == "X" && table[3][5] == "X")
							|| (table[5][1] == "X" && table[5][3] == "X" && table[5][5] == "X")
							|| (table[1][1] == "X" && table[3][1] == "X" && table[5][1] == "X")
							|| (table[1][3] == "X" && table[3][3] == "X" && table[5][3] == "X")
							|| (table[1][5] == "X" && table[3][5] == "X" && table[5][5] == "X")
							|| (table[1][1] == "X" && table[3][3] == "X" && table[5][5] == "X")
							|| (table[1][5] == "X" && table[3][3] == "X" && table[5][1] == "X")) {
						System.out.println("Congratulations Player 2! You are the winner!");
						break;
					}
				} else {
					System.out.println("There is no winner!");
					break;
				}
				counter = 0;
			}
		}
		sc.close();
	}

}

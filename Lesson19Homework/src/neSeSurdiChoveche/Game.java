package neSeSurdiChoveche;

public class Game {

	private String[][] layout = {
			{ "   ", "   ", "   ", "   ", "   ", "   ", "[_]", "[_]", "[_]", "   ", "   ", "   ", "   ", "   ", "   " },
			{ "   ", "   ", "   ", "   ", "   ", "   ", "[_]", "[-]", "[_]", "   ", "   ", "   ", "   ", "   ", "   " },
			{ "   ", "   ", "   ", "   ", "   ", "   ", "[_]", "[-]", "[_]", "   ", "   ", "   ", "   ", "   ", "   " },
			{ "   ", "   ", "   ", " R ", " R ", "   ", "[_]", "[-]", "[_]", "   ", " G ", " G ", "   ", "   ", "   " },
			{ "   ", "   ", "   ", " R ", " R ", "   ", "[_]", "[-]", "[_]", "   ", " G ", " G ", "   ", "   ", "   " },
			{ "   ", "   ", "   ", "   ", "   ", "   ", "[_]", "[-]", "[_]", "   ", "   ", "   ", "   ", "   ", "   " },
			{ "[_]", "[_]", "[_]", "[_]", "[_]", "[_]", "[_]", "[-]", "[_]", "[_]", "[_]", "[_]", "[_]", "[_]", "[_]" },
			{ "[_]", "[/]", "[/]", "[/]", "[/]", "[/]", "[/]", "   ", "[|]", "[|]", "[|]", "[|]", "[|]", "[|]", "[_]" },
			{ "[_]", "[_]", "[_]", "[_]", "[_]", "[_]", "[_]", "[=]", "[_]", "[_]", "[_]", "[_]", "[_]", "[_]", "[_]" },
			{ "   ", "   ", "   ", "   ", "   ", "   ", "[_]", "[=]", "[_]", "   ", "   ", "   ", "   ", "   ", "   " },
			{ "   ", "   ", "   ", " B ", " B ", "   ", "[_]", "[=]", "[_]", "   ", " Y ", " Y ", "   ", "   ", "   " },
			{ "   ", "   ", "   ", " B ", " B ", "   ", "[_]", "[=]", "[_]", "   ", " Y ", " Y ", "   ", "   ", "   " },
			{ "   ", "   ", "   ", "   ", "   ", "   ", "[_]", "[=]", "[_]", "   ", "   ", "   ", "   ", "   ", "   " },
			{ "   ", "   ", "   ", "   ", "   ", "   ", "[_]", "[=]", "[_]", "   ", "   ", "   ", "   ", "   ", "   " },
			{ "   ", "   ", "   ", "   ", "   ", "   ", "[_]", "[_]", "[_]", "   ", "   ", "   ", "   ", "   ",
					"   " }, };

	private Player currentPlayer;
	private Player otherPlayer;

	Game(String name1, String name2) {
		this.currentPlayer = new Player(name1, "R");
		this.otherPlayer = new Player(name2, "B");
	}

	Player setCurrentPlayer() {
		Player temp = this.currentPlayer;
		this.currentPlayer = this.otherPlayer;
		this.otherPlayer = temp;

		return this.currentPlayer;
	}

	Player getCurrentPlayer() {
		return currentPlayer;
	}

	void checkCell() {
		if (this.currentPlayer.getCurrentToken().getRowIndex() == this.otherPlayer.getCurrentToken().getRowIndex()
				&& this.currentPlayer.getCurrentToken().getColIndex() == this.otherPlayer.getCurrentToken()
						.getColIndex()) {
			this.otherPlayer.getCurrentToken().setColIndex(-1);
			this.otherPlayer.getCurrentToken().setRowIndex(-1);
			this.otherPlayer.getCurrentToken().setMoves();
			System.out.println("Жалко " + this.otherPlayer.getPlayerName() + "! " + this.currentPlayer.getPlayerName()
					+ " те нагази. Пионката ти започва отначало!");
		}

	}

	void setLayout() {
		if (this.currentPlayer.getSign() == "R") {
			switch (this.currentPlayer.getCurrentToken().getNumber()) {
			case 1:
				if (this.currentPlayer.getCurrentToken().getMoves() > 0) {
					this.layout[3][3] = "   ";
				} else {
					this.layout[3][3] = " R ";
				}
				break;
			case 2:
				if (this.currentPlayer.getCurrentToken().getMoves() > 0) {
					this.layout[3][4] = "   ";
				} else {
					this.layout[3][4] = " R ";
				}
				break;
			case 3:
				if (this.currentPlayer.getCurrentToken().getMoves() > 0) {
					this.layout[4][3] = "   ";
				} else {
					this.layout[4][3] = " R ";
				}
				break;
			case 4:
				if (this.currentPlayer.getCurrentToken().getMoves() > 0) {
					this.layout[4][4] = "   ";
				} else {
					this.layout[4][4] = " R ";
				}
				break;
			}

		} else if (this.currentPlayer.getSign() == "B") {
			switch (this.currentPlayer.getCurrentToken().getNumber()) {
			case 1:
				if (this.currentPlayer.getCurrentToken().getMoves() > 0) {
					this.layout[10][3] = "   ";
				} else {
					this.layout[10][3] = " B ";
				}
				break;
			case 2:
				if (this.currentPlayer.getCurrentToken().getMoves() > 0) {
					this.layout[10][4] = "   ";
				} else {
					this.layout[10][4] = " B ";
				}
				break;
			case 3:
				if (this.currentPlayer.getCurrentToken().getMoves() > 0) {
					this.layout[11][3] = "   ";
				} else {
					this.layout[11][3] = " B ";
				}
				break;
			case 4:
				if (this.currentPlayer.getCurrentToken().getMoves() > 0) {
					this.layout[11][4] = "   ";
				} else {
					this.layout[11][4] = " B ";
				}
				break;
			}

		}

	}

	void printLayout() {
		for (int i = 0; i < this.layout.length; i++) {
			for (int j = 0; j < this.layout[i].length; j++) {
				if (this.currentPlayer.getCurrentToken().getRowIndex() == i
						&& this.currentPlayer.getCurrentToken().getColIndex() == j) {
					System.out.print("[" + this.currentPlayer.getSign() + "]");
				} else if (this.otherPlayer.getCurrentToken().getRowIndex() == i
						&& this.otherPlayer.getCurrentToken().getColIndex() == j) {
					System.out.print("[" + this.otherPlayer.getSign() + "]");
				} else {
					System.out.print(this.layout[i][j]);
				}
			}
			System.out.println();
		}
		System.out.println();
	}

}
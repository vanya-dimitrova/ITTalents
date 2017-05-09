package NeSeSurdiChoveche;

public class Token {

	private int rowIndex = -1;
	private int colIndex = -1;
	private int moves = 0;
	private int number;

	Token(int number) {
		this.number = number;
	}

	void setRowIndex(int rowIndex) {
		this.rowIndex = rowIndex;
	}

	int getRowIndex() {
		return rowIndex;
	}

	void setColIndex(int colIndex) {
		this.colIndex = colIndex;
	}

	int getColIndex() {
		return colIndex;
	}

	void setMoves() {
		if (this.rowIndex == -1 || this.colIndex == -1) {
			this.moves = 0;
		} else {
			this.moves++;
		}
	}

	int getMoves() {
		return moves;
	}

	int getNumber() {
		return this.number;
	}

}

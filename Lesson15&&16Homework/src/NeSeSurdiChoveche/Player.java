package NeSeSurdiChoveche;

import java.util.Random;

public class Player {

	private String playerName;
	private String sign;
	private final Token token1;
	private final Token token2;
	private final Token token3;
	private final Token token4;
	private Token currentToken;
	private int dieResult;

	Player(String name, String sign) {
		this.playerName = name;
		this.sign = sign;
		int digit = 1;
		this.token1 = new Token(digit);
		digit++;
		this.token2 = new Token(digit);
		digit++;
		this.token3 = new Token(digit);
		digit++;
		this.token4 = new Token(digit);
		this.currentToken = this.token1;
	}

	String getPlayerName() {
		return this.playerName;
	}

	String getSign() {
		return this.sign;
	}

	Token getCurrentToken() {
		return currentToken;
	}

	int rollDie() {
		return this.dieResult = new Random().nextInt(6) + 1;
	}

	int getDieResult() {
		return dieResult;
	}

	void moveTokenOutOfStart() {
		if (this.sign == "R") {
			this.currentToken.setRowIndex(6);
			this.currentToken.setColIndex(0);
			this.currentToken.setMoves();
		} else if (this.sign == "B") {
			this.currentToken.setRowIndex(14);
			this.currentToken.setColIndex(6);
			this.currentToken.setMoves();
		} else if (this.sign == "Y") {
			this.currentToken.setRowIndex(8);
			this.currentToken.setColIndex(14);
			this.currentToken.setMoves();
		} else {
			this.currentToken.setRowIndex(0);
			this.currentToken.setColIndex(8);
			this.currentToken.setMoves();
		}

	}

	void moveToken() {
		for (int i = 0; i < dieResult; i++) {
			switch (this.currentToken.getMoves()) {
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
			case 12:
			case 43:
			case 44:
			case 45:
			case 46:
			case 47:
			case 48:
			case 55:
				if (this.sign == "R") {
					this.currentToken.setRowIndex(this.currentToken.getRowIndex() - 1);
					this.currentToken.setMoves();
					break;
				} else if (this.sign == "B") {
					this.currentToken.setColIndex(this.currentToken.getColIndex() - 1);
					this.currentToken.setMoves();
					break;
				}
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 13:
			case 14:
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 56:
			case 57:
			case 58:
			case 59:
			case 60:
			case 61:
			case 62:
				if (this.sign == "R") {
					this.currentToken.setColIndex(this.currentToken.getColIndex() + 1);
					this.currentToken.setMoves();
					break;
				} else if (this.sign == "B") {
					this.currentToken.setRowIndex(this.currentToken.getRowIndex() - 1);
					this.currentToken.setMoves();
					break;
				}
			case 15:
			case 16:
			case 17:
			case 18:
			case 19:
			case 20:
			case 27:
			case 28:
			case 35:
			case 36:
			case 37:
			case 38:
			case 39:
			case 40:
				if (this.sign == "R") {
					this.currentToken.setRowIndex(this.currentToken.getRowIndex() + 1);
					this.currentToken.setMoves();
					break;
				} else if (this.sign == "B") {
					this.currentToken.setColIndex(this.currentToken.getColIndex() + 1);
					this.currentToken.setMoves();
					break;
				}
			case 29:
			case 30:
			case 31:
			case 32:
			case 33:
			case 34:
			case 41:
			case 42:
			case 49:
			case 50:
			case 51:
			case 52:
			case 53:
			case 54:
				if (this.sign == "R") {
					this.currentToken.setColIndex(this.currentToken.getColIndex() - 1);
					this.currentToken.setMoves();
					break;
				} else if (this.sign == "B") {
					this.currentToken.setRowIndex(this.currentToken.getRowIndex() + 1);
					this.currentToken.setMoves();
					break;
				}
			}
		}
	}

	Token switchTokens() {
		if (this.currentToken == this.token1) {
			this.currentToken = this.token2;
		} else if (this.currentToken == this.token2) {
			this.currentToken = this.token3;
		} else if (this.currentToken == this.token3) {
			this.currentToken = this.token4;
		} else if (this.currentToken == this.token4) {
			this.currentToken = null;
		}
		return this.currentToken;
	}

}

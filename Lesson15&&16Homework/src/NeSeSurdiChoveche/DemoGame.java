package NeSeSurdiChoveche;

public class DemoGame {

	public static void main(String[] args) throws InterruptedException {

		Game game = new Game("Гошо", "Пешо");

		while (game.getCurrentPlayer().getCurrentToken() != null) {
			Thread.sleep(500);
			game.getCurrentPlayer().rollDie();
			System.out.println("Играе " + game.getCurrentPlayer().getPlayerName()
					+ " със зар " + game.getCurrentPlayer().getDieResult() + "!");
			
			if (game.getCurrentPlayer().getCurrentToken().getMoves() == 0) {
				if (game.getCurrentPlayer().getDieResult() < 6) {
					System.out.println("Трябва ти зар 6, за да извадиш пионка!"+"\n");
					game.setLayout();
					game.printLayout();
					game.setCurrentPlayer();
				} else {
					game.getCurrentPlayer().moveTokenOutOfStart();
					System.out.println("Изважда пионка!"+"\n");
					game.checkCell();
					game.setLayout();
					game.printLayout();
					game.setCurrentPlayer();
				}
				
			} else if ((game.getCurrentPlayer().getCurrentToken().getMoves() > 0
					&& game.getCurrentPlayer().getCurrentToken().getMoves() < 57)
					|| ((game.getCurrentPlayer().getCurrentToken().getMoves()
							+ game.getCurrentPlayer().getDieResult()) < 63)) {
				System.out.print(game.getCurrentPlayer().getPlayerName() + " премества пионката си!");
				if (game.getCurrentPlayer().getDieResult() == 6) {
					System.out.println(" Имаш 6, играй пак!"+"\n");
					game.getCurrentPlayer().moveToken();
					game.checkCell();
					game.setLayout();
					game.printLayout();
				} else {
					game.getCurrentPlayer().moveToken();
					game.checkCell();
					game.setLayout();
					System.out.println();
					System.out.println();
					game.printLayout();
					game.setCurrentPlayer();
				}
				
			} else if ((game.getCurrentPlayer().getDieResult()
					+ game.getCurrentPlayer().getCurrentToken().getMoves()) > 63) {
				System.out.println(game.getCurrentPlayer().getPlayerName()
						+ ", трябва ти " + (63 - game.getCurrentPlayer().getCurrentToken().getMoves())
						+ " за да завършиш кръга!"+"\n");
				game.setCurrentPlayer();
				game.printLayout();
				
			} else if ((game.getCurrentPlayer().getDieResult()
					+ game.getCurrentPlayer().getCurrentToken().getMoves()) == 63) {
				game.getCurrentPlayer().moveToken();
				if (game.getCurrentPlayer().getCurrentToken().getNumber() != 4) {
					if (game.getCurrentPlayer().getDieResult() < 6) {
						System.out.println("Браво " + game.getCurrentPlayer().getPlayerName()
										+ ",пионката завърши кръга! Ще играеш с нова пионка!"+"\n");
						game.getCurrentPlayer().switchTokens();
						game.setLayout();
						game.printLayout();
						game.setCurrentPlayer();
					} else {
						System.out
								.println("Браво " + game.getCurrentPlayer().getPlayerName()
										+ ",пионката завърши кръга! Имаш 6, играй пак с нова пионка!"+"\n");
						game.getCurrentPlayer().switchTokens();
						game.setLayout();
						game.printLayout();
					}
				} else {
					System.out.print(game.getCurrentPlayer().getPlayerName()
							+" мести за последно.....иии... ПОБЕДИТЕЛЯТ e "+game.getCurrentPlayer().getPlayerName());
					game.getCurrentPlayer().switchTokens();
				}
			}

		}

	}

}

package observers;

import nature.Nature.NatureObserver;

public class Giraffe implements NatureObserver{

	@Override
	public void react(Event e) {
		switch (e) {
		case FLOOD:
			System.out.println("Giraffe shakes head.");
			break;
		case FIRE:
			System.out.println("Giraffe burns");
			break;
		case EARTHQUAKE:
			System.out.println("Giraffe shakes head.");
			break;
		default:
			break;
		}
	}

}

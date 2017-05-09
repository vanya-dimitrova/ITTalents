package observers;

import nature.Nature.NatureObserver;

public class Fish implements NatureObserver{

	@Override
	public void react(Event e) {
			System.out.println("Fish doesnt give a fuck.");
	}

}

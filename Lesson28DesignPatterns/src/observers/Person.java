package observers;

import nature.Nature.NatureObserver;

public class Person implements NatureObserver{

	@Override
	public void react(Event e) {
		switch (e) {
		case FLOOD:
			System.out.println("Person drowns");
			break;
		case FIRE:
			System.out.println("Person burns");
			break;
		case EARTHQUAKE:
			System.out.println("Person shakes");
			break;
		default:
			break;
		}
	}

}

package nature;

import java.util.ArrayList;
import java.util.List;

import nature.Nature.NatureObserver.Event;

public class Nature {
	
	public interface NatureObserver{
		enum Event {FIRE, FLOOD, EARTHQUAKE}
		
		void react(Event event);
	}
	

	private List<NatureObserver> observers;
	private static Nature instance;
	private Nature(){
		this.observers = new ArrayList();
	}
	
	public static Nature getInstance(){
		if(instance == null){
			instance = new Nature();
		}
		return instance;
	}
	
	public void subscribe(NatureObserver obs){
		this.observers.add(obs);
	}
	
	public void unsubscribe(NatureObserver obs){
		this.observers.remove(obs);
	}
	
	private void notifyObservers(Event e){
		for(NatureObserver o : observers){
			o.react(e);
		}
	}
	
	public void potop(){
		System.out.println("Nature is under water!");
		notifyObservers(Event.FLOOD);
	}
	
	public void pojar(){
		System.out.println("Nature is on fire!");
		notifyObservers(Event.FIRE);
	}
	
	public void zemetrus(){
		System.out.println("Nature is shaking!");
		notifyObservers(Event.EARTHQUAKE);
	}
}

package ovci;

public class MarkersDemo {

	String[] markers = new String[10];
	
	public static void main(String[] args) {
		
		MarkersDemo demo = new MarkersDemo();
		try {
			demo.giveMeMarker();
		} catch (NotEnoughMarkersException e) {
			System.out.println("Damn. Have to buy markers because - " + e.getCause().getClass().getName());
		}
	}

	private String giveMeMarker() throws NotEnoughMarkersException {
		try{
			String marker = markers[0];
			System.out.println(marker.length());
			return marker;
		}
		catch(NullPointerException e){
			throw new NotEnoughMarkersException("Not enough markers. Buy more markers", e);
		}
	}
	
	
}

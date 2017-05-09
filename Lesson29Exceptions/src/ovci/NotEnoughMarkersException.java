package ovci;

public class NotEnoughMarkersException extends Exception{

	public NotEnoughMarkersException(String msg) {
		super(msg);
	}
	
	public NotEnoughMarkersException(String msg, Throwable cause) {
		super(msg, cause);
	}
}

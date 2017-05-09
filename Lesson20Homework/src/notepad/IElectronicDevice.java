package notepad;

public interface IElectronicDevice extends ISecuredNotepad {
	
	int start();
	
	int stop();
	
	boolean isStarted();

}

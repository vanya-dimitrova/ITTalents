package notepad;

public class NotepadTwoDemo {

	public static void main(String[] args) {


		SimpleNotepad yourNotepad = new SimpleNotepad(5);
		SecuredNotepad myNotepad = new SecuredNotepad("8888", 5);
		IElectronicDevice itsNotepad = new ElectronicSecuredNotepad("8888", 4);
		
		itsNotepad.start();
		itsNotepad.addText(1, "Hello");
		itsNotepad.viewAllPages();
		itsNotepad.stop();
		itsNotepad.viewAllPages();
		
		yourNotepad.addText(1, "we1re");
		yourNotepad.printAllPagesWithDigits();
		
		myNotepad.addText(1, "word");
		myNotepad.addText(2, "word 2017");
		myNotepad.searchWord("word");
		myNotepad.printAllPagesWithDigits();
		
		

	}

}

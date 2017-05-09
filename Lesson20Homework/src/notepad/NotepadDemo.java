package notepad;

public class NotepadDemo {

	public static void main(String[] args) {
		
		SimpleNotepad yourNotepad = new SimpleNotepad(5);
		SecuredNotepad myNotepad = new SecuredNotepad("A2aww", 5);
		ISecuredNotepad notepad = new SecuredNotepad("A2aww", 3);
		SimpleNotepad hisNotepad = new SecuredNotepad("A2aww", 5);
		
		
		yourNotepad.setHeadline(1, "Monday");
		yourNotepad.addText(1, "Hello");
		yourNotepad.viewAllPages();
		
		yourNotepad.addText(1, "Java");
		yourNotepad.viewAllPages();
		
		yourNotepad.replaceText(1, 3, 7, "mi"+"\n"+"O");
		yourNotepad.viewAllPages();
		
		yourNotepad.deleteText(1, 1, 4);
		yourNotepad.viewAllPages();
		
		hisNotepad.setHeadline(1, "Wednesday");
		hisNotepad.viewAllPages();
		
		
		
		
		
	
	
		
	}

}

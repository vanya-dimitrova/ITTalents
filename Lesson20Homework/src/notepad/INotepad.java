package notepad;

public interface INotepad {
	
	
	
	
	void setHeadline(int pageNumber, String text);
	
	void addText(int pageNumber, String text);
	
	void replaceText(int pageNumber, int start, int end, String text);
	
	void deleteText(int pageNumber, int start, int end);
	
	void searchWord(String word);
	
	void printAllPagesWithDigits();
	
	void viewAllPages();

}

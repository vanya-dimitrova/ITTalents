package notepad;

public class SimpleNotepad implements INotepad {

	private Page[] pages;

	SimpleNotepad(int numberOfPages) {
		if (numberOfPages > 0) {
			this.pages = new Page[numberOfPages];
			for (int i = 0; i < pages.length; i++) {
				this.pages[i] = new Page();
			}
		}
	}

	Page[] getPages() {
		return pages;
	}

	@Override
	public void setHeadline(int pageNumber, String text) {
		if (this.isPageNumberValid(pageNumber) && this.isGetPageValid()) {
			this.pages[pageNumber - 1].setHeadline(text);
		}

	}

	@Override
	public void addText(int pageNumber, String text) {
		if (this.isPageNumberValid(pageNumber) && this.isGetPageValid()) {
			this.pages[pageNumber - 1].addText(text);
		}
	}

	@Override
	public void replaceText(int pageNumber, int start, int end, String text) {
		if (this.isPageNumberValid(pageNumber) && this.pages[pageNumber].isParameterValid(start, end)
				&& this.isGetPageValid()) {
			this.pages[pageNumber - 1].getText().replace(start, end, text);
		}
	}

	@Override
	public void deleteText(int pageNumber, int start, int end) {
		if (this.isPageNumberValid(pageNumber) && this.pages[pageNumber].isParameterValid(start, end)
				&& this.isGetPageValid()) {
			this.pages[pageNumber - 1].deleteText(start, end);
		}
	}

	@Override
	public void searchWord(String word) {
		if (this.isGetPageValid()) {
			for (int i = 0; i < pages.length; i++) {
				if (this.pages[i].searchWord(word)) {
					System.out.println("Page " + (i + 1) + " contains the word '" + word + "'.");
				}
			}
		}

	}

	@Override
	public void printAllPagesWithDigits() {
		if (this.isGetPageValid()) {
			for (int i = 0; i < this.pages.length; i++) {
				if (this.pages[i].containsDigits()) {
					this.pages[i].viewPage();
				}
			}
		}

	}

	@Override
	public void viewAllPages() {
		for (int i = 0; i < this.pages.length; i++) {
			if (this.pages[i].getText() != null || this.pages[i].getHeadline() != null && this.isGetPageValid()) {
				this.pages[i].viewPage();
				System.out.println();
			}
		}

	}

	private boolean isPageNumberValid(int pageNumber) {
		if (pageNumber > 0 && pageNumber <= this.pages.length) {
			return true;
		} else {
			return false;
		}
	}

	private boolean isGetPageValid() {
		if (this.getPages() != null) {
			return true;
		} else {
			return false;
		}
	}

}

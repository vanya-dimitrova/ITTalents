package notepad;

public class ElectronicSecuredNotepad extends SecuredNotepad implements ISecuredNotepad, IElectronicDevice {

	private int power = 0;

	public ElectronicSecuredNotepad(String password, int numberOfPages) {
		super(password, numberOfPages);
	}

	@Override
	public int start() {
		return power = 1;
	}

	@Override
	public int stop() {
		return power = 0;
	}

	@Override
	Page[] getPages() {
		if (this.isStarted()) {
			return super.getPages();
		} else {
			return null;
		}
	}

	@Override
	public boolean validatePassword() {
		if (this.isStarted()) {
			return super.validatePassword();
		} else {
			return false;
		}
	}

	@Override
	public void setHeadline(int pageNumber, String text) {
		if (this.isStarted()) {
			super.setHeadline(pageNumber, text);
		} else {
			System.out.println("Device is not switched on!");
		}
	}

	@Override
	public void addText(int pageNumber, String text) {
		if (this.isStarted()) {
			super.addText(pageNumber, text);
		} else {
			System.out.println("Device is not switched on!");
		}
	}

	@Override
	public void replaceText(int pageNumber, int start, int end, String text) {
		if (this.isStarted()) {
			super.replaceText(pageNumber, start, end, text);
		} else {
			System.out.println("Device is not switched on!");
		}
	}

	@Override
	public void deleteText(int pageNumber, int start, int end) {
		if (this.isStarted()) {
			super.deleteText(pageNumber, start, end);
		} else {
			System.out.println("Device is not switched on!");
		}
	}

	@Override
	public void searchWord(String word) {
		if (this.isStarted()) {
			super.searchWord(word);
		} else {
			System.out.println("Device is not switched on!");
		}
	}

	@Override
	public void printAllPagesWithDigits() {
		if (this.isStarted()) {
		super.printAllPagesWithDigits();
		} else {
			System.out.println("Device is not switched on!");
		}
	}

	@Override
	public void viewAllPages() {
		if (this.isStarted()) {
		super.viewAllPages();
		} else {
			System.out.println("Device is not switched on!");
		}
	}

	@Override
	public boolean isStarted() {
		if (this.power == 1) {
			return true;
		} else {
			return false;
		}
	}

}

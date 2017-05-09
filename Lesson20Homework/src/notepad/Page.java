package notepad;

public class Page {

	private String headline;
	private StringBuilder text = new StringBuilder();

	void setHeadline(String headline) {
		if (headline != null) {
			this.headline = headline;
		}
	}

	String getHeadline() {
		return headline;
	}

	StringBuilder getText() {
		return this.text;

	}

	void addText(String text) {
		this.text.append("\n" + text);
	}

	void deleteText(int start, int end) {
		if (this.isParameterValid(start, end)) {
			this.text.delete(start, end);
		}
	}

	boolean searchWord(String word) {
		if (this.text != null) {
			return this.text.toString().contains(word);
		} else {
			return false;
		}
	}

	boolean containsDigits() {
		if (this.text != null) {
			for (int i = 0; i < this.text.length(); i++) {
				if (this.text.charAt(i) >= 48 && this.text.charAt(i) <= 57) {
					return true;
				}
			}
		} else {
			return false;
		}
		return false;
	}

	void viewPage() {
		if (this.headline != null) {
			System.out.println(this.headline + "\n");
		}
		if (this.text != null) {
			System.out.println(this.text);
		}
	}

	boolean isParameterValid(int start, int end) {
		if (this.text != null && start >= 0 && start < this.text.length() - 1 && end > 0 && end < this.text.length()) {
			return true;
		} else {
			return false;
		}
	}

}

package notepad;

import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad implements ISecuredNotepad {

	private String password;

	SecuredNotepad(String password, int numberOfPages) {
		super(numberOfPages);
		int a = 0;
		if (password.length() > 4) {
			for (int i = 0; i < password.length(); i++) {
				if (password.charAt(i) >= 48 && password.charAt(i) <= 57) {
					a = 1;
				}
			}
			if (a == 1) {
				for (int i = 0; i < password.length(); i++) {
					if (password.charAt(i) >= 65 && password.charAt(i) <= 90) {
						a = 2;
					}
				}
				if (a == 2) {
					for (int i = 0; i < password.length(); i++) {
						if (password.charAt(i) >= 97 && password.charAt(i) <= 122) {
							a = 3;
						}
					}
					if (a == 3) {
						this.password = password;
					}
				}
			}
		} else {
			throw new IllegalArgumentException("Weak password.");
		}

	}

	// if necessary to validate password when using super class methods
	// we override them too

	@Override
	Page[] getPages() {
		if (this.validatePassword()) {
			return super.getPages();
		} else {
			System.out.println("No access granted.");
			return null;
		}
	}

	@Override
	public boolean validatePassword() {
		System.out.println("Enter password");
		if (new Scanner(System.in).nextLine().equals(this.password)) {
			return true;
		} else {
			return false;
		}
	}

}

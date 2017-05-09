package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File photoWorld = new File("D:" + File.separator + "Maria" + File.separator + "My Documents" + File.separator + "JavaMyStuff" + File.separator
				+ "IT Java" + File.separator + "Michelle data.txt");

		// reads file, no cyrillic recognition
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(photoWorld);
			int reader;
			while ((reader= fis.read()) != -1) {
				System.out.print((char) reader);
			}
		} catch (IOException e) {
			System.out.println("There is some problem with this file!");
			e.printStackTrace();
		}

		FileOutputStream fos = null;

		// writes on the same file, no Cyrillic recognition
		try {
			fos = new FileOutputStream(photoWorld, true);
			String text = "Hello Java";
			for (char letter : text.toCharArray()) {
				try {
					fos.write(letter);
				} catch (IOException e) {
					System.out.println("It can't write");
					// e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			// e.printStackTrace();
		}

		// reads again the same file, byte reading, no cyrillic recognition
		try {
			fis = new FileInputStream(photoWorld);
			int reader = fis.read();
			while (reader != -1) {
				System.out.print((char) reader);
				reader = fis.read();
			}
		} catch (FileNotFoundException e) {
			// e.printStackTrace();
		} catch (IOException e) {
			// e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {

				}
			}
		}
		
		

		File midProject = new File("D:" + File.separator + "Maria" + File.separator + "My Documents" + File.separator + "JavaMyStuff" + File.separator
				+ "IT Java" + File.separator + "MidProject");
		for (File files : midProject.listFiles()) {
			System.out.println(files.getName());
		}

		// gets files which start with a specific letter recursively
		File a = new File("C:" + File.separator + "Users" + File.separator + "JavaMyStuff" + File.separator + "IT Java"
				+ File.separator + "MidProject");

		getFiles(a);

	}

	static void getFiles(File a) {
		if (a.exists() && a.isDirectory()) {
			for (File file : a.listFiles()) {
				if (file.exists() && file.isDirectory()) {
					getFiles(file);
				}
				if (file.getName().startsWith("P")) {
					System.out.println(file.getName());
				}

			}

		}
	}

}

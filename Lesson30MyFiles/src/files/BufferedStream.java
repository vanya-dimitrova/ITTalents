package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class BufferedStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File text = new File("D:" + File.separator + "Maria" + File.separator + "My Documents" + File.separator + "JavaMyStuff" + File.separator
				+ "IT Java" + File.separator + "Michelle data.txt");
		
	
		if (text.exists()){
			BufferedReader buffer = null;
			try {
				buffer = new BufferedReader(new FileReader(text));
				try {
					String b = buffer.readLine();
					while((buffer.readLine() != null)){
						System.out.println(b);
						 b = buffer.readLine();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
					
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			try {
				buffer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		}

	}

}

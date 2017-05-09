package files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File photoWorld = new File("D:" + File.separator + "Maria" + File.separator + "My Documents" + File.separator + "JavaMyStuff" + File.separator
				+ "IT Java" + File.separator + "Michelle data.txt");
		
		FileWriter characterWriter = null;
		FileReader fileReader = null;
		
		try {
			characterWriter = new FileWriter(photoWorld, true);
			String text = "А сега?";
			for(char c: text.toCharArray()){
				characterWriter.append(c);
			}
		}
		catch(IOException e){
			
		}
		finally {
			if(characterWriter != null){
			try {
				characterWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
			//	e.printStackTrace();
			}
		}
		}
		
		
		// reads characters, cyrillic recognition
		int b = 0;
		try {
			fileReader = new FileReader(photoWorld);
			while((b = fileReader.read()) != -1){
				System.out.print((char)b);
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		finally{
			try {
				fileReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		

    }
}

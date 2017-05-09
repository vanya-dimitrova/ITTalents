package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.thoughtworks.xstream.XStream;


 public class DemoObjectStream {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
			
			
			MyObject obj = new MyObject();
			File objFile = new File("D:" + File.separator + "Maria" + File.separator + "My Documents" + File.separator + "JavaMyStuff" + File.separator
					+ "IT Java" + File.separator + "Нов текстов документ.txt");
			try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(objFile))) {
				objFile.createNewFile();
				output.writeObject(obj);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
			ObjectInputStream input = new ObjectInputStream(new FileInputStream(objFile));
			
			MyObject obj1 = (MyObject)input.readObject();
			System.out.println(obj1.password);
			
			XStream xs = new XStream();
			xs.alias("MyObject", MyObject.class);
			String a = xs.toXML(obj);
			System.out.println(a);
			
			MyObject b = (MyObject)xs.fromXML(a);
			
			System.out.println(b.password);
			
			

	}

}

package files;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Scanner_PrinterStream {

	public static void main(String[] args) {

		File photoWorld = new File("D:" + File.separator + "Maria" + File.separator + "My Documents" + File.separator + "JavaMyStuff" + File.separator
				+ "IT Java" + File.separator + "Michelle data3.txt");

		Scanner sc = null;
		try {
			photoWorld.createNewFile();
			sc = new Scanner(photoWorld);
			while(sc.hasNext()){
				System.out.print(sc.nextLine());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			sc.close();
		}
		
		PrintStream printer = null;
		try {
			printer = new PrintStream(photoWorld);
			printer.println("Не знам дали става");
			printer.append("Eex");
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			printer.close();
		}
		
		
		try {
			sc = new Scanner(photoWorld);
			while(sc.hasNext()){
				System.out.print(sc.nextLine());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			sc.close();
		}

	}

}

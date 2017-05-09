package countChars;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class AnyNumberOfThreads {

	public static void main(String[] args) {
		
		
		long start = System.nanoTime();
		long start1 = System.currentTimeMillis();


		File voinaIMir = new File("D:" + File.separator + "Maria" + File.separator + "Downloads" + File.separator
				+ "Lev_Tolstoj_-_Vojna_i_mir-.txt");
		
		final int[] counter = new int[1];
		Thread[] threads = createThreads(voinaIMir, 20, counter);
	
		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
		}
		for (int i = 0; i < threads.length; i++) {
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		long end = System.nanoTime();
		long end1 = System.currentTimeMillis();
		System.out.println("File checking lasted " + ((end - start)/(100*1000*1000))/10d + " second(s).");
		System.out.println("Comma sign(s) found in text - " + counter[0] + ".");
		System.out.println("File checking lasted " + ((end1 - start1)/1000d
				) + " second(s).");
		System.out.println((end1/1000)/60);

	}
	
	
	static Thread[] createThreads(File file, int threadNumber, int[] counter) {
		StringBuilder[] parts = splitText(file, threadNumber);
		Thread[] arrThreads = new Thread[threadNumber];
		for (int i = 0; i < parts.length; i++) {
			int c = i;
			Runnable reader = new Runnable() {

				@Override
				public void run() {
					int commas = 0;
					for (int j = 0; j < parts[c].length(); j++) {
						if (parts[c].charAt(j) == 44) {
							commas++;
						}
					}
					Object x = new Object();
					synchronized (x) {
						counter[0] += commas;
					}
				}
			};
			arrThreads[i] = new Thread(reader);
		}
		return arrThreads;
	}

	

	static StringBuilder[] splitText(File file, int partsOfText) {
		StringBuilder[] splitted = new StringBuilder[partsOfText];
		StringBuilder onePart = new StringBuilder();
		try (FileReader reader = new FileReader(file)) {
			int size = (int) (file.length() / partsOfText);
			int b = 0;
			int decreaser = partsOfText;
			while ((b = reader.read()) != -1) {
				if (onePart.length() == 0 || onePart.length() < size) {
					onePart.append((char) b);
					
				} else {
					splitted[partsOfText - decreaser] = onePart;
					decreaser--;
					onePart = new StringBuilder();
					onePart.append((char) b);
				}
			}
			if(onePart != null && onePart.length() != 0){
				splitted[partsOfText - decreaser] = onePart;
			}
			else{
				onePart.append(' ');
				splitted[partsOfText - decreaser] = onePart;
			}
		} catch (IOException e) {
			System.out.println("Smth wrong!");
		}
		return splitted;
	}

	
}

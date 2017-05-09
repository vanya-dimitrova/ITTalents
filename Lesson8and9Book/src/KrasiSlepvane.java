
public class KrasiSlepvane {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		System.out.println("Start");
		StringBuilder h = new StringBuilder();
		for(int i = 0; i < 2000000; i++){
			h.append("H");
		}
		System.out.println("End");
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		
		
	}
}

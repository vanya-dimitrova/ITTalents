
public class Book8_235_8 {

	public static void main(String[] args) {
		// void method no args
		
		showDividedByFive();

	}
	static void showDividedByFive(){
		for (int i = 1; i <= 100; i++) {
			if(i % 5 == 0){
				System.out.print(i+";");
			}
			
		}
	}

}

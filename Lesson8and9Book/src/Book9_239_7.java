
public class Book9_239_7 {

	public static void main(String[] args) {
		// romb from stars and signs

		int a = 12;
		int length = a;
		int frame = 1;
		int inside = a;
		
       // print first half
		for (int i = 0; i < a; i++) {
			for (int j = 1; j <= length; j++) {
				if (j == length || j == inside) {
					System.out.print(frame);
				}
				if (j < length && j > inside) {
					System.out.print("*");
				}if(j < inside){
					System.out.print(" ");
				}
			}
			System.out.println();
			// change dimensions
			if(frame == 9){
				length = length - 2;
			}
			length++;
			frame++;
			inside--;
		}
		// need to change dimensions because of operators ++ && -- in the upper part
		// and because we need to start a narrower row
		length = length - 2;
		frame = frame - 2;
		inside = inside + 2;
		
		//print second half
		for (int i = 0; i < a - 1; i++) {
			for (int j = 1; j <= length; j++) {
				if (j == length || j == inside) {
					System.out.print(frame);
				}
				if (j < length && j > inside) {
					System.out.print("*");
				}if(j < inside){
					System.out.print(" ");
				}
			}
			System.out.println();
			if(frame == 10){
				length = length + 2;
			}
			length--;
			frame--;
			inside++;
		}


	}

}


public class Book11_241_1 {

	public static void main(String[] args) {
		
		char[][] sheet = {
				{'b','b','b','b','b','b','b','b','b','b','b','b'},
				{'b',' ',' ',' ',' ','b',' ','b',' ',' ',' ','b'},
				{'b',' ',' ','b','b','b',' ','b',' ',' ',' ','b'},
				{'b',' ',' ','b',' ',' ',' ','b',' ',' ',' ','b'},
				{'b','b','b','b',' ',' ',' ','b',' ',' ',' ','b'},
				{'b',' ',' ',' ',' ',' ',' ','b','b','b','b','b'},
				{'b',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','b'},
				{'b',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','b'},
				{'b','b','b','b','b','b',' ',' ',' ',' ',' ','b'},
				{'b',' ',' ',' ',' ','b','b',' ',' ',' ',' ','b'},
				{'b',' ',' ',' ',' ',' ','b',' ',' ',' ',' ','b'},
				{'b','b','b','b','b','b','b','b','b','b','b','b'}
		};
		
		paint(sheet, 2, 2);

		for (int i = 0; i < sheet.length; i++) {
			for (int j = 0; j < sheet.length; j++) {
				System.out.print(sheet[i][j]);
			}
			System.out.println();
		}
	}
	
	static void paint(char[][] sheet, int i, int j){
		if(sheet[i][j] == 'b'){
			return;
		}
		sheet[i][j] = 'r';
		if((j+1 < sheet[i].length) && (sheet[i][j+1] == ' ')){
			paint(sheet, i, j+1);
		}
		if(j-1 >= 0 && sheet[i][j-1] == ' '){
			paint(sheet, i, j-1);
		}
		if((i+1 < sheet.length) && (sheet[i+1][j] == ' ')){
			paint(sheet, i+1, j);
		}
		if((i-1 >= 0) && (sheet[i-1][j] == ' ')){
			paint(sheet, i-1, j);
		}
	}
}
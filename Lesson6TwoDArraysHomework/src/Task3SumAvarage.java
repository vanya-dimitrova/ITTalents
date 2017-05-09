
public class Task3SumAvarage {

	public static void main(String[] args) {
		
		int[][] arr = {{2, 5, 9, 2}, {3, 7, 4, 6}, {1, 9, 6, 8}};
		int sum = 0;
		double avr = 0d;
		for(int row = 0; row < arr.length; row++){
			for(int col = 0; col < 4; col++){
				sum+=arr[row][col];
				avr = sum/(arr.length*(col + 1));
				
			}
		}
		System.out.println("Suma na stoinostite na masiva: "+sum);
		System.out.println("Srednoaritmetichna stoinost za masiva: "+avr);
		
		

	}

}

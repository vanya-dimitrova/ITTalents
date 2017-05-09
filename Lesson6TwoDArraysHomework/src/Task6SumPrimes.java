
public class Task6SumPrimes {

	public static void main(String[] args) {
		
		int[][] arr = {{1, 6, 11, 2, 13, 4}, {11, 5, 2, 13, 42, 51}, {9, 5, 3, 14, 55, 6}, {8, 14, 42, 53, 6, 17}, {18, 4, 2, 15, 61, 7}, {9, 15, 31, 47, 5, 16}};
		int row = 0;
		int col = 0;
		int sum =0;
		int sumFinal = 0;
		
		for(row = 1; row < arr.length; row+=2){
			for(col = 0; col < arr.length; col++){
				sum+=arr[row][col];
				System.out.print(arr[row][col]+" ");
			}
			System.out.print("suma = "+sum);
			sumFinal+=sum;
			sum = 0;
			System.out.println();
		}
		System.out.println("Suma na elementite   = "+sumFinal);
		

	}

}

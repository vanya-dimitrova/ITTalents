
public class Task7SumWithOneLoop {

	public static void main(String[] args) {
		
		int[][] arr = {{1, 6, 11, 2, 13, 4},
				      {11, 5, 2, 13, 42, 51},
				      {9, 5, 3, 14, 55, 6},
				      {8, 14, 42, 53, 6, 17},
				      {18, 4, 2, 15, 61, 7},
				      {9, 15, 31, 47, 5, 16}
				      };
		int row = 0;
		int col = 0;
		int colOdd = 1;
		int sum = 0;
		int sumFinal = 0;
		
		for(row = 0; row < arr.length; row++){
			if(row%2 == 0){
			System.out.print(arr[row][col]+" ");
			sum+=arr[row][col];
			col+=2;
			System.out.print(arr[row][col]+" ");
			sum+=arr[row][col];
			col+=2;
			System.out.print(arr[row][col]+" ");
			sum+=arr[row][col];
			System.out.print(" = "+sum);
			}
			else{
				System.out.print(arr[row][colOdd]+" ");
				sum+=arr[row][colOdd];
				colOdd+=2;
				System.out.print(arr[row][colOdd]+" ");
				sum+=arr[row][colOdd];
				colOdd+=2;
				System.out.print(arr[row][colOdd]+" ");
				sum+=arr[row][colOdd];
				System.out.print(" = "+sum);
			}
			sumFinal+=sum;
			sum = 0;
			col = 0;
			colOdd = 1;
			System.out.println();
		}
		System.out.println("Suma na elementite = "+sumFinal);

	}

}

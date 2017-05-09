import java.util.Scanner;

public class ExerciseTask11D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lenght = 0;
		int lenght1 = 0;
		do {
			System.out.println("Enter positive number for n:");
			lenght = sc.nextInt();
			System.out.println("Enter positive number for m:");
			lenght1 = sc.nextInt();
		} while (lenght < 0 || lenght1 < 0);

		int arr[][] = new int[lenght][lenght1];
		int row = 0;
		int col = 0;
		int value = 1;
		for(col = 0; col < lenght1; col++){
		    for(row = 0; row < lenght; row++){
		    	arr[row][col] = value;
			    if(col%2 == 0){
			    	value++;
			    }
			    else if(col%2 != 0){
			        value--;
			    } 
		    }
		    value = arr[row - 1][col] + lenght;
		}
		for (int i = 0; i < lenght; i++) {
			for (int j = 0; j < lenght1; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();

	}

}

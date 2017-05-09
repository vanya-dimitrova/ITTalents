
public class ExerciseTask10 {

	public static void main(String[] args) {
		int[][] arr = {
				{2, 3, 5, 8, 9},
				{3, 5, 9, 9, 2},
				{6, 7, 9, 9, 4}
		          };
		int sum = 0;
		int sumFinal = 0;
		int involved = 0;
		int involved1 = 0;
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr[0].length - 1; j++) {
				for (int j2 = i; j2 <= i + 1; j2++) {
					for (int k = j; k <= j +1; k++) {
						sum+=arr[j2][k];
					}
				}
				if(sum > sumFinal){
					sumFinal = sum;
					involved = i;
					involved1 = j;
				}
				sum = 0;	
			}
		}
		System.out.println("Maksimalnata podmatrica ot masiva e ogradena v skobi:");
		for (int a = 0; a < arr.length; a++) {
			for (int b = 0; b < arr[0].length; b++) {
				if((a == involved && b == involved1) || (a == involved +1 && b == involved1)){
					System.out.print("("+arr[a][b]);
					}
				else if((a == involved && b == involved1 + 1) || (a == involved + 1 && b == involved1 + 1)){
					System.out.print(arr[a][b]+")");
				}
				else{
					System.out.print(arr[a][b]);
				}
			}
			System.out.println();
			
		}
	}

}

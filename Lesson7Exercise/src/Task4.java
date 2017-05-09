
public class Task4 {

	public static void main(String[] args) {
		
		int[] arr = {0, 1, 0, 1, 0, 1, 0, 1};
		
		int counter =0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 0){
			counter++;
			}
		}
			for(int a = 0; a < counter; a++){
				arr[a] = 0;
				System.out.print(arr[a]);
			}
			for (int j = counter; j < arr.length; j++) {
				arr[j] = 1;
				System.out.print(arr[j]);
			}
		

	}

}

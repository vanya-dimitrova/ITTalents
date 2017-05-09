
public class Vanya_BubbleSort {

	public static void main(String[] args) {
		// bubble sort
		
		int[] arr = {2, 3, 5, 1, 8, 4, 7, 9, 0, 3};
		bubbleSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}
	static void bubbleSort(int arr[]){
		for (int i = 0; i < arr.length; i++) {
			boolean swap = false;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if(j != arr.length - 1 && arr[j] > arr[j + 1]){
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
					swap = true;
				}
			}
			if(!swap){
				break;
			}
		}
	}
	

}

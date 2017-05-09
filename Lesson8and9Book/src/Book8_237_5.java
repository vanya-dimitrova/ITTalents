
public class Book8_237_5 {

	public static void main(String[] args) {
		// max element index recursion method, 2 options
		int[] arr = {3, 7, 3, 3, 9};
		int maxIndex = 0;
		int index = 0;
		int idx = arr.length - 1;
		int i = 0;
		System.out.println("Max element is with index "+findMaxIndex(arr, maxIndex, index));
		System.out.println(max(arr, idx));
		System.out.println(maxel(arr, i));

	}
	static int findMaxIndex(int[] arr, int max, int index){
		if(arr[index] > arr[max]){
			max = index;
		}
		if(index < arr.length - 1){
			return findMaxIndex(arr, max, index + 1);
		}
		else{
			return max;
		}
	}
	static int max(int[] arr, int i){
		if(i == 0){
			return 0;
		}
		int max = max(arr, i - 1);
		if(arr[i] > arr[max]){
			max = i;
		}
		return max;
		
	}
	static int maxel(int[] arr, int i){
		if(i == arr.length - 1){
			return i;
		}
		int maxel = maxel(arr, i +1);
		
		if(arr[i] > arr[maxel]){
			return i;
		}else{
			return maxel;
		}
		
	}

}

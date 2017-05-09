
public class Book8_236_10 {

	public static void main(String[] args) {
		// copy two arrays in one in ascending order method
		
		int[] arr = {4, 6, 8, 12};
		int[] arr2 = {3, 5, 9, 10, 11};
		int[] arr3 = copyArrays(arr, arr2);
		
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]+" ");
		}
	}
		static int[] copyArrays(int[] arr, int[] arr2){
			int[] arr3 = new int[arr.length + arr2.length];
			int indexArr = 0;
			int indexArr2  = 0;
			int indexArr3 = 0;
			while(indexArr < arr.length && indexArr2 < arr2.length){
				if(arr[indexArr] <= arr2[indexArr2]){
					arr3[indexArr3] = arr[indexArr];
					indexArr++;
				}
				else{
					arr3[indexArr3] = arr2[indexArr2];
					indexArr2++;
				}
				indexArr3++;
			}
			while(indexArr < arr.length){
				arr3[indexArr3] = arr[indexArr];
				indexArr++;
				indexArr3++;
			}
			while(indexArr2 < arr2.length){
				arr3[indexArr3] = arr2[indexArr2];
				indexArr2++;
				indexArr3++;
		}
			return arr3;

	}

}

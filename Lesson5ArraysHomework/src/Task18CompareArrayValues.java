
public class Task18CompareArrayValues {

	public static void main(String[] args) {
		// declare,initialise and print out 2 arrays
		int[] arr = {5, 6, 8, 2, 4, 0, 9, 11};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"; ");
		}
		System.out.println();
		int[] arrTwo = {2, 4, 6, 8, 3, 6, 7, 3,1};
		for (int i = 0; i < arrTwo.length; i++) {
			System.out.print(arrTwo[i]+"; ");
		}
		System.out.println();
		
		// check lengths and declare third array with length = longest array;
		int[] arrShort = arr;
		int[] arrLong = arrTwo;
		if(arr.length > arrTwo.length){
			arrShort = arrTwo;
			arrLong = arr;
		}
		
		// declare and initialise third array
		int[] arrThird = new int[arrLong.length];
		for (int i = 0; i < arrShort.length; i++) {
			if(arrShort[i] > arrLong[i]){
				arrThird[i] = arrShort[i];
			}
			else if(arrShort[i] < arrLong[i]){
				arrThird[i] = arrLong[i];
			}
			System.out.print(arrThird[i]+"; ");
		}
		if(arrShort.length != arrLong.length){
			for (int i = arrShort.length; i < arrThird.length; i++) {
				arrThird[i] = arrLong[i];
				System.out.print(arrThird[i]+"; ");
			}
		}
		
		

	}

}

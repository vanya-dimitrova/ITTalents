
public class KrasiComparingArrays {

	public static void main(String[] args) {
		
//		int x = 5;
//		int y = x;
//		System.out.println(x);
//		System.out.println(y);
//		x++;
//		System.out.println(x);
//		System.out.println(y);
		
		int[] arr1 = {4,5,6,8,7};
		int[] arr2 = {4,5,6,8,9};
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr1[2]);
		int[] arr3 = arr1;
		System.out.println(arr3[2]);
		//arr1[1]+=3;
		System.out.println(arr3[1]);
		
		//comparing arr1 and arr2
		boolean arraysAreEqual = true;
		//1 - compare their lengths
		// - if lengths are not equal -> the arrays are not equal
		// - else
		//for each cell of the arrays
		//compare the values
		//if the values are not equal -> the arrays are not equal
		if(arr1.length != arr2.length){
			arraysAreEqual = false;
		}
		else{
			for(int i = 0; i < arr1.length; i++){
				if(arr1[i] != arr2[i]){
					arraysAreEqual = false;
					break;
				}
			}
		}
		
		System.out.println(arraysAreEqual ? "Arrays are eaual" : "Arrays are NOT equal");
		
	}
}

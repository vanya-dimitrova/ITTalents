
public class KrasiBubbleSort {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,9,8,11,12,13,23,33,44,55,66,77,99,100};
		System.out.println("Broi vhodni danni = " + arr.length);
		bubbleSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	static void bubbleSort(int[] masiv){
		//compare first with second
		int counter = 0;
		for (int k = 0; k < masiv.length; k++) {
			boolean hasSwaps = false;
			for(int i = 0; i < masiv.length-1-k; i++){
				counter++;
				if(masiv[i] > masiv[i+1]){
					//if first > second - swap them
					int temp = masiv[i];
					masiv[i] = masiv[i+1];
					masiv[i+1] = temp;
					hasSwaps = true;
				}
			}
			if(!hasSwaps){
				break;
			}
		}
		System.out.println("Broi operacii = " + counter);
	}
}

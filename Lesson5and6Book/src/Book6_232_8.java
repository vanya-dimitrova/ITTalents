
public class Book6_232_8 {

	public static void main(String[] args) {
		// zigzag upwards
		
		int arr[] = {3, 4, 2, 3, 1, 2, 0};
		boolean zigzag = true;
		for (int i = 1; i < arr.length; i++) {
			if(i != arr.length -1 && i%2 !=0 && (arr[i] <= arr[i + 1] || arr[i] <= arr[i - 1])){
				zigzag = false;
			}
			if(i == arr.length - 1 && i%2 !=0 && arr[i] <= arr[i - 1]){
				zigzag = false;
			}
		}
		System.out.println(zigzag? "Array is zigzag." : "Array is not zigzag.");

	}

}

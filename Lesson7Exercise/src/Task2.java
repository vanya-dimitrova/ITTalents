
public class Task2 {

	public static void main(String[] args) {
		
		int[] arr = {9, 10, 11, 12, 13, 14, 15};
		int i = 0;
		boolean jagged = true;
		for(i = 1; i < arr.length -1; i++){	
			if(!
			   (arr[i] > arr[i -1] && arr[i] > arr[i+1]) || 
			   (arr[i] < arr[i -1] && arr[i] < arr[i+1])
			   ){
				jagged = false;
				break;
		}
		}
		System.out.println(jagged ? "nazuben" : "ne nazuben");

	}

}

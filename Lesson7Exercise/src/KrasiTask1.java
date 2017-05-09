
public class KrasiTask1 {

	public static void main(String[] args) {
		
		int[] arr = {1,3,3,5,-3,6,4,7,5,8,1,4,5};
		
//		boolean allPositive = true;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < 0){
//				allPositive = false;
				System.out.println("ne sa polojitelni");
				break;
			}
			if(i == arr.length-1){
				System.out.println("vsichki sa polojiteli");
			}
		}
		
//		System.out.println(allPositive ? "all are positive" : "not all are positive");
		
	}
}

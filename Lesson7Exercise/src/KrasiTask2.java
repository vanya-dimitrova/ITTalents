
public class KrasiTask2 {

	public static void main(String[] args) {
		

		int[] arr = {1,3,3,5,-3,6,4,7,5,8,1,4,5};
		
		boolean nazuben = true;
		
		for (int i = 1; i < arr.length-1; i++) {
			//ako ne e izpulneno slednoto:
				//elementut da e po-golqm ot susedite si
				//ILI
				//elementut da e po-maluk ot susedite si 
			
			if(!(
				  (arr[i] > arr[i+1] && arr[i] > arr[i-1]) || 
				  (arr[i] < arr[i-1] && arr[i] < arr[i+1]) 
				)){
				nazuben = false;
				break;
			}
			
		}
		
		System.out.println(nazuben ? "nazuben" : "ne nazuben"); 
		
	}
}

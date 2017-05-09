
public class Task14NewArrayDiffLenght {

	public static void main(String[] args) {
		
		double[] arr = {1.2, 4, 3.4, 0.35, 2.5, -2, -1.56};
		
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < 2.99 && arr[i] > -2.99){
				counter++;
			}
		}
		double[] arrNew = new double[counter];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < 2.99 && arr[i] > -2.99){
				arrNew[index] = arr[i];
				System.out.print(arrNew[index]+"; ");
				index++;
			}
			
		}
	
	
		
	}

	
}

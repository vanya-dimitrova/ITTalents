
public class Task16NewArraySameLenght {

	public static void main(String[] args) {
		
		double[]arr = {-0.256, 3.45, 2.76, -3.56, 2.34, 4.1};
		double[] arrNew = new double[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"; ");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < -0.231){
				arr[i] = ((i + 1)*(i + 1)) + 41.25;
			}
			else{
				arr[i] = arr[i]*(i + 1);
			}
			arrNew[i] = arr[i];
			System.out.print(arrNew[i]+"; ");
		}
		

	}

}

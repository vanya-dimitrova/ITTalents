
public class MultiplyOddsRecursion {

	public static void main(String[] args) {
		// multiply odds in an array recursively
		
		int[] a = {1, 4, 5, 7, 4, 2, 5};
		int idx = 0;
		System.out.println(multiplyOdds(a, idx));
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}

	}
	static int multiplyOdds(int[] a, int i){
		// a[i] value is changed this way unless:
		// I have a variable to hold a[i]'s value
		// then variable's value will be changed only
		if(i == a.length - 1 && a[i]%2 != 0){
			return a[i];
		}
		else if(i == a.length - 1 && a[i]%2 == 0){
			return 1;
		}
		if(a[i]%2 == 0){
			a[i] = 1;
		}
		return a[i]*multiplyOdds(a, i + 1);
		
			

	}

}

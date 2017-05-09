
public class MultiplyOddsRecursively {

	public static void main(String[] args) {
		// multiply odds recursively
		
		int[] n = {3, 3, 4, 3, 2, 3};
		int index = 0;
		System.out.println(multi(n, index));
		
	}
	static int multi(int[] a, int index){
		int value = a[index];
		if(index == a.length -1 && a[index]%2 != 0){
			return a[index];
		}
		if(index == a.length -1 && a[index]%2 == 0){
			return 1;
		}
		if(a[index]%2 == 0){
			value = 1;
		}
		return value*=multi(a, index +1);
			
		
	}
	
}

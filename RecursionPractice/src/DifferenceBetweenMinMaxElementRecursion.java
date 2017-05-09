
public class DifferenceBetweenMinMaxElementRecursion {

	public static void main(String[] args) {
		
		int[] a = {3, 5, 1, 2, 8, 5, 4};
		System.out.println(findDifferense(a, 0, a[0], a[0]));

	}
	
	static int findDifferense(int a[], int startIndex,int min, int max){
		if(startIndex == a.length){
			return (max - min) < 0 ? (min - max) : (max - min);
		}
		if(min > a[startIndex]){
			min = a[startIndex];
		}
		if(max < a[startIndex]){
			max = a[startIndex];
		}
		return findDifferense(a, startIndex + 1, min, max);
		
		
		
		
		
		
	}

}

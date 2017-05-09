
public class VanyaCountingSort {

	public static void main(String[] args) {
		// counting sort

		int[] a = { 2, 6, 7, 2, 5, 1, 9, 0 };

		a = countingSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}

	static int[] countingSort(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		int[] b = new int[max + 1];
		int[] c = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			int bIndex = a[i];
			b[bIndex]++;
		}
		for (int i = 1; i < b.length; i++) {
			b[i]+=b[i -1];
		}
		for (int i = 0; i < a.length; i++) {
			int bIndex = a[i];
		} 
		
	
		return c;

	}

}

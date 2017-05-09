
public class FoundBaseCaseNowTheRest {

	public static void main(String[] args) {
		// where is the base case

		char[] a = { 'a', 'b', 'c' };
		int first = 0;
		int last = a.length - 1;
		System.out.println(sameCase(a, first, last));

	}

	static boolean sameCase(char[] ary, int first, int last) {
		int length = last - first + 1;
		int mid = first + length / 2;
		return length < 2 || (sameCase(ary, first, mid - 1) && sameCase(ary, mid, last)
				&& (Character.isUpperCase(ary[first]) ^ Character.isLowerCase(ary[last])));

	}

}

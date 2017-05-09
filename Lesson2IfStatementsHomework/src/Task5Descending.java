
public class Task5Descending {

	public static void main(String[] args) {

		int a = 39;
		int b = 40;
		int c = 41;
		if (a > b && b > c) {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		} else if (a > c && c > b) {
			System.out.println(a);
			System.out.println(c);
			System.out.println(b);
		} else if (b > a && a > c) {
			System.out.println(b);
			System.out.println(a);
			System.out.println(c);
		} else if (b > c && c > a) {
			System.out.println(b);
			System.out.println(c);
			System.out.println(a);
		} else if (c > a && a > b) {
			System.out.println(c);
			System.out.println(a);
			System.out.println(b);
		} else {
			System.out.println(c);
			System.out.println(b);
			System.out.println(a);
		}

	}

}

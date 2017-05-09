
public class Book2_220_6 {

	public static void main(String[] args) {
		// print digits

		int x = 5925;
		int th = x / 1000;
		System.out.println("Thousands " + th);

		int hund = (x - th * 1000) / 100;
		System.out.println("Hundreds " + hund);

		int ten = ((x - th * 1000) - hund * 100) / 10;
		System.out.println("Tens " + ten);

		int one = x % 10;
		System.out.println("Ones " + one);

		System.out.println(x % 2 == 0 ? "Number is even." : "Number is odd.");

	}

}

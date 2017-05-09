
public class IsCubeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1000;
		isCube(n);

	}

	static void isCube(int n) {
		if (n == 1) {
			System.out.println(n + " is a cube of " + n);
		} else {
			for (int i = 2; i <= n / 3; i++) {
				if (n == i * i * i) {
					System.out.println(n + " is a cube of " + i);
					return;
				} else if (i == n / 3) {
					System.out.println(n + " is not a cube!");
				}
			}

		}

	}

}

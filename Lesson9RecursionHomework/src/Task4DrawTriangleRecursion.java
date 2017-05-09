import java.util.Scanner;

public class Task4DrawTriangleRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two positive numbers > 1:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		while(a < 1 || b < 1){
			System.out.println("Enter two positive numbers > 1:");
			a = sc.nextInt();
			b = sc.nextInt();
		}
		drawTriangle(a, b);
		System.out.println();
		drawTri(a, b);
		sc.close();
		
	}
	static void drawTriangle(int x, int z){
		for (int i = 1; i <= x; i++) {
			System.out.print(i);
		}
		System.out.println();
		if(x < z){
			drawTriangle(x + 1, z);
		}
	}
	
	static void drawTri(int x, int z){
		if(x > z){
			return;
		}
		drawTri(x + 1, z);
		for (int i = 1; i <= x; i++) {
			System.out.print(i);
		}
		System.out.println();
		
	}


}

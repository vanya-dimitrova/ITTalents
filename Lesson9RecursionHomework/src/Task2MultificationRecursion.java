import java.util.Scanner;

public class Task2MultificationRecursion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = 0; int z = 0;
		while(x <=0 || z <= 0){
		System.out.println("Enter two positive numbers:");
		x = sc.nextInt();
		z = sc.nextInt();
		}
		System.out.println(multify(x, z));
		
		sc.close();
	}
	static int multify(int a, int b){
		if(b == 1){
			return a;
		}
		else{
			return a + multify(a, b - 1);
		}
		
	}
}
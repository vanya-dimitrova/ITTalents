import java.util.Scanner;

public class Task7ArrayUnderCondition {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Array lenght:");
		int[] arr = new int[sc.nextInt()];
		
		System.out.println("Enter Array values:");
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
		int i = 0;
		int a = 0;
		int[]arrNew = new int[arr.length];
		for(i = 0; i < arr.length; i+=arr.length - 1){
			arrNew[a] = arr[i];
			a+=arrNew.length - 1;
		}
		a = 1;
		for(i = 1; i < arr.length - 1; i++){
			arrNew[a] = arr[i-1] + arr[i+1];
			a++;
		}
		a = 0;
		for(a = 0; a < arrNew.length; a++){
			System.out.print(arrNew[a]+" ");
		}
			
		sc.close();

	}

}

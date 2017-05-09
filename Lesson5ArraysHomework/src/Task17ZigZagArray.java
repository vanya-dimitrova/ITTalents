import java.util.Scanner;

public class Task17ZigZagArray {

	public static void main(String[] args) {
		// declare new array's lenght
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array lenght:");
		int lenght = sc.nextInt();
		
		// declare array values and print them
		int[] arr = new int[lenght];
		System.out.println("Enter array values:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		// check for zigzag upwards condition
		boolean isZigZag = true;
		for (int i = 0; i < arr.length; i++) {
			if(i%2 != 0 && 
					((i == arr.length - 1 && arr[i] < arr[i - 1]) 
							|| (i < arr.length - 1 && (arr[i] < arr[i - 1] || arr[i] < arr[i + 1])))){
				isZigZag = false;
				break;
			}
		}
		
		// output
		System.out.println(isZigZag?"Completed zigzag upwards requirements!":"Not completed zigzag upwards requirements!");
		
		sc.close();
		
		

	}

}

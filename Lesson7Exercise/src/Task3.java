import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] arr = {'a', 'b', 'c', 'd', 'e', 'f'};
		
		System.out.println("Enter sign:");
		char a = sc.next().charAt(0);
		
		boolean signAvailable = false;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == a){
				signAvailable = true;
			}
		}
		System.out.println(signAvailable ? "Tozi znak se namira v masiva." : "Tozi znak ne se namira v masiva.");
		
		
		sc.close();
	}

}

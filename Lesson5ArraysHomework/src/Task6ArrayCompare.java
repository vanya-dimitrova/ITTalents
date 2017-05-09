import java.util.Scanner;

public class Task6ArrayCompare{

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Array lenght:");
		int[] arr = new int[sc.nextInt()];
		
		System.out.println("Enter Array values:");
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter Arraytwo  lenght:");
		int[] arrtwo = new int[sc.nextInt()];
		
		System.out.println("Enter Arraytwo values:");
		for(int i = 0; i < arr.length; i++){
			arrtwo[i] = sc.nextInt();
		}
		if(arr.length != arrtwo.length){
				System.out.println("Array is not equal to Arraytwo!");
				System.out.println("Array lenght is not equal to Arraytwo lenght!");
		}else{
			int a = 0;
			for(int i = 0; i < arr.length; i++){
				if(arr[i] != arrtwo[a]){
					System.out.println("Array is not equal to Arraytwo!");
					System.out.println("Array lenght is equal to Arraytwo lenght!");
					break;
				}
				else if(arr[i] == arrtwo[a]){
					a++;
			    }
				if(i == arr.length - 1){
					System.out.println("Array is equal to Arraytwo!");
					System.out.println("Array lenght is equal to Arraytwo lenght!");
				}
					
		    }
		}
		sc.close();

	}

}

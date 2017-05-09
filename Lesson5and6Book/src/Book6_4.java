
public class Book6_4 {

	public static void main(String[] args) {
		
		char arr[] = {';', '(', '=', '+', ')', '%', 'w', '.', '*', '/', '`', 'l', '_', ':', '&'};
		char arrcheck[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		for(int i = 0; i < arr.length; i++){
			for(int ii = 0; ii < arrcheck.length; ii++){
				if(arr[i] == arrcheck[ii]){
					System.out.println("Array has a small latin letter value '"+arr[i]+"'");
					break;
				}
			}
		}
		
		

	}

}

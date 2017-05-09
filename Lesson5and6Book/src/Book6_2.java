
public class Book6_2 {

	public static void main(String[] args) {
		
		int[] five = {9, 8, 7, 6, 5};
		int[] five1 = {5, 6, 7, 8, 9};
		if(five.length != five1.length){
			System.out.println("Five is not equal to Five1!");
		} else {
			int index = five.length - 1;
			int indexOne = 0;
			int diff = five[index] - five1[indexOne];
			while (index >= 0 && indexOne < five1.length){ 
				index--;
				indexOne++;
				if(diff != 0){
					System.out.println("Not equal!");
					break;
				}
			}
			if(index < 0 ){
				System.out.println("Equal!");
			}
		 }
				
	
			
			
	
		
		
		
		
		

	}

}


public class Task4StringCompareTo {

	public static void main(String[] args) {
		
		String names = "Peter Tomanov, Violeta Georgieva";
		
		String[] namesSplit = names.split(",");
		int result = namesSplit[0].compareTo(namesSplit[1]);
		if(result > 0){
			System.out.println(namesSplit[0]);
		}
		else if(result < 0){
			System.out.println(namesSplit[1]);
		}
		else{
			System.out.println("The names are equual.");
					
		}
		
		
		

	}

}

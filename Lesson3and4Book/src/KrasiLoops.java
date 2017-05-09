
public class KrasiLoops {

	public static void main(String[] args) {

		System.out.println("All numbers between 1 and 5 using while loop");
		int x = 1;
		while(x <= 5){
			System.out.println(x);
			x++;
		}

		System.out.println("All numbers between 1 and 5 using do-while loop");
		int y = 1;
		do{
			System.out.println(y);
			y++;
		}while(y<=5);

		System.out.println("All numbers between 1 and 5 using for loop");
		for(int z = 1; z <= 5; z++){
			System.out.println(z);
		}
		
	}
}

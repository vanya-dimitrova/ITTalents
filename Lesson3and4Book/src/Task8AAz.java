
public class Task8AAz {

	public static void main(String[] args) {
		// print a star frame triangle
		
		int a = 10;
		// kude da printira zvezdichka
		int x = 0;
		// kude da printira zvezdichka
		int z = 0;
		// za da moga da gi uvelichavam i namaliavam
		x = a;
		z = x;
		for(int i = 0; i < a; i++){
			for(int j = 1; j <=x; j++){
				if(i == a - 1){
					System.out.print("*");
				}
				else if(j == z || j == x){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			x++;
			z--;
			System.out.println();
		}

	}

}

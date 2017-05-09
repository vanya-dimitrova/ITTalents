
public class Task20EqualSumRowCol {

	public static void main(String[] args) {
		
		int n = 0;
		for(int i = 0; i < 10; i++){
			for(int a = 0; a <= 10; a++){
				System.out.print(n);
				n++;
				if(n == 10){
					n = 0;
				}
			}
			System.out.println();
		}

	}

}

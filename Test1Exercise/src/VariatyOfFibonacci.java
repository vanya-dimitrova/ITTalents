
public class VariatyOfFibonacci {

	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		int c = 0;
		for (int i = 0; i < 5; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		System.out.println(c);

		int febCount = 8;
		int[] feb = new int[febCount];
		feb[0] = 0;
		feb[1] = 1;
		for (int i = 2; i < febCount; i++) {
			feb[i] = feb[i - 1] + feb[i - 2];
		}
		for (int i = 0; i < febCount; i++) {
			System.out.print(feb[i] + " ");
		}

		 int first =0;
		    int secend =1; 
		    System.out.print(first+","+secend);
		    for (int k=1;k<7;k++){
		        System.out.print(","+(first+secend ));
		        if(k%2!=0)
		            first+=secend;
		        else 
		            secend+=first;
		        }
		 
	

	}

}

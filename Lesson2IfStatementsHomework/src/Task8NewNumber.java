
public class Task8NewNumber {

	public static void main(String[] args) {
		
		int a = 7;
		int b = 7;
		int c = 5;
		int d = 5;
		System.out.println(a+""+b+""+c+""+d);
		System.out.println(a+""+d);
		System.out.println(b+""+c);
		if (a>b){
			System.out.println(a+""+d+">"+b+""+c);
		} else if (a<b){
			System.out.println(a+""+d+"<"+b+""+c);
		} else if (a==b && d==c){
			System.out.println(a+""+d+"="+b+""+c);
		} else if (a==b && d>c){
			System.out.println(a+""+d+">"+b+""+c);
		} else {
			System.out.println(a+""+d+"<"+b+""+c);
			
		}
		
		
		
		

	}

}

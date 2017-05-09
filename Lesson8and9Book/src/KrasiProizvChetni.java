
public class KrasiProizvChetni {

	public static void main(String[] args) {
		
		int n = 5;
		System.out.println(proizv(n));
	}
	
	static long proizv(int n){
		if(n == 0){
			return 1;
		}
		if(n%2 == 0){
			return n*proizv(n-2);
		}
		else{
			return (n-1)*proizv(n-3);
		}
	}
}


public class KrasiModifyNumber {

	public static void main(String[] args) {
		
		int x = 4;
		x = modify(x);
		System.out.println(x);
	}
	
	static int modify(int x){
		return ++x;
	}
}

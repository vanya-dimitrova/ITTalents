
public class KrasiPowerRangers {

	public static void main(String[] args) {
		
		int x = 5;
		int y = 3;
		System.out.println(power(x, y));
		
	}
	
	static int power(int x, int y){
		
		if(y == 1){
			return x;
		}
		int prednaStepen = power(x, y-1);
		int sbor = 0;
		for(int i = 0; i < x; i++){
			sbor +=prednaStepen;
		}
		return sbor;
	}
	
}

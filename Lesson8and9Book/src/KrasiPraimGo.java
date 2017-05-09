
public class KrasiPraimGo {

	public static void main(String[] args) {
		
		String x = "Габи";
		x = modify(x);
		System.out.println(x);
		
	}
	
	static String modify(String a){
		return a.replace('�', '�');
	}
}

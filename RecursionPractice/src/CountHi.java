
public class CountHi {

	public static void main(String[] args) {
		// count 'hi' in a string/ na kolega
		
		String a = "Hi, are you high or not high?";
		System.out.println(countHi(a));

	}
	static int countHi(String a){
		System.out.println(a);
		if(a.indexOf("hi") == -1){
			return 0;
		}else{
			return 1 + countHi(a.substring(a.indexOf("hi") + 2));
		}
	}

}

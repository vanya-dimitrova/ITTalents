package testInheritance;

public class A{
	
	static private A instance;
	
	int number;
	
	private A(int number){
		this.number = number;
	}
	
	public static A getA(int number){
		if(instance == null){
			instance = new A(number);
		}
		return instance;
	}
	
	public static void main(String[] args) {
		A a = getA(5);
		System.out.println(a.number);
	}
            
}
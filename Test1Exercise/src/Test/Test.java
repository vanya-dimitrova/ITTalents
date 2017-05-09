package Test;


public class Test extends Toast{
	public static String b;
	int age = 5;
	
	Test(){
		
	}
	
	
	// suzdavam obect ot tozi clas vutre v statichnia mu metod
	// i izpolzvam non static field-a mu v nego
	public static void go(){
		Test a = new Test();
		System.out.println(a.age);
		
	}
	
	static{
		b = "fg";
	}

	
	
	

}

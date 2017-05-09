package ovci;

public class Demo {

	public static void main(String[] args) {
		
		int[] arr = null;
		System.out.println("start");
		printArrInfo(arr);
		System.out.println("end");
	}
	
	public static void printArrInfo(int[] arr){
		try{
			System.out.println(arr.length);
			System.out.println("Ebasi qkoto");
		}
		catch(NullPointerException e){
			System.out.println("something is null ... like your knowledge on exceptions!");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("this material is out of your reach!");
		}
		finally {
			System.out.println("this will ALWAYS execute!");
		}
	}
}

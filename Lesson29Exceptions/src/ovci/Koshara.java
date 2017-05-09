package ovci;

public class Koshara {

	public static void main(String[] args) {
		
		System.out.println("start");
		Ovca penka = new Ovca(null);
		Ovca ganka = new Ovca("Penka");
		
		try{
			int[] arr = new int[3];
			arr[4] = 5;
			
			System.out.println(penka.ravnaNa(ganka));
			//100 more lines
		}
		catch(Throwable e){
			System.out.println("ops ops ...");
		}
		
		System.out.println("end");
	}
}

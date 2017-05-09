package Work;

public class AtWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee ivan = new Employee("Ivan Ivanov");
		Task pack = new Task("pack", 3);
		Task load = new Task("load", 2);
		Task unload = new Task("unload", 4);
		
		ivan.showReport();
		System.out.println();
		
		ivan.work(pack);
		ivan.showReport();
		System.out.println();
		
		ivan.work(load);
		ivan.showReport();
		System.out.println();
		
		ivan.work(unload);
		ivan.showReport();
		System.out.println();
		
		
		

	}

}

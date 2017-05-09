package Computer;

public class DemoComputer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computer notebook = new Computer();
		notebook.year = 2012;
		notebook.hardDiskMemory = 512;
		notebook.freeMemory = 4096;
		notebook.isNotebook = true;
		notebook.operationSystem = "Microsoft Windows 7 Professional";
		notebook.price = 799.99;
		
		Computer desktop = new Computer();
		desktop.year = 2014;
		desktop.hardDiskMemory = 1024;
		desktop.freeMemory = 4096;
		desktop.isNotebook = false;
		desktop.operationSystem = "Microsoft Windows 8 Home";
		desktop.price = 399.00;
		
		notebook.useMemory(100);
		desktop.changeOperationSystem("Microsoft Windows 10 Home");
		
		System.out.println(notebook.isNotebook? "Notebook specifications:" : "Desktop specifications:");
		System.out.println("Year of release: "+notebook.year);
		System.out.println("HD: "+notebook.hardDiskMemory+" MB");
		System.out.println("RAM: "+notebook.freeMemory+" MB");
		System.out.println("OS: "+notebook.operationSystem);
		System.out.println("Price: "+notebook.price+" lv");
		System.out.println();
		
		System.out.println(desktop.isNotebook? "Notebook specifications:" : "Desktop specifications:");
		System.out.println("Year of release "+desktop.year);
		System.out.println("HD: "+desktop.hardDiskMemory+" MB");
		System.out.println("RAM: "+desktop.freeMemory+" MB");
		System.out.println("OS: "+desktop.operationSystem);
		System.out.println("Price: "+desktop.price+" lv");

	}

}

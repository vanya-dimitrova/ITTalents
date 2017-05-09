package Computer;

 class Computer {
	int year;
	double price;
	boolean isNotebook;
    int hardDiskMemory;
    String harDiskMeasureOfMemory;
	int freeMemory;
	String measureOfFreeMemory;
	String operationSystem;
	
	Computer(){
		this.isNotebook = false;
		this.operationSystem = "Win XP";
	}
	
	Computer(int year, double price, int hardDiskMemory, String harDiskMeasureOfMemory, int freeMemory, String measureOfFreeMemory){
		this();
		this.year = year;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
	}
	
	Computer(int year, double price, boolean isNotebook, int hardDiskMemory, String harDiskMeasureOfMemory, int freeMemory, String measureOfFreeMemory, String operationSystem){
		this();
		this.year = year;
		this.price = price;
		this.isNotebook = isNotebook;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
		this.operationSystem = operationSystem;
	}
	
	

	void changeOperationSystem(String OperationSystem){
		this.operationSystem = OperationSystem;
	}
	
	void useMemory(int memory){
		if(memory > this.freeMemory){
			System.out.println("Not ennough free memory!");
		}else{
		this.freeMemory -= memory;
	    }
	}
	
	int comparePrice(Computer c){
		if(this.price > c.price){
			return -1;
		}
		if(this.price < c.price){
			return 1;
		}else{
			return 0;
		}
		
	}
		
	

}

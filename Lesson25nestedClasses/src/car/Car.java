package car;

public class Car {
	
	private static int x = 5;
	private int y = 6;
	
	static public class Engine {
		
		private Car car;
		
		public Engine(Car car) {
			this.car = car;
		}

		public void start() {
			System.out.println("brum" + x);
		}
	}

	private Engine dvigatel;

	public Car() {
		this.dvigatel = new Engine(this);
	}
	
	public void start(){
		dvigatel.start();
	}
}

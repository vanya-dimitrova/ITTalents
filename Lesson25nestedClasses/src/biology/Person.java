package biology;

public class Person {
	
	private class Brain {//inner class
		private int gunki;
		private String name;
		
		public Brain(int gunki) {
			this.gunki = gunki;
			this.name = "Gencho";
			x = 56;
		}
	}

	@SuppressWarnings("unused")
	private Brain brain;
	@SuppressWarnings("unused")
	private String name;
	@SuppressWarnings("unused")
	private static int x;
	
	public Person() {
		this.brain = new Brain(10);
	}
	
	
	public void doHomework(){
		
		int f = 5;
		
		class Task{
			private String name;
			private int deadline;
			
			public Task(String name, int deadline) {
				this.name = name;
				this.deadline = deadline + f;
			}
		}
		

		Task task1 = new Task("Da se napishe programa", 3);
		Task task2 = new Task("Da se napishe programa", 3);
		Task task3 = new Task("Da se napishe programa", 3);
		Task task4 = new Task("Da se napishe programa", 3);

	}
	
}

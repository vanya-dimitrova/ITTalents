package testInheritance;

  class B{
	  
	  public static void main(String[] args) {
		
		  A a = A.getA(5);
		  System.out.println(a.number);
		  
		  a = null;
		  
		  a = A.getA(6);
		  System.out.println(a.number);
		  
	}


	
}

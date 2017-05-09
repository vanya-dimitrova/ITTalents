package trader;

public abstract class Trader {
	
	private String name;
	private String address;
	protected float money;
	protected int numberOfProductsSold;
	protected float profitPercentage;
	
	public Trader(String name){
		this.address = "Sofia";
		this.profitPercentage = 0.3f;
		if(name != null && !name.isEmpty()){
			this.name = name;
		}
		else{
			throw new IllegalArgumentException("Invalid input! Object is not created!");
		}
	}
	
	public float getMoney(){
		return this.money;
	}
	
	public String getName(){
		return name;
	}
	
	abstract public void makeOrder();
				
		
	abstract public void addTurnoverToMoney();
	   
	
	abstract public void payTax();
	
	abstract public int getNumberOfProductsSold();
	
	

}

package Gsm;

public class Call {
	
	private double priceForAMinute;
	Gsm caller;
	Gsm receiver;
	private double duaration;
	
	
	
	void setPriceForAMinute(double priceForAMinute){
		if(priceForAMinute >= 0.00){
			this.priceForAMinute = priceForAMinute;
		}
	}
	
	void setDuaration(double duaration){
		if(duaration > 0.00){
			this.duaration = duaration;
		}
	}
	
	double getPriceForAMinute(){
		return priceForAMinute;
	}
	
	double getDuaration(){
		return duaration;
	}

}

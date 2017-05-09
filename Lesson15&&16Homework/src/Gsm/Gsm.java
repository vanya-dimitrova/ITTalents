package Gsm;

public class Gsm {
	
	String model;
	private boolean hasSimCard;
	private String simMobileNumber;
	private double outgoingCallsDuaration;
	private Call lastIncomingCall;
	private Call lastOutgoingCall;
	
	
	 void insertSimCard(String simMobileNumber){
		 if(simMobileNumber.charAt(0) == '0' && simMobileNumber.charAt(1) == '8' && simMobileNumber.length() == 10){
			 this.simMobileNumber = simMobileNumber;
			 this.hasSimCard = true;
		 }
	 }
	 
	 String getSimMobileNumber(){
		 return this.simMobileNumber;
	 }
	 
	 double getOutgoingCallsDuaration(){
		 return this.outgoingCallsDuaration;
	 }
	 
	 void removeSimCard(){
		 this.simMobileNumber = null;
		 this.hasSimCard = false;
	 }
	 
	 void call(Gsm receiver, double duaration, double priceForAMinute){
		 if(this.simMobileNumber == null || this.simMobileNumber == receiver.simMobileNumber 
				 || duaration <= 0.00 || this.hasSimCard == false || receiver.hasSimCard == false){ 
			 System.out.println("No connection!");
		 }else{
			 Call call = new Call();
			 call.setDuaration(duaration);
			 call.caller = this;
			 call.receiver = receiver;
			 call.setPriceForAMinute(priceForAMinute);
			 this.lastOutgoingCall = call;
			 receiver.lastIncomingCall = call;
			 this.outgoingCallsDuaration+=duaration;
		 }
	 }
	 
	 void getSumForCall(){
		 System.out.println(this.lastOutgoingCall.getDuaration() * this.lastOutgoingCall.getPriceForAMinute()+" lv" );
	 }
	 
	 void printInfoForTheLastOutgoingCall(){
		 if(this.lastOutgoingCall != null){
			System.out.println("Last outgoing call details:"); 
		    System.out.println("From "+this.lastOutgoingCall.caller.getSimMobileNumber()+" to "+this.lastOutgoingCall.receiver.getSimMobileNumber());
		    System.out.print("Duaration: "+this.lastOutgoingCall.getDuaration()+" min / ");
		    System.out.println("Rate: "+this.lastOutgoingCall.getPriceForAMinute()+" lv/min");
		    System.out.println("Total charged: "+this.lastOutgoingCall.getDuaration() * this.lastOutgoingCall.getPriceForAMinute()+" lv");
		 }else{
			 System.out.println("No outgoing calls");
		 }
	 }
	 
	 void printInfoForTheLastIncomingCall(){
		 if(this.lastIncomingCall != null){
			System.out.println("Last incoming call details:"); 
		    System.out.println("From "+this.lastIncomingCall.caller.getSimMobileNumber()+" to "+this.lastIncomingCall.receiver.getSimMobileNumber());
		    System.out.print("Duaration: "+this.lastIncomingCall.getDuaration()+" min / ");
		    System.out.println("Rate: "+this.lastIncomingCall.getPriceForAMinute()+" lv/min");
		    System.out.println("Total charged: "+this.lastIncomingCall.getDuaration() * this.lastIncomingCall.getPriceForAMinute()+" lv");
		 }else{
			 System.out.println("No incoming calls");
		 }
	 }

}

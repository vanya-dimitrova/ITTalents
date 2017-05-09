package Gsm;

public class IGotGsm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gsm vanya = new Gsm();
		vanya.model = "Samsung S7";
		vanya.insertSimCard("0898723106");
		
		Gsm maksi = new Gsm();
		maksi.model = "Samsung A3";
		maksi.insertSimCard("0898723107");
		
		vanya.call(maksi, 5, 0.02);
		
		vanya.printInfoForTheLastOutgoingCall();
		System.out.println("Total outgoing calls: "+vanya.getOutgoingCallsDuaration()+" min");
		vanya.printInfoForTheLastIncomingCall();
		System.out.println();
		
		maksi.printInfoForTheLastOutgoingCall();
		System.out.println("Total outgoing calls: "+maksi.getOutgoingCallsDuaration()+" min");
		maksi.printInfoForTheLastIncomingCall();
		System.out.println();
		
		vanya.removeSimCard();
		maksi.call(vanya, 3, 0.02);
		
		
		
		
		
		
		
		

	}

}

package torti;

import java.util.Random;



public class DemoPasteryShop {

	public static void main(String[] args) {
		
		PasteryShop sweetTalants = new PasteryShop("Sweet talants", "Sofia", "089567896");
		DeliveryBoy ivan = new DeliveryBoy("Ivan", "089567896");
		DeliveryBoy gogo = new DeliveryBoy("Gogo", "089567896");
		DeliveryBoy pepi = new DeliveryBoy("Pepi", "089567896");
		DeliveryBoy toni = new DeliveryBoy("Toni", "089567896");
		DeliveryBoy kiro = new DeliveryBoy("Kiro", "089567896");
		
		sweetTalants.setDeliveryboys(ivan);
		sweetTalants.setDeliveryboys(gogo);
		sweetTalants.setDeliveryboys(pepi);
		sweetTalants.setDeliveryboys(toni);
		sweetTalants.setDeliveryboys(kiro);
		
		for(int i = 0; i > 30; i++){
			int chance = new Random().nextInt(4);
			switch(chance){
			case 0:
				Cake standart = new StandartCake("Standart", "suvsem obiknovena torta", new Random().nextInt(40) + 1, new Random().nextInt(20) + 11);
				break;
			case 1:
				Cake special = new StandartCake("Special", "otnositelno specialna tortichka", new Random().nextInt(40) + 1, new Random().nextInt(20) + 11);
				break;
			case 2:
				Cake wedding = new StandartCake("Wedding", "tochno kato za dvama vlubeni", new Random().nextInt(40) + 1, new Random().nextInt(20) + 11);
				break;
			case 3:
				Cake kids = new StandartCake("Kids", "niama kak da ne zaradva decata", new Random().nextInt(40) + 1, new Random().nextInt(20) + 11);
				break;
			}
		}
		
		//Client a = new PrivateClient(name, telNumber, voucherNumber);
		

		
		
	}

	

}

package shopping;

import shopping.Client.Product.ProductName;

import java.util.Random;

import shopping.Client.Shop;

public class DemoShopping {

	public static void main(String[] args) {
		
		Client magi = new Client("Magi");
		Client ceci = new Client("Ceci");
		Client pepi = new Client("Pepi");
		Client kati = new Client("Kati");
		Client toni = new Client("Toni");
		Client kiro = new Client("Kiro");
		Client viki = new Client("Viki");
		Client cura = new Client("Cura");
		Client rosi = new Client("Rosi");
		
		Shop firstShop = new Shop("Market");
		firstShop.toString();
		firstShop.setClientOne(magi);
		firstShop.setClientTwo(ceci);
		firstShop.setClientThree(pepi);
		Shop secondShop = new Shop("Mini");
		firstShop.setClientOne(kati);
		firstShop.setClientTwo(toni);
		firstShop.setClientThree(kiro);
		Shop thirdShop = new Shop("Maksi");
		firstShop.setClientOne(viki);
		firstShop.setClientTwo(cura);
		firstShop.setClientThree(rosi);
		
		firstShop.getClientOne().buyProduct(firstShop, ProductName.ORANGE, new Random().nextInt(4) + 1);
		System.out.println();
		firstShop.toString();
		
		

	}

}

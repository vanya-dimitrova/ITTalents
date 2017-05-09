package demo;

import java.util.ArrayList;
import java.util.Random;

import supplier.*;

import tradingObject.*;

import trader.*;

public class TradeDemo {

	public static void main(String[] args) {
		
        int numberOfSuppliers = 10;
		ArrayList<Supplier> suppliers = new ArrayList<>();
		for (int i = 0; i < numberOfSuppliers; i++) {
			switch (new Random().nextInt(3)) {
			case 0:
				suppliers.add(new RetailSupplier("Dreben dostavchik"));
				break;
			case 1:
				suppliers.add(new WholeSaleSupplier("Edur dostavchik"));
				break;
			case 2:
				suppliers.add(new RetailSupplier("Dreben dostavchik"));
				break;
			}
		}
		
		int numberOfTradingObjects = 20;
		ArrayList<TradingObject> tradingObjects = new ArrayList<>();
		for (int i = 0; i < numberOfTradingObjects; i++) {
			switch (new Random().nextInt(3)) {
			case 0:
				tradingObjects.add(new MarketTable("na pazara", 8, 6));
				break;
			case 1:
				tradingObjects.add(new StreetShop("na spirkata", 8, 5));
				break;
			case 2:
				tradingObjects.add(new ShopInMall("v mola", 8, 10));
				break;
			}
		}

		Peddler ambulanten = new Peddler("Ambulanten", suppliers);
		SoleTrader ednolichen = new SoleTrader("ET", suppliers);
		ShopChain veriga = new ShopChain("Veriga", suppliers, tradingObjects);

		ArrayList<Trader> traders = new ArrayList<>();
		traders.add(ambulanten);
		traders.add(ednolichen);
		traders.add(veriga);

		while (tradingObjects.size() > 0 && veriga.tradingObjects.size() <= 15) {
			int random = new Random().nextInt(tradingObjects.size());
			if (ednolichen.tradingObject == null && tradingObjects.get(random) instanceof ITradingObjects) {
				ednolichen.tradingObject = (ITradingObjects) tradingObjects.get(random);
				tradingObjects.remove(random);
			}
			else if (ednolichen.tradingObject != null && tradingObjects.get(random) instanceof ITradingObjects
					&& !(tradingObjects.get(random) instanceof ITradingObjectsShopChain) )
				tradingObjects.remove(random);
			else if (tradingObjects.get(random) instanceof ITradingObjectsShopChain) {
				veriga.tradingObjects.add((ITradingObjectsShopChain) tradingObjects.get(random));
				tradingObjects.remove(random);
			}

		}
		for (int day = 1; day < 11; day++) {
			for (int i = 0; i < traders.size(); i++) {
				switch(i){
				case 0:
					System.out.println("Pedler is making order"+"\n");
					break;
				case 1:
					System.out.println("Sole trader is making order"+"\n");
					break;
				case 2:
					System.out.println("Shop chain is making order"+"\n");
					break;
					
				}
				traders.get(i).makeOrder();
				traders.get(i).addTurnoverToMoney();
				traders.get(i).payTax();
				System.out.println("Money balance: " + traders.get(i).getMoney() + "\n");
			}
		}
		int maxNumberOfProductsSold = 0;
		int maxTrader = 0;
		for (int i = 0; i < traders.size(); i++) {
			if(traders.get(i).getNumberOfProductsSold() > maxNumberOfProductsSold){
				maxNumberOfProductsSold = traders.get(i).getNumberOfProductsSold();
				maxTrader = i;
			}
		}
		System.out.println("Trader with max numbers of products sold is; " + traders.get(maxTrader).getName());

	}

}

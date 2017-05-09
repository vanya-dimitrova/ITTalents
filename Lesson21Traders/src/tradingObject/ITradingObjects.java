package tradingObject;

import java.util.ArrayList;

import supplier.Product;

public interface ITradingObjects {
	

	void setTax(int tax);

	double getTax();

	ArrayList<Product> getProducts();
	


}

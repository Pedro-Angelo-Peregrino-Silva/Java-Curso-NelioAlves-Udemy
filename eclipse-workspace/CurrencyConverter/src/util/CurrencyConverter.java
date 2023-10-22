package util;

public class CurrencyConverter {
	
	public double dollarPrice;
	public double buyDollar;
		
	public static double calculator(double dollarPrice, double buyDollar, double paidDollar) {
		return dollarPrice * (buyDollar * (dollarPrice + (dollarPrice * 6) / 100));
	}

}

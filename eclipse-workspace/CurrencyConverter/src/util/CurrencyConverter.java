package util;

public class CurrencyConverter {
	
	public double valorDollarBV;
	public double qntDollar;
			
		
	public static double calculator(double valorDollarBV, double qntDollar) {
		double valorCompraDollar = valorDollarBV * (qntDollar + (qntDollar * 0.06));
				
		return valorCompraDollar;
	}

}

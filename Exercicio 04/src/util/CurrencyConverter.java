package util;

public class CurrencyConverter {
	public static double convert(double price, double value) {
		return (price * 1.06) * value;
	}
}
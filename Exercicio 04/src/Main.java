import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price?");
		double price = sc.nextDouble();

		System.out.println("How many dollars will be bought?");
		double dollarBought = sc.nextDouble();

		System.out.printf("Amount to be paid in reais: %.2f%n", CurrencyConverter.convert(price, dollarBought));

		sc.close();
	}
}
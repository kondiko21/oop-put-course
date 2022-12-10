package lesson3;
import java.util.HashMap;

class FakeCantor {
  private final HashMap<String, Float> rates = new HashMap<>() {{
    put("USD", 1.0366f);
    put("GBP", 0.87063f);
    put("CHF", 0.9881f);
    put("JPY", 145.12f);
  }};


  public float euroToRate(String currency) {
    return this.rates.get(currency);
  }

  public FakeCantor() {
  }

}

interface Currency {
	  Currency addedCurrency(float value, String currency);

	  Currency subtractedCurrency(float value, String currency);

	  String abbreviation();

	  String symbol();

	  String balance();

	  float toDollarExchangeRate();
	}

class Euro implements Currency {
	
	private String currencySymbol;
	private String currencyAbbreviation;
	private float currencyBalance;
	FakeCantor cantor = new FakeCantor();
	
	
	Euro(String symbol, String abbreviation, float balance) {
		this.currencyAbbreviation = abbreviation;
		this.currencyBalance = balance;
		this.currencySymbol = symbol;
	}
	
	Euro(String symbol, String abbreviation) {
		this(symbol, abbreviation, 0);
	}


	@Override
	public Euro addedCurrency(float value, String currency) {
		float exchangeRate = cantor.euroToRate(currency);
		float newValue = value / exchangeRate;
		return new Euro(this.currencySymbol, this.currencyAbbreviation, currencyBalance + newValue);
	}

	@Override
	public Euro subtractedCurrency(float value, String currency) {
		float exchangeRate = cantor.euroToRate(currency);
		float newValue = value / exchangeRate;
		if (newValue <= currencyBalance) {
			return new Euro(this.currencySymbol, this.currencyAbbreviation, newValue);
		} else {
			System.out.println("Not enaugh money to perform substraction");
			return this;
		}
	}

	@Override
	public String abbreviation() {
		return currencyAbbreviation;
	}

	@Override
	public String symbol() {
		return currencySymbol;
	}

	@Override
	public String balance() {
		return Float.toString(currencyBalance);
	}

	@Override
	public float toDollarExchangeRate() {
		return cantor.euroToRate("USD");
	}
	
	
	
}


public class Main {

	public static void main(String[] args) {

		Euro euroPocket = new Euro("€","EUR", 0);
		System.out.println("Current balance: "+euroPocket.balance()+euroPocket.symbol());
		Euro newPocket = euroPocket.addedCurrency(5, "USD");
		System.out.println("Current balance: "+newPocket.balance()+newPocket.symbol());
		
	}

}

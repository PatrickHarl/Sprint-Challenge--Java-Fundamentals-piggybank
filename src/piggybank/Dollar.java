package piggybank;

public class Dollar extends Money {

	public Dollar() {

		super(1.00, 1);
		

	}

	public Dollar(int numCoins) {

		super(1.00, numCoins);

	}

	@Override
	public String toString() {

		return "$" + numCoins;

	}

}
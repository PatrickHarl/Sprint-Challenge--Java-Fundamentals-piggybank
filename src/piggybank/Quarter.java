package piggybank;

public class Quarter extends Money {

	public Quarter() {

		super(0.25, 1);
		

	}

	public Quarter(int numCoins) {

		super(0.25, numCoins);

	}

	@Override
	public String toString() {

		if(numCoins > 1)
		{

			return numCoins + " Quarters";

		} else {

			return numCoins + " Quarter";

		}

	}

}


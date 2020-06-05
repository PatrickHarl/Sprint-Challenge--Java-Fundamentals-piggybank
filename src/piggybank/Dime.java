package piggybank;

public class Dime extends Money {


	public Dime() {

		super(0.10, 1);
		

	}

	public Dime(int numCoins) {

		super(0.10, numCoins);

	}

	@Override
	public String toString() {

		if(numCoins > 1)
		{

			return numCoins + " Dimes";

		} else {

			return numCoins + " Dime";

		}

	}


}
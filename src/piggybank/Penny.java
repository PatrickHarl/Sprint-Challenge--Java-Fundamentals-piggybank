package piggybank;

public class Penny extends Money{


	public Penny() {

		super(0.01, 1);
		

	}

	public Penny(int numCoins) {

		super(0.01, numCoins);

	}

	@Override
	public String toString() {

		if(numCoins > 1)
		{

			return numCoins + " Pennies";

		} else {

			return numCoins + " Penny";

		}

	}


}
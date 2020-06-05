package piggybank;

public class Nickel extends Money{


	public Nickel() {

		super(0.05, 1);
		

	}

	public Nickel(int numCoins) {

		super(0.05, numCoins);

	}

	@Override
	public String toString() {

		if(numCoins > 1)
		{

			return numCoins + " Nickels";

		} else {

			return numCoins + " Nickel";

		}

	}


}
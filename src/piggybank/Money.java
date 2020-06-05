package piggybank;

abstract class Money {

	protected int numCoins;
	protected double faceValue;

	public Money(double faceValue, int numCoins) {

		this.faceValue = faceValue;
		this.numCoins = numCoins;

	}

	public int getNumCoins() {


		return numCoins;


	}

	public void setNumCoins(int numCoins) {

		this.numCoins = numCoins;

	}

	public double getFaceValue() {


		return faceValue;


	}

	public void setFaceValue(double faceValue) {

		this.faceValue = faceValue;

	}

	public double getTotalValue() {

		return faceValue * numCoins;

	}


}
package piggybank;

import java.util.*;

public class Main {
	

	public static void subtract(double amount, double count, List<Money> bank) {




		double total = 0;
		int dollars = (int)amount;
		int quarters = (int)((amount - dollars) / 0.25);
		int dimes = (int)((amount - dollars - (quarters * 0.25)) / 0.10);
		int nickels = (int)((amount - dollars - (quarters * 0.25) - (dimes * 0.10)) / 0.05);
		int pennies = (int)((amount - dollars - (quarters * 0.25) - (dimes * 0.10) - (nickels * 0.05)) / 0.01);

		

		if(amount > count)
		{

			System.out.println("You don't have enough money!");

		} else {


			for (Money m : bank) {


				if(m instanceof Dollar)
				{

					if(m.getNumCoins() > dollars)
					{

						m.setNumCoins(m.getNumCoins() - dollars);
						dollars = 0;

					} else if(m.getNumCoins() == dollars) {

						m.setNumCoins(0);
						dollars = 0;

					} else {

						dollars -= m.getNumCoins();
						quarters += (dollars * 4);
						dollars = 0;

						m.setNumCoins(0);

					}


				}

				if(m instanceof Quarter)
				{

					if(m.getNumCoins() > quarters)
					{

						m.setNumCoins(m.getNumCoins() - quarters);
						quarters = 0;

					} else if(m.getNumCoins() == quarters) {

						m.setNumCoins(0);
						quarters = 0;

					} else {

						quarters -= m.getNumCoins();
						dimes += (quarters * 2);
						nickels += (quarters);
						quarters = 0;

						m.setNumCoins(0);

					}


				}

				if(m instanceof Dime)
				{

					if(m.getNumCoins() > dimes)
					{

						m.setNumCoins(m.getNumCoins() - dimes);
						dimes = 0;

					} else if(m.getNumCoins() == dimes) {

						m.setNumCoins(0);
						dimes = 0;

					} else {

						dimes -= m.getNumCoins();
						nickels += (dimes * 2);
						dimes = 0;

						m.setNumCoins(0);

					}


				}

				if(m instanceof Nickel)
				{

					if(m.getNumCoins() > nickels)
					{

						m.setNumCoins(m.getNumCoins() - nickels);
						nickels = 0;

					} else if(m.getNumCoins() == nickels) {

						m.setNumCoins(0);
						nickels = 0;

					} else {

						nickels -= m.getNumCoins();
						pennies += (nickels * 5);
						nickels = 0;

						m.setNumCoins(0);

					}


				}

				if(m instanceof Penny)
				{

					if(m.getNumCoins() > pennies)
					{

						m.setNumCoins(m.getNumCoins() - pennies);
						pennies = 0;

					} else if(m.getNumCoins() == pennies) {

						m.setNumCoins(0);
						pennies = 0;

					} else {

						pennies -= m.getNumCoins();
						pennies = 0;
						
						m.setNumCoins(0);
					}


				}

		}


		}

		for (Money m : bank) {

 			System.out.println(m);

 		}

		for (Money m : bank) {

 			
 			total += m.getTotalValue();


 		}
		
		System.out.println();
		System.out.println("The piggy bank holds $" + String.format("%.2f", total));


		

	}

	public static void main(String[] args) {

		List<Money> piggyBank = new ArrayList<>();
		double count = 0;

		piggyBank.add(new Quarter());
 		piggyBank.add(new Dime());
 		piggyBank.add(new Dollar(5));
 		piggyBank.add(new Nickel(3));
 		piggyBank.add(new Dime(7));
 		piggyBank.add(new Dollar());
 		piggyBank.add(new Penny(10));

 		for (Money m : piggyBank) {

 			System.out.println(m);

 		}

 		for (Money m : piggyBank) {

 			
 			count += m.getTotalValue();


 		}

 		System.out.println();
 		System.out.println("The piggy bank holds $" + String.format("%.2f", count));
 		System.out.println();

 		subtract(1.50, count, piggyBank);


	}

}
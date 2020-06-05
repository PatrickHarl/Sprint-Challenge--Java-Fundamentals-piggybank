package piggybank;

import java.util.*;

public class Main {
	

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

	}

}
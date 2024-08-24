// YOUR NAME:
// DATE:

public class Main
{
	public static void main(String[] args)
	{
		//DECLARATION + INITIALIZATION SECTION
		double avgDacaTaxContribution;

		char stateMostDaca1 = 'c';
		char stateMostDaca2 = 'a';

		int numDacaRecipients = 700000;
		long dacaFederalTaxRevenue = 5700000000L;

		//INPUT SECTION
		// N/A

		//CALCULATION SECTION
		avgDacaTaxContribution = dacaFederalTaxRevenue / (double) numDacaRecipients;
		stateMostDaca1 -= 32;
		stateMostDaca2 -= 32;

		//OUTPUT SECTION
		System.out.println("Average DACA recipient tax contribution: $" + avgDacaTaxContribution);

//		System.out.println("Average DACA recipient tax contribution: $" + ((int)(100*avgDacaTaxContribution))/100.0);

		System.out.println("Average DACA recipient tax contribution, rounded down to the nearest whole dollar: $" + (int) avgDacaTaxContribution);

		System.out.println("State with the most DACA recipients: " + stateMostDaca1 + stateMostDaca2);
	}
}
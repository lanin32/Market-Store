
public class Main 
{
	public static void main(String args[])
	{
		//bronze card case 1
		BronzeCard bc1 = new BronzeCard("Customer 1", 50);
		bc1.purchaseInfo(300);
		//bronze card case 2
		BronzeCard bc2 = new BronzeCard("Customer 2", 120);
		bc2.purchaseInfo(200);
		// bronze card case 3
		BronzeCard bc3 = new BronzeCard("Customer 3", 350);
		bc3.purchaseInfo(600);		
		//silver card case 1
		SilverCard sc1 = new SilverCard("Customer 4", 200);
		sc1.purchaseInfo(400);
		//silver card case 2
		SilverCard sc2 = new SilverCard("Customer 5", 450);
		sc2.purchaseInfo(700);
		//gold card case 1 (turnover below 200)
		GoldCard gc1 = new GoldCard("Customer 6", 170);
		gc1.purchaseInfo(530.50);
		//gold card case 2 (turnover between 200 and 1000)
		GoldCard gc21 = new GoldCard("Customer 7", 420);
		gc21.purchaseInfo(670.99);
		GoldCard gc22 = new GoldCard("Customer 8", 790);
		gc22.purchaseInfo(1800);
		//gold card case 3 (turnover above 1000)
		GoldCard gc3 = new GoldCard("Customer 9",2700);
		gc3.purchaseInfo(700);
	}
}


public class Main 
{
	public static void main(String args[])
	{
		//bronze card case 1
		BronzeCard bc1 = new BronzeCard("Customer with bronze card 1", 90);
		System.out.printf("Client: %s\n", bc1.getOwner());
		bc1.purchaseInfo(300);
		//bronze card case 2
		BronzeCard bc2 = new BronzeCard("Customer with bronze card 2", 120);
		System.out.printf("Client: %s\n", bc2.getOwner());
		bc2.purchaseInfo(200);
		// bronze card case 3
		BronzeCard bc3 = new BronzeCard("Customer with bronze card 3", 310);
		System.out.printf("Client: %s\n", bc3.getOwner());
		bc3.purchaseInfo(600);		
		//silver card case 1
		SilverCard sc1 = new SilverCard("Customer with silver card 1", 200);
		System.out.printf("Client: %s\n", sc1.getOwner());
		sc1.purchaseInfo(400);
		//silver card case 2
		SilverCard sc2 = new SilverCard("Customer with silver card 2", 450);
		System.out.printf("Client: %s\n", sc2.getOwner());
		sc2.purchaseInfo(700);
		//gold card case 1 (turnover below 200)
		GoldCard gc1 = new GoldCard("Customer with gold card 1", 170);
		System.out.printf("Client: %s\n", gc1.getOwner());
		gc1.purchaseInfo(530.50);
		//gold card case 2 (turnover between 200 and 1000)
		GoldCard gc21 = new GoldCard("Customer with gold card 2", 420);
		System.out.printf("Client: %s\n", gc21.getOwner());
		gc21.purchaseInfo(670.99);
		GoldCard gc22 = new GoldCard("Customer with gold card 3", 790);
		System.out.printf("Client: %s\n", gc22.getOwner());
		gc22.purchaseInfo(1800);
		//gold card case 3 (turnover above 1000)
		GoldCard gc3 = new GoldCard("Customer with gold card 4",2700);
		System.out.printf("Client: %s\n", gc3.getOwner());
		gc3.purchaseInfo(700);
	}
}

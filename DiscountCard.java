
public abstract class DiscountCard 
{
	private String owner;
	protected double turnover;
	protected double initialDiscountRate;
	
	abstract double discountRate();	
	public String getOwner()
	{
		return owner;
	}
	
	public void purchaseInfo(double purchaseValue)
	{
		System.out.printf("Purchase value: $%.2f\n", purchaseValue);
		double discountRate = discountRate();
		System.out.printf("Discount rate: %.1f%%\n", discountRate);
		double discount = (discountRate/100)*purchaseValue;
		System.out.printf("Discount: $%.2f\nTotal: $%.2f\n--------------------\n", discount,purchaseValue-discount);
	}
	
	DiscountCard(String owner, double turnover)
	{
		this.owner=owner;
		this.turnover=turnover;
	}
}

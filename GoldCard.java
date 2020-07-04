
public class GoldCard extends DiscountCard 
{
	@Override
	double discountRate() 
	{
		if(turnover/100>10)return 10;
		else if(turnover/100>initialDiscountRate)return (int)turnover/100;
		else return initialDiscountRate;
	}

	GoldCard(String owner, double turnover)
	{
		super(owner,turnover);
		initialDiscountRate=2;
	}
}

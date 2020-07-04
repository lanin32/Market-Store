
public class SilverCard extends DiscountCard 
{
	@Override
	double discountRate() 
	{
		if(turnover>300)return 3.5;
		return initialDiscountRate;
	}

	SilverCard(String owner, double turnover)
	{
		super(owner,turnover);
		initialDiscountRate=2;
	}
}

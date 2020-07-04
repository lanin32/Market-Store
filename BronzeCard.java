
public class BronzeCard extends DiscountCard 
{
	@Override
	double discountRate() {
		if(turnover<100)return initialDiscountRate;
		else if(turnover>=100 && turnover<=300)return 1;
		else return 2.5;
	}

	BronzeCard(String owner, double turnover)
	{
		super(owner,turnover);
		initialDiscountRate=0;
	}
	
}

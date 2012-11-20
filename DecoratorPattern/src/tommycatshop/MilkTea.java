package tommycatshop;

/** Implementation Milk tea that one of beverage */
public class MilkTea implements Beverage {

	@Override
	public double getCost() {
		return 20;
	}

	@Override
	public String getDescription() {
		return "Milk Tea";
	}

}

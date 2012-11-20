package tommycatshop;

/** Implementation Green tea that one of beverage */
public class GreenTea implements Beverage {

	@Override
	public double getCost() {
		return 30;
	}

	@Override
	public String getDescription() {
		return "Green Tea";
	}

}

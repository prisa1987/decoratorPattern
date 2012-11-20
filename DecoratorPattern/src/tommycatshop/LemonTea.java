package tommycatshop;

/** Implementation Lemon tea that one of beverage */
public class LemonTea implements Beverage {

	@Override
	public double getCost() {
		return 25;
	}

	@Override
	public String getDescription() {
		return "Lemon Tea";
	}

}

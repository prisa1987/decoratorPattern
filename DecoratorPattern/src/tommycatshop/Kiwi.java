package tommycatshop;

/** Implementation Kiwi that one of beverage */
public class Kiwi implements Beverage {

	@Override
	public double getCost() {
		return 25;
	}

	@Override
	public String getDescription() {
		return "Kiwi";
	}

}

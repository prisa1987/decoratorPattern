package tommycatshop;

/** Toping is the Decorator ,each toping is added rely on customer */
public class Toping implements Beverage {
	Beverage beverage;
	String beverageDescription = "";

	public Toping(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public double getCost() {
		return beverage.getCost();
	}

	@Override
	public String getDescription() {
		return beverage.getDescription();
	}
}

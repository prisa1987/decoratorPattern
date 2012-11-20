package tommycatshop;

/** PuddingToping is ConcreteDecorator that want you add in your beverage */
public class PuddingToping extends Toping {

	public PuddingToping(Beverage beverage) {
		super(beverage);
	}

	public double getCost() {
		return beverage.getCost() + 10;
	}

	public String getDescription() {
		return beverage.getDescription() + " + Pudding";
	}

}

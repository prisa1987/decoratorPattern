package tommycatshop;

/** JellyToping is ConcreteDecorator that want you to add jelly in your beverage */
public class JellyToping extends Toping {

	public JellyToping(Beverage beverage) {
		super(beverage);
	}

	public double getCost() {
		return beverage.getCost() + 5;
	}

	public String getDescription() {
		return beverage.getDescription() + " + Jelly";
	}

}

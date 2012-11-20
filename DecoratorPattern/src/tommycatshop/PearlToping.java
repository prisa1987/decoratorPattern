package tommycatshop;

/** PearlToping is ConcreteDecorator that want you to add pearl in your beverage */
public class PearlToping extends Toping {

	public PearlToping(Beverage beverage) {
		super(beverage);
	}

	public double getCost() {
		return 5 + beverage.getCost();
	}

	public String getDescription() {
		return beverage.getDescription() + " + Pearl";
	}
	
}

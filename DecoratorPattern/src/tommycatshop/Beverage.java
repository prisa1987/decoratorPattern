package tommycatshop;

/** Beverage interface defines the functionality Beverage implemented */
public interface Beverage {
	/**
	 * Calculate the cost of your order
	 * @return cost of the beverage that you want
	 */
	public double getCost();
	/**
	 * Show description of your order
	 * @return description of the beverage that you want
	 */
	public String getDescription();
}

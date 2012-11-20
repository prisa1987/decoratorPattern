package tommycatshop;

public class TommyCat {
	public static void main(String[] args) {
		Beverage beverage = new MilkTea();
		beverage = new PearlToping(beverage);
		beverage = new PuddingToping(beverage);
		beverage = new PuddingToping(beverage);

		System.out.println("Your order: "+beverage.getDescription());
		System.out.println("Cost: "+beverage.getCost());
	}
}

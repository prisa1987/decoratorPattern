package tommycatshop;

import java.util.Scanner;

public class TommyCatShop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Hello, What would you like");
		System.out.println("1)Milk Tea");
		System.out.println("2)Green tea");
		System.out.println("3)Lemon tea");
		System.out.println("4)Kiwi");
		int bev = input.nextInt();
		Beverage beverage = new MilkTea();

		switch (bev) {

		case 1:
			beverage = new MilkTea();
			break;

		case 2:
			beverage = new GreenTea();
			break;

		case 3:
			beverage = new LemonTea();
			break;

		case 4:
			beverage = new Kiwi();
			break;

		default:
			System.out.println("No beverage that you want");
			System.exit(0);

		}

		System.out.println("Ok,you order: " + beverage.getDescription());
		System.out.println();
		System.out.println("Do you want any topping");
		System.out.println("1)Pearl");
		System.out.println("2)Jelly");
		System.out.println("3)pudding");
		System.out.println("4)End");

		int topp = input.nextInt();
		String des = "";
		a: while (true) {

			switch (topp) {

			case 1:
				beverage = new PearlToping(beverage);
				break;

			case 2:
				beverage = new JellyToping(beverage);
				break;

			case 3:
				beverage = new PuddingToping(beverage);
				break;

			case 4:
				break a;

			default:
				break a;

			}
			topp = input.nextInt();
		}
		des = beverage.getDescription();
		double cost = beverage.getCost();
		System.out.println("Your Order: " + des + " " + cost + " Baht");

	}

}

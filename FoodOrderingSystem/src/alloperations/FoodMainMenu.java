package alloperations;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FoodMainMenu {

	public static void main(String[] args) {

		Food fObj;
		Scanner sc = new Scanner(System.in);

		try {

			System.out.println("Enter Food Item ID: ");
			int itemID = sc.nextInt();

			System.out.println("Enter Food Item Name: ");
			String itemName = sc.next();
			sc.nextLine();

			System.out
					.println("How many Items do you need? (Please enter numeric values only (ex. 1, 10, 50): ");
			int quantity = sc.nextInt();

			if (itemName.equalsIgnoreCase("Pizza")) {

				fObj = new Pizza(itemID, itemName, quantity, 230);

				System.out
						.println("==========ORDER DETAILS====================");

				System.out.println("Order Item ID: " + fObj.getFoodID());
				System.out.println("Order Item Name: " + fObj.getFoodName());
				System.out.println("Price per Item: " + fObj.getItemPrice());
				System.out.println("Qty: " + fObj.getQuantity());
				System.out.println("Normal Discount: "
						+ fObj.discountPercentage());

				System.out.println();

				System.out
						.printf("Total Price (B): %.2f \n", fObj.totalPrice());
				System.out
						.printf("Total Price: %.2f \n\n", fObj.totalPrice(30));

				System.out
						.println("***PLEASE NOTE THAT TOTAL PRICE INCLUSIVED WITH SPECIAL DISCOUNTS IF APPLICABLE****");

			} else if (itemName.equalsIgnoreCase("Rice")) {

				fObj = new Rice(itemID, itemName, quantity, 230);

				System.out
						.println("==================================ORDER DETAILS==================================");

				System.out.println("Order Item ID: " + fObj.getFoodID());
				System.out.println("Order Item Name: " + fObj.getFoodName());
				System.out.println("Price per Item: " + fObj.getItemPrice());
				System.out.println("Qty: " + fObj.getQuantity());
				System.out.println("Normal Discount: "
						+ fObj.discountPercentage());

				System.out.println();

				System.out.printf("Total Price: %.2f \n\n", fObj.totalPrice());
				System.out
						.println("***PLEASE NOTE THAT TOTAL PRICE INCLUSIVED WITH SPECIAL DISCOUNTS IF APPLICABLE****");

			} else if (itemName.equalsIgnoreCase("Dezzert")) {

				fObj = new Dezzert(itemID, itemName, quantity, 230);
				System.out.println("TOTAL PRICE: " + fObj.totalPrice());

				System.out
						.println("==========ORDER DETAILS====================");

				System.out.println("Order Item ID: " + fObj.getFoodID());
				System.out.println("Order Item Name: " + fObj.getFoodName());
				System.out.println("Price per Item: " + fObj.getItemPrice());
				System.out.println("Qty: " + fObj.getQuantity());
				System.out.println("Normal Discount: "
						+ fObj.discountPercentage());

				System.out.println();

				System.out.printf("Total Price: %.2f \n\n", fObj.totalPrice());
				System.out
						.println("***PLEASE NOTE THAT TOTAL PRICE INCLUSIVED WITH SPECIAL DISCOUNTS IF APPLICABLE****");

			} else {

				fObj = new Food(itemID, itemName, quantity, 230);
				System.out.println("TOTAL PRICE: " + fObj.totalPrice());

				System.out
						.println("==========ORDER DETAILS====================");

				System.out.println("Order Item ID: " + fObj.getFoodID());
				System.out.println("Order Item Name: Food");
				System.out.println("Price per Item: " + fObj.getItemPrice());
				System.out.println("Qty: " + fObj.getQuantity());
				System.out.println("Normal Discount: "
						+ fObj.discountPercentage());

				System.out.println();

				System.out.printf("Total Price: %.2f \n\n", fObj.totalPrice());
				System.out.println("***PLEASE NOTE THAT TOTAL PRICE " +
						           "INCLUSIVED WITH SPECIAL DISCOUNTS IF APPLICABLE****");

			}
		}

		catch (InputMismatchException ex) {

			System.out
					.println("Invalid Input type. Please provide Correct Input types !");
		}
	}

}

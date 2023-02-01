package SinglyLinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductListMain {

	public static void main(String[] args) {
		int option = 0;
		int position = 0;
		ProductList list1 = new ProductList();
		do {
			System.out.println("Choices for Employee operation are:");
			System.out.println("1. Insert Product at Last");
			System.out.println("2. Insert Product at first");
			System.out.println("3. Remove Product at Last");
			System.out.println("4. Remove Product at first");
			System.out.println("5. Display All Product");
			System.out.println("6. Product with cost >=2500 and <=5000");
			System.out.println("7. Reverse using recursion");
			System.out.println("8. Exit");
			System.out.println("Enter Your Choice:");
			Scanner sc = new Scanner(System.in);
			option = sc.nextInt();
			switch (option) {
			case 1:
				System.out.println("Enter Product Id: ");
				int prodid = sc.nextInt();
				System.out.println("Enter name: ");
				String name = sc.next();
				System.out.println("Enter Cost:");
				int prodcost = sc.nextInt();
				Product prod1 = new Product(prodid, name, prodcost);
				list1.insertLast(prod1);
				break;
			case 2:
				System.out.println("Enter Product Id: ");
				int prodid1 = sc.nextInt();
				System.out.println("Enter name: ");
				String name1 = sc.next();
				System.out.println("Enter Cost:");
				int prodcost1 = sc.nextInt();
				Product prod2 = new Product(prodid1, name1, prodcost1);
				list1.insertFirst(prod2);
				break;
			case 3:
				list1.removeLast();
				break;
			case 4:
				list1.removeFirst();
				break;
			case 5:
				System.out.println("Product list:");
				System.out.println(list1.toString());
				break;
			case 6:
				list1.productbetweencost();
				break;
			case 7:
				list1.reverseRecurrsive();
				break;
			case 8:
				System.exit(0);
				break;
			default:
				System.out.println("Plz select correct option.");
				sc.close();
				break;
			}
		} while (option != 0);
	}

}

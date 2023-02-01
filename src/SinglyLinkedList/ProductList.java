package SinglyLinkedList;

import java.util.ArrayList;
import java.util.List;

public class ProductList {

	private Node head;

	public ProductList() {
		head = null;
	}

	public ProductList(Node head) {
		this.head = head;
	}

	public Node getHead() {
		return head;
	}

	public void insertFirst(Product emp) {
		Node newNode = new Node(emp);
		newNode.setNext(head);
		head = newNode;
		System.out.println("Product inserted successfully");
	}

	public void insertLast(Product emp) {
		Node newNode = new Node(emp);
		if (head == null) {
			head = newNode;
			System.out.println("Product inserted successfully");
			return;
		}
		Node iterator = head;
		while (iterator.getNext() != null) {
			iterator = iterator.getNext();
		}
		iterator.setNext(newNode);
		System.out.println("Product inserted successfully");
		return;
	}

	public Product removeLast() {
		Product data = null;
		if (head == null) {
			return data;
		}
		if (head.getNext() == null) {
			data = head.getData();
			head = null;
			return data;
		}
		Node iterator = head;
		while (iterator.getNext().getNext() != null) {
			iterator = iterator.getNext();
		}
		Node deletable = iterator.getNext();
		data = deletable.getData();
		iterator.setNext(null);
		deletable = null;
		return data;

	}

	public Product removeFirst() {
		Product data = null;
		if (head == null) {
			return data;
		}
		Node deletable = head;
		data = deletable.getData();
		head = head.getNext();
		deletable = null;
		return data;
	}

	public String toString() {
		if (head == null) {
			return "List is empty!";
		}
		String listData = "";
		Node iterator = head;
		while (iterator != null) {
			listData = listData + " " + iterator.getData();
			iterator = iterator.getNext();
		}
		return listData;
	}

	public void reverseRecurrsive() {
		if (head == null)
			return;
		if (head.getNext() == null)
			return;
		Node last = head;
		head = last.getNext();
		reverseRecurrsive();
		last.getNext().setNext(last);
		last.setNext(null);
	}

	public void productbetweencost() {
		List<Product> l1 = new ArrayList<>();
		Node iterator = head;
		while (iterator != null) {
			l1.add(iterator.getData());
		}
		for (Product pr : l1) {
			if (pr.getProd_cost() >= 2500 && pr.getProd_cost() <= 5000) {
				System.out.println(pr);
			}
		}
	}

}

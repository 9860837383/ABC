package SinglyLinkedList;

public class Node {
	private Product data;
	private Node next;
	
	public Node() {
		data=null;
		next = null;
	}
	
	public Node(Product emp) {
		this.data=emp;
		next = null;
	}

	public Product getData() {
		return data;
	}

	public void setData(Product emp) {
		this.data = emp;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + ( next== null ? "null" : hashCode() )+ "]";
	}















}

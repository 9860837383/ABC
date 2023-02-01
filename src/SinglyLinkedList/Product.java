package SinglyLinkedList;

public class Product {
	private int produ_id;
	private String prod_name;
	private int prod_cost;
	
	public Product() {

	}

	public Product(int produ_id, String prod_name, int prod_cost) {
		super();
		this.produ_id = produ_id;
		this.prod_name = prod_name;
		this.prod_cost = prod_cost;
	}

	public int getProdu_id() {
		return produ_id;
	}

	public void setProdu_id(int produ_id) {
		this.produ_id = produ_id;
	}

	public String getProd_name() {
		return prod_name;
	}

	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}

	public int getProd_cost() {
		return prod_cost;
	}

	public void setProd_cost(int prod_cost) {
		this.prod_cost = prod_cost;
	}

	@Override
	public String toString() {
		return "Product [produ_id=" + produ_id + ", prod_name=" + prod_name + ", prod_cost=" + prod_cost + "]";
	}
	
	
	

}

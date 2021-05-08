package Entities;

public class Campaigning {
	private int Id;
	private String name;
	private double discount;
	
	public Campaigning() {
		
	}

	public Campaigning(int id, String name, double discount) {
		super();
		Id = id;
		this.name = name;
		this.discount = discount;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
}


public class Bike1 {
	String brand;
	int price;
	String color;

	public Bike1(String brand, int price, String color) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	Engine1 bikeEngine = new Engine1("single", 24);// composition
}

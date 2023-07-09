
public class Car1 {
	String color;
	String brand;
	int price;

	public Car1(String brand, String color, int price) {
		super();
		this.color = color;
		this.price = price;
		this.brand = brand;
	}

	Engine1 carEngine = new Engine1("hybrid", 35);// composition
}

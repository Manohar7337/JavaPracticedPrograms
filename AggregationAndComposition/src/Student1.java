
public class Student1 extends Human1 {
	public void accept1(Book1 ref) {// aggregation
		System.out.println(ref.author + " is the author of the book");
		System.out.println(ref.name + " is the name of the book");
		System.out.println(ref.price + " is the final price of the book");
	}

	public void accept2(Bike1 ref) {// aggragation
		System.out.println(ref.brand + " is the bike's brand");
		System.out.println(ref.color + " is the bike's color");
		System.out.println(ref.price + " is the bike's price");
		System.out.println("Bike's bhp is " + ref.bikeEngine.bhp);
		System.out.println("Bike's engine type is " + ref.bikeEngine.type);
	}

	public void accept3(Car1 ref) {// aggregation
		System.out.println(ref.brand + " is the car's brand");
		System.out.println(ref.color + " is the car's color");
		System.out.println(ref.price + " is the car's price");
		System.out.println("car's bhp is " + ref.carEngine.type);
		System.out.println("car's bhp is " + ref.carEngine.bhp);
	}
}


public class Student1App {

	public static void main(String[] args) {
		Student1 stu = new Student1();
		// objects present in bike car and human all are executed
		System.out.println(stu.heart.color);
		System.out.println(stu.heart.weight);
		System.out.println(stu.brain.color);
		System.out.println(stu.brain.weight);
		Book1 book = new Book1("Manohar", 500, "Javabook");
		Bike1 bike = new Bike1("Pulsar", 100000, "Black");
		Car1 car = new Car1("Benz", "Grey", 1000000);
		stu.accept1(book);
		stu.accept2(bike);
		stu.accept3(car);
		System.out.println("Bike's bhp is "+bike.bikeEngine.bhp);
		System.out.println("Bike's engine type is "+bike.bikeEngine.type);
		System.out.println("car's bhp is "+car.carEngine.type);
		System.out.println("car's bhp is "+car.carEngine.bhp);
		stu = null;
		// composite objects can not be accessed if enclosing object is destroyed
		// System.out.println("Student is destroyed");
		// System.out.println(stu.heart.color);
		// System.out.println(stu.heart.weight);
		// System.out.println(stu.brain.color);
		// aggregate objects can be accessed if enclosing object is destroyed
		System.out.println(bike.brand);
		System.out.println(bike.color);
		System.out.println(bike.price);
	}

}

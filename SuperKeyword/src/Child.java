
public class Child extends Parent {
	int a = 20;

	void display() {
		System.out.println("a= " + a);
		System.out.println("super.a= " + super.a);
		System.out.println("Hello how are you...");
		super.displya();
	}
}

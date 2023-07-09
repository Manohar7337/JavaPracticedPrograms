
public class Dog {
	int cost;
	String color,breed, name, gender;
	void eat() {
		System.out.println("dog is eating");
	}
	void sleep() {
		System.out.println("dog is sleeping");
	}
	void bark() {
		System.out.println("dog is barking");
	}
	void bite() {
		System.out.println("dog is biting");
	}

	public static void main(String[] args) {
		Dog d=new Dog();
		d.name="Tiger";
		d.color="white";
		d.breed="bochukukka";
		d.cost=5000;
		Dog d1=new Dog();
		
		d1.name="Tiger1";
		d1.color="white1";
		d1.breed="bochukukka1";
		d1.cost=5001;
		d.eat();
		d1.eat();
		d.sleep();
		d1.sleep();
		d.bite();
		d1.bite();
		System.out.println("color is"+d.color);
		System.out.println("color is"+d1.color);
		System.out.println("name is"+d.name);
		System.out.println("name is"+d1.name);
		System.out.println("gender is"+d.gender);
		System.out.println("cost is"+d.cost);
		
		
		

	}

}

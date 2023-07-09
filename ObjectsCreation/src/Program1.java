
public class Program1 {
String name;
int id;
String gender;
void eat() {
	System.out.println("Student is eating");
}
void sleep() {
	System.out.println("Student is sleeping");
}
void study() {
	System.out.println("Student is Studying");
}
	public static void main(String[] args) {
		Program1 a1=new Program1();
		Program1 a2=new Program1();
		Program1 a3=new Program1();
		a1.eat();
		a2.sleep();
		a3.study();

	}

}

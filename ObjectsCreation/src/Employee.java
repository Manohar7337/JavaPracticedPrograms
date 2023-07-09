
public class Employee {
int id,salary;
String name;
void eat() {
	System.out.println("employee is eating");
}
void sleep() {
	System.out.println("employee is sleeping");
}
void work() {
	System.out.println("employee is working");
}
public static void main(String[] args) {
	Employee e1=new Employee();
	e1.id=123;
	e1.name="Manohar";
	e1.salary=50000;
	e1.eat();
	e1.sleep();
	e1.work();
	System.out.println(e1.id);
	System.out.println(e1.salary);
	System.out.println(e1.name);
	
}
}

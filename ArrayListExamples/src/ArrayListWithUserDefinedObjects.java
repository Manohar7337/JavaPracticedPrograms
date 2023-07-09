import java.util.ArrayList;
class Person{
	private String name;
	private int age;
	public Person(String name,int age){
	name=this.name;
	age=this.age;
	}
	public void printdata() {
		System.out.println(name+" "+age);
	}
}
public class ArrayListWithUserDefinedObjects {

	public static void main(String[] args) {
		ArrayList<Person> al=new ArrayList<Person>(3);
		al.add(new Person("Manohar",22));
		al.add(new Person("Manu", 23));
		al.add(new Person("Ram", 25));
		al.add(new Person("sita",23));
		al.forEach(p -> p.printdata());
	}

}

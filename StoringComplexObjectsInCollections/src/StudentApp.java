import java.util.ArrayList;

class Student {
	int rollNo;
	String Name;
	float percentage;

	// constructor for initialization
	public Student(int rollNo, String Name, float percentage) {
		this.rollNo = rollNo;
		this.Name = Name;
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[rollNo= "+rollNo+" Name= "+Name+" percentage= "+percentage+"]";
	}
	
}

public class StudentApp {

	public static void main(String[] args) {
		// create objects of Student Class
		Student s1 = new Student(12, "Manohar", 90.1F);
		Student s2 = new Student(3, "Soumya", 91.2F);
		Student s3 = new Student(6, "Shivani", 92.3F);
		Student s4 = new Student(13, "Pushpa", 97.2F);
		// create an arraylist and all all the complex objects to arrayList
		ArrayList<Object> al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		System.out.println(al);//it will print hashcodes if you don't override toString()
	}

}

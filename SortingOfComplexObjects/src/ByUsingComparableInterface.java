import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

class Student implements Comparable<Student>{
	int rollNo;
	String Name;
	float grade;

	// constructor
	public Student(int rollNo, String Name, float grade) {
		this.rollNo = rollNo;
		this.Name = Name;
		this.grade = grade;
	}

	// override the toString() method
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return rollNo + " " + Name + " " + grade;
	}
	//override the compareTo() method
	

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(this.rollNo>o.rollNo) {
			return 1;
		}
		
		else {
			return -1;
		}
	}

	
}

public class ByUsingComparableInterface {

	public static void main(String[] args) {
		// create objects of Students
		Student s1 = new Student(20, "Bhavani", 9.0f);
		Student s2 = new Student(19, "Sravani", 8.5f);
		Student s3 = new Student(22, "Madhu", 8.8f);
		Student s4 = new Student(17, "Pushpa", 9.8f);
		// create an arrayList
		ArrayList al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		System.out.println(al);
		//sort these by using Collections.sort()
		Collections.sort(al);//
		System.out.println("sorted by using collecions.sort()");
		System.out.println(al);
		System.out.println("=============================");
		//alternate choice by using TreeSet
		TreeSet ts=new TreeSet<>();
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		System.out.println("printing by treeset automatically gives sorted sequence");
		System.out.print(ts+" ");
}

}

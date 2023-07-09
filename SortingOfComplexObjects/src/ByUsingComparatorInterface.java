

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

class Student1 {
	int rollNo;
	String Name;
	float grade;

	// constructor
	public Student1(int rollNo, String Name, float grade) {
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
	

	}
class HelpingSort implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		if(((Student1)(o1)).rollNo>((Student1)(o2)).rollNo) {
			return 1;
			
		}
		else {
			return -1;
		}
	}
}

	

public class ByUsingComparatorInterface {
	public static void main(String args[]) {
		Student1 s1 = new Student1(20, "Bhavani", 9.0f);
		Student1 s2 = new Student1(19, "Sravani", 8.5f);
		Student1 s3 = new Student1(22, "Madhu", 8.8f);
		Student1 s4 = new Student1(17, "Pushpa", 9.8f);
		// create an arrayList
		ArrayList al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		System.out.println(al);
		HelpingSort hs=new HelpingSort();
		//sort these by using Collections.sort()
		Collections.sort(al,hs);//
		System.out.println("sorted by using collecions.sort()");
		System.out.println(al);
		System.out.println("=============================");
	}
	
}
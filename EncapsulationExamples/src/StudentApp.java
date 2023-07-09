class Student{
	private int id;
	private String name;
	private int age;
	public void setData(int id,String name,int age) {
		if(id>=0 && name.length()>0 && age>=21) {
			this.id=id;
			this.name=name;
			this.age=age;
		}
		else {
			System.out.println("enter valid data");
		}
		
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;	
	}
	public int getAge() {
		return age;
	}
	
}
public class StudentApp {

	public static void main(String[] args) {
		Student stu=new Student();
		stu.setData(1, "Manohar", 22);
		//stu.id=2; private data is invisible
		System.out.println(stu.getId());
		System.out.println(stu.getName());
		System.out.println(stu.getAge());
	}

}

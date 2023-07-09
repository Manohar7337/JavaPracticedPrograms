
public class PlayerApp {

	public static void main(String[] args) {
		CricketPlayer cp = new CricketPlayer();
		/*
		 * while creating the object of the sub class the parent class constructor will
		 * also be executed due to constructor chaining
		 */
		cp.id = 10;
		cp.name = "Sachin";
		cp.gender = "Male";
		cp.no_of_matches = 100;
		cp.runs = 4000;
		cp.no_of_MOM = 10;
		System.out.println("the data from both the classes are accessed \n " + "" + cp.name + " " + cp.id + " "
				+ cp.gender + " " + cp.no_of_matches + " " + cp.runs + " " + cp.no_of_MOM);
	}

}

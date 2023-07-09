
public class PlayerApp1 {

	public static void main(String[] args) {
		CricketPlayer1 cp = new CricketPlayer1();
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
		/*
		 * try executing the below lines of code it will give error it will give the
		 * error as data is not visible cp.accountNo=1234;//error because private member
		 * cp.password=1234;//error because private member
		 */
		System.out.println("the data from both the classes are accessed \n " + "" + cp.name + " " + cp.id + " "
				+ cp.gender + " " + cp.no_of_matches + " " + cp.runs + " " + cp.no_of_MOM);
		// the below line also tells us data is not visible
//System.out.println(cp.accountNo+cp.password);
	}

}

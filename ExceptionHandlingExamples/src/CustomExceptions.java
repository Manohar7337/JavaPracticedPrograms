import java.util.Scanner;

class UnderAgeException extends Exception {
	@Override
	public String getMessage() {

		return "You are too young to get married";
	}
}

class OverAgeException extends Exception {
	@Override
	public String getMessage() {
		return "You are too old for marriage";
	}
}

class Applicant {
	int age;

	void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter age");
		age = scan.nextInt();
		
	}

	void verify() throws UnderAgeException, OverAgeException {
		if (age < 21) {
			UnderAgeException uae = new UnderAgeException();
			System.out.println(uae.getMessage() + " " + age);
			throw uae;
		} else if (age > 45) {
			OverAgeException oae = new OverAgeException();
			System.out.println(oae.getMessage() + " " + age);
			throw oae;
		} else {
			System.out.println("Congratulation your application is accepted");
		}
	}
}

class Matrimony {
	void acceptApplication() {
		Applicant ap = new Applicant();
		try {
			ap.acceptInput();
			ap.verify();
		}
		// we will give three chances
		catch (Exception e1) {
			
			try {
				ap.acceptInput();
				ap.verify();
			} catch (Exception e2) {
				
				try {
					ap.acceptInput();
					ap.verify();
				} catch (Exception e) {
					System.out.println("Get lost you have not utilized three chances");
				}
			}
		}
	}	

}
public class CustomExceptions {

	public static void main(String[] args) {
		Matrimony matrimony = new Matrimony();
		matrimony.acceptApplication();
	}
}



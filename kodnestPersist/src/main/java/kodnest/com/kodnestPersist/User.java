package kodnest.com.kodnestPersist;

public class User {

	String accNo;
	String name;
	String amount;
	String password;
	String email;
	String phone;
	
	public User(String accNo, String name, String amount, String password, String email, String phone) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.amount = amount;
		this.password = password;
		this.email = email;
		this.phone = phone;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}

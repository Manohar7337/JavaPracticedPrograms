
public class CricketPlayer2 extends Player2 {
	int no_of_matches;
//here we are having only one constructor because constructor
	//will not participate in inheritance
	public CricketPlayer2() {
		no_of_matches = 500;
	}

	public void display() {
		System.out.println(id + " " + name + " " + no_of_matches);
	}
}

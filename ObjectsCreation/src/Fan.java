
public class Fan {
void rotate() {
	System.out.println("fan is rotating");
}
void blow() {
	System.out.println("fan is blowing");
}
	public static void main(String[] args) {
		Fan f1=new Fan();
		Fan f2= new Fan();
		f1.rotate();
		f1.blow();
		f2.blow();
		f2.rotate();

	}

}

/*constructors will not participate in inheritance even though 
parent class constructor will get executed if we create the 
object of a child class due to constructor chaining.*/
public class Player2 {
int id;
String name;
public Player2() {
	id=10;
	name="Sehwag";
}
}

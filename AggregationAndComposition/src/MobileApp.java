
public class MobileApp {

	public static void main(String[] args) {
		Moble mobile=new Moble();
		System.out.println(mobile.os.name);
		System.out.println(mobile.os.type);
		Charger charger=new Charger("black", "mi");
		mobile.port(charger);
		mobile=null;
		//aggregate objects can be accessed if enclosing object is destroyed
		System.out.println(charger.brand);
		System.out.println(charger.color);
		//composite objects can not be accessed if enclosing objects are destroyed
		//System.out.println(mobile.os.name);
		//System.out.println(mobile.os.type);
		

	}

}

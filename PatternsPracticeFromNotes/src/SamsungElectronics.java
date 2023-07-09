//input: Samsung electronics
//output: s s g e r i 
//	      a u e c o c 
// 		  m n l t n s 
	    
       

public class SamsungElectronics {

	public static void main(String[] args) {
		String str = "Samsungelectronics";
		for (int i = 0; i < str.length(); i += 3) {// or i=i+3
			System.out.print(str.charAt(i)+" ");

		}
		System.out.println();
		for (int i = 1; i < str.length(); i += 3) {
			System.out.print(str.charAt(i)+" ");
		}
		System.out.println();
		for (int i = 2; i < str.length(); i += 3) {
			System.out.print(str.charAt(i)+" ");
		}

	}

}

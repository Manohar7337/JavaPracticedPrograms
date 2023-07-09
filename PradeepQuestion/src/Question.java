
public class Question {
public static void main(String args[]) {
	String arr[]= {"Pradeep","kodnest","Manohar"};
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		
	}
	System.out.println(arr[2]);
	String str=arr[2];
	System.out.println("==========================");
	System.out.println(str);
	for(int i=0;i<str.length();i++) {
		System.out.println(str.charAt(i));
	}
}
}

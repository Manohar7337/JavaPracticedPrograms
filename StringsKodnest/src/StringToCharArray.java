
public class StringToCharArray {

	public static void main(String[] args) {
		String str="KodNest Technologies";
		System.out.println(str);
		char arr[]=str.toCharArray();
		System.out.println(arr);//method 1 print directly
		for(int i=0;i<arr.length;i++) {//method 2 print by iterating
			System.out.print(arr[i]);
		}

	}

}

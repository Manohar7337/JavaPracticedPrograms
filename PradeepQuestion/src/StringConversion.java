
public class StringConversion {
public static void main(String[] args) {
	String str="J$SPIDE#R 123";
	char arr[]=str.toCharArray();
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>='A' && arr[i]<='Z') {
			System.out.print((int)arr[i]-64);
		}else {
			System.out.print(arr[i]);
		}
	}
	
	
}
}

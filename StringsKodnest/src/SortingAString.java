
public class SortingAString {

	public static void main(String[] args) {
		
		String str="manohar";
		char[] ch=str.toCharArray();
		char temp;
		for(int i=0;i<ch.length-1;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]>ch[j]) {
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		//printing the sorted charArray
				for(int i=0;i<ch.length;i++) {
					System.out.print(ch[i]);
				}
		
	}

}

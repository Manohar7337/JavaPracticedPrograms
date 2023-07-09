
public class SortingAStringUsingBubbleSort {

	public static void main(String[] args) {
		String str="manohar";
		char[] ch=str.toCharArray();
		char temp;
		for(int i=0;i<ch.length-1;i++) {//iterations
			for(int j=0;j<ch.length-1-i;j++) {//comparisons
				if(ch[j]>ch[j+1]) {
					temp=ch[j];
					ch[j]=ch[j+1];
					ch[j+1]=temp;
				}
			}
		}
		//printing the sorted charArray
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}
	}

}

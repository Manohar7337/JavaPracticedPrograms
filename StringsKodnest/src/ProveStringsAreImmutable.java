
public class ProveStringsAreImmutable {

	public static void main(String[] args) {
		String str="ab";
		String str2="cd";
		str.concat(str2);
		//str.concat("cd");
		System.out.println(str);
	}
//once String is created we can not concatenate or do anything
	//to that string so strings are immutable;
}

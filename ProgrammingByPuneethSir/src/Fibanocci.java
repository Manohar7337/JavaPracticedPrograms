
public class Fibanocci {
public  void fibanocci(int n) {
	int num1=0;
	int num2=1;
	
	if(n==1) {
		System.out.print(num1+" ");
	}
	else if(n==2) {
		System.out.println(num2+ " ");
	}
	else {
		System.out.print(num1+" "+num2+" ");
		for(int i=3;i<=n;i++) {
			int fib=num1+num2;
			System.out.print(fib+" ");
			num1=num2;
			num2=fib;
		}	
	}	
}
}

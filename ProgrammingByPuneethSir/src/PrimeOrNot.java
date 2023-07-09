
public class PrimeOrNot {
boolean isPrime(int num) {
	if(num==0 || num==1) {
		return false;
	}else if(num==2) {
		return true;
	}else {
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
	}
	return true;
}
}

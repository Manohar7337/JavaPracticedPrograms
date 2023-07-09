
public class HarshadOrNot {
static boolean isHarshad(int num) {
	int original=num;
	int sum=0;
	int digit=0;
	while(num!=0) {
		digit=num%10;
		sum=sum+digit;
		num=num/10;
	}
	if(original%sum==0) {
		return true;
	}
	else
		return false;
}
}

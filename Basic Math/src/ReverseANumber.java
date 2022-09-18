
public class ReverseANumber {
	public static int reverse(int num) {
		int n = num;
		int rev = 0;
		while (n!=0) {
			int digit = n%10;
			rev = rev*10+digit;
			n/=10;
		}
		return rev;
	}
}

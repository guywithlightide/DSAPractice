
public class SplitTheNumberIntoDigits {
	public static int[] split(int n) {
		int num = n;
		int nDigits = (int) Math.abs(Math.log10(n)+1);
		int [] digits = new int[nDigits];
		int k = nDigits-1;
		while(num>0) {
			int digit = num%10;
			digits[k--] = digit;
			num/=10;
		}
		return digits; // correct order
	}
}

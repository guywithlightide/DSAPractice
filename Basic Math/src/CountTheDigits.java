
public class CountTheDigits {
	public static int countTheDigits(int n) {
		int count = 0;
		int x = n;
		while (x != 0) {
			x = x/10;
			count++;
		}
		return count;
	}
	
	public static int countTheDigitsUsingLog(int n) {
		return (int) (Math.log10(n)+1);
	}
}

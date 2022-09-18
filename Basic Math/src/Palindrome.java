
public class Palindrome {
	public static boolean checkIfPalindrome(int n) {
		int y = 0;
		int x = n;
		while(x>0) {
			int digit = x%10;
			y = y*10+digit;
			x/=10;
		}
		return n == y;
	}
}

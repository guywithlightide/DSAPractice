
public class App {
	
	public static void main(String[] args) {
		System.out.println(CountTheDigits.countTheDigits(2949));
		System.out.println(CountTheDigits.countTheDigitsUsingLog(2949));
		System.out.println(ReverseANumber.reverse(2949));
		System.out.println(Palindrome.checkIfPalindrome(1221));
		System.out.println(Palindrome.checkIfPalindrome(1222));
		System.out.println(GCD.bruteForce(27, 63));
		GCD gcd = new GCD();
		System.out.println(gcd.gcdEuclideanDriver(27, 63));
	}	
}

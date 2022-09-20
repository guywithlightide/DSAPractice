import java.util.Arrays;

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
		System.out.println(ArmstrongNumber.checkIfArmstrong(154));
		System.out.println(ArmstrongNumber.checkIfArmstrong(153));
		System.out.println(Arrays.toString(SplitTheNumberIntoDigits.split(1234)));
		Divisors.optimal(1923);
		Divisors.bruteForce(98);
		System.out.println();
		System.out.println(CheckForPrime.bruteForce(79));
		System.out.println(CheckForPrime.optimal(1923));
	}	
}

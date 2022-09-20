
public class ArmstrongNumber {
	public static boolean checkIfArmstrong(int n) {
		int num = n;
		int nDigits = (int) Math.abs(Math.log10(n)+1);
		int sum = 0;
		while (num>0) {
			int digit = num%10;
			num/=10;
			sum += Math.pow(digit, nDigits);
		}
		return sum == n;
	}
}

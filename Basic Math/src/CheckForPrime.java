
public class CheckForPrime {
	public static boolean bruteForce(int n) {
		for (int i = 2; i < n; i++) {
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static boolean optimal(int n) {
		for (int i = 2; i < Math.sqrt(n); i++) {
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
}

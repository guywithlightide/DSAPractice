
public class GCD {
	public static int bruteForce(int a, int b) {
		int gcd = 1;
		for(int i=1;i<=Math.min(a, b);i++) {
			if(a%i==0 && b%i==0)
				gcd = i;
		}
		return gcd;
	}
	public int gcdEuclideanDriver(int a, int b) {
		return gcdEuclideanWorker(a, b);
	}	
	private int gcdEuclideanWorker(int a, int b) {
		if(b==0)
			return a;
		else
			return gcdEuclideanWorker(b, a%b);
	}
}

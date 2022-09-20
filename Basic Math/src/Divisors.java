
public class Divisors {
	public static void bruteForce(int n) {
		System.out.println();
		for (int i = 1; i <= n; i++) {
			if(n%i==0)
				System.out.print(i+" ");
		}
	}
	
	public static void optimal(int n) {
		System.out.println();
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if(n%i==0) {
				System.out.print(i+" ");
				if(i!=n/i) {
					System.out.print(n/i+" ");
				}
			}
		}
	}
}

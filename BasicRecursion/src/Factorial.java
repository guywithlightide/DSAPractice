
public class Factorial {
	public int factorialOf(int n) {
		return fact(n);
	}

	private int fact(int n) {
		if(n==0||n==1)
			return 1;
		else
			return n*fact(n-1);
	}
}

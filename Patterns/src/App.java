public class App {
	
	private static int n = 5;
	
	public static void main(String[] args) {
		simpleSquare();
		simplePyramid();
		numberPyramid();
		rowNumberPyramid();
		invertedPatternPyramid();
		patternPyramidTriangle();
		invertedPatternPyramidTriangle();
	}
	
	public static void simpleSquare() {
		System.out.println();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void simplePyramid() {
		System.out.println();
		for(int i=0; i<n; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void numberPyramid() {
		System.out.println();
		for(int i=0; i<n; i++) {
			for(int j=1; j<i+2; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void rowNumberPyramid() {
		System.out.println();
		int r = 1;
		for(int i=0; i<n; i++) {
			for(int j=1; j<i+2; j++) {
				System.out.print(r);
			}
			r++;
			System.out.println();
		}
	}
	
	public static void invertedPatternPyramid() {
		System.out.println();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void patternPyramidTriangle() {
		System.out.println();
		n=10;
		for(int i=0,k=0; i<n; i=i+2,k++) {
			for(int j=0; j<n/2-k; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void invertedPatternPyramidTriangle() {
		System.out.println();
		n=10;
		for(int i=0,k=n/2; i<n; i=i+2,k--) {
			for(int j=0; j<n/2-k; j++) {
				System.out.print(" ");
			}
			for(int j=n; j>0; j-=2) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

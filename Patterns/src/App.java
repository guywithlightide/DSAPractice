public class App {
	
	private static final int n = 5;
	
	public static void main(String[] args) {
		simpleSquare();
		simplePyramid();
		numberPyramid();
		rowNumberPyramid();
		invertedPatternPyramid();
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

}

package patterns;

public class starpattern {

	public static void main(String[] args) {
		pattern4(4);
	}

	private static void pattern1(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void pattern2(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void pattern3(int n) {

		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	private static void pattern4(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	private static void pattern5(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

	private static void pattern6(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

	private static void pattern7(int n) {

		for (int i = 0; i <=2* n-1; i++) {
			int star = i;

			if (i > n) {
				star = 2 * n - i;

			}
			for (int j = 0; j <= star; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

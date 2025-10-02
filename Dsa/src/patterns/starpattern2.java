package patterns;

public class starpattern2 {

	public static void main(String[] args) {
		pattern9(5);
	}

	private static void pattern1(int n) {

		int start = 1;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				start = 1;
			} else {
				start = 0;
			}

			for (int j = 0; j <= i; j++) {
				System.out.print(start);
				start = 1 - start;
			}

			System.out.println();
		}

	}

	private static void pattern2(int n) {

		int spaces = 2 * (n - 1);
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}

			System.out.println();
			spaces -= 2;
		}
	}

	private static void pattern3(int n) {

		int c = 0;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(++c + " ");
			}

			System.out.println();

		}
	}

	private static void pattern4(int n) {

		for (int i = 1; i <= n; i++) {

			for (char ch = 'A'; ch < 'A' + i; ch++) {
				System.out.print(ch + " ");
			}

			System.out.println();

		}
	}

	private static void pattern5(int n) {

		for (int i = 1; i <= n; i++) {

			for (char ch = 'A'; ch <= 'A' + (n - i - 1); ch++) {
				System.out.print(ch + " ");
			}

			System.out.println();

		}
	}

	private static void pattern6(int n) {

		for (int i = 0; i < n; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print((char) (i + 'A') + " ");
			}

			System.out.println();

		}
	}

	private static void pattern7(int n) {

		for (int i = 0; i < n; i++) {

			for (char ch = 'E'; ch <= 'E' + i; ch++) {
				System.out.print((char) (ch - i) + " ");
			}

			System.out.println();

		}
	}

	private static void pattern8(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}

			char ch = 'A';
			int breakpoint = (2 * i + 1) / 2;
			for (int j = 1; j <= 2 * i + 1; j++) {

				System.out.print(ch);
				if (j <= breakpoint)
					ch++;
				else
					ch--;
			}

			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	private static void pattern9(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (i == 0 || j == 0 || i == n - 1 || j == n - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}

public class AlphabetPatternPrinting {

	public static void main(String[] args) {
		int input;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of elements:");
		input = sc.nextInt();
		printPattern(input);
	}

	public static void printPattern(int n) {
		char val = 'A';
		for (int i = 1; i <= n; i++) {
			char cur = val;
			for (int j = 0; j < i; j++) {
				if (cur >= 'A' && cur <= 'Z') {
					System.out.print(cur + " ");
					cur += (n - j - 1);
				} else {
					cur = '*';
					System.out.print(cur + " ");

				}

			}

			val++;

			System.out.println();
		}
	}
}

	public static int Hesap(int n) {

		if (n == 1)
			return 1;

		else if (n % 2 == 0) {
			return n /= 2;
		} else {
			return n = n * 3 + 1;
		}

	}

	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);

		int sayi = klavye.nextInt();

		for (int i = 1; i <= 100; i++) {
			System.out.println(i + "\t Collatz ->\t" + Hesap(i));
		}
	}

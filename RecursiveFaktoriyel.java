	public static int Faktoriyel(int n) {

		if (n == 0)
			return 1;
		if (n == 1)
			return 1;
		if (n != 0) {
			return n * Faktoriyel(n - 1);
		} else
			return n;
	}

	public static void main(String[] args) {

		System.out.println(Faktoriyel(5));

	}

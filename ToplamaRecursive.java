	public static int ToplamaRecursive(int n) {

		if (n != 0) {
			return n + ToplamaRecursive(n - 1);
		}
		else
			return n;
	}

	public static void main(String[] args) {

		System.out.println(fibonacci(10));
	}

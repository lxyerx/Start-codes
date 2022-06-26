	public static int[] Random(int n) {
		
		Random random = new Random();

		int[] a = new int[n];

		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(10);
		}
		return a;
	}

	public static void main(String[] args) {

		int adet = 10;
		int[] dizi = Random(adet);

		System.out.println(Arrays.toString(dizi));

	}

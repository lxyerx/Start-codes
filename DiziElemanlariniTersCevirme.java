	public static void main(String[] args) {

		int[] dizi1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int boyut = dizi1.length;

		for (int i = 0; i < boyut / 2; i++) {
			int temp = dizi1[i];
			dizi1[i] = dizi1[boyut - i - 1];
			dizi1[boyut - i - 1] = temp;
		}
		System.out.println(Arrays.toString(dizi1));

	}

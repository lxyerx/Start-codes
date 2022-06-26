	public static void main(String[] args) {

		int[] dizi1 = { -55, 1, 2, 3, 4, 5, 64, 6, 72, 15, 51, 14 };

		int maks = dizi1[0];
		int min = dizi1[0];

		for (int i = 0; i < dizi1.length; i++) {
			if (dizi1[i] > maks) {
				maks = dizi1[i];
			}
			if (dizi1[i] < min) {
				min = dizi1[i];
			}

		}
		System.out.println("En buyuk sayi " + maks);
		System.out.println("En kucuk sayi " + min);

	}

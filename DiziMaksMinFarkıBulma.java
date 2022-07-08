	public static void main(String[] args) {

		int[] dizi1 = { 24, 1,6, 1, 2, 3,99, 4, 5, 66, 6, 7, 8, 9, 10 };

		int maks = dizi1[0];
		int min = dizi1[0];

		for (int i = 0; i < dizi1.length; i++) {
			if (dizi1[i] >= maks) {
				maks = dizi1[i];
			} else if (dizi1[i] <= min) {
				min = dizi1[i];
			}
		}

		System.out.println("En kucuk eleman: " + min);
		System.out.println("En buyuk eleman: " + maks);
		System.out.println("Aralarindaki fark: " + (maks - min));
	}

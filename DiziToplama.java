
	public static void main(String[] args) {

		int[] dizi1 = { 1, 2, 3, 4, 5 , 6 };

		int[] dizi2 = { 1, 2, 3, 4, 5, 6 };
		int toplam = 0;
		for (int i = 0; i < dizi1.length; i++) {
			toplam += dizi1[i] + dizi2[i];
		}
		System.out.println(toplam);

	}

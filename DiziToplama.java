
	public static void main(String[] args) {

		int[] dizi1 = { 1, 2, 3, 4, 5 , 6 };

		int[] dizi2 = { 1, 2, 3, 4, 5, 6 };
		int toplam = 0;
		for (int i = 0; i < dizi1.length; i++) {
			toplam += dizi1[i] + dizi2[i];
		}
		System.out.println(toplam);
	}
		// alttaki ise bir dizinin elemanlarını yan yana yazıp toplar

	public static void main(String[] args) {

		int[] dizi1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int toplam = 0;
		for (int i = 0; i < dizi1.length; i++) {
			System.out.print(dizi1[i]+"+");
			toplam += dizi1[i];
		}
		System.out.println(" = "+toplam);
	}

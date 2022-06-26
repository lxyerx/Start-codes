	public static boolean AsalHesap(int n) {

		if (n <= 0)
			return false;
		if (n == 1)
			return false;
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void AsalDizi(int[] dizi1) {

		int sayac = 0;

		for (int i = 1; i < dizi1.length; i++) {
			if (AsalHesap(dizi1[i]))
				sayac += 1;
		}
		System.out.println("Asal Sayisi  " + sayac);
	}

	public static void main(String[] args) {
		
		int[] dizi3 = { 2,2,2,2,2,2,2,2,2,2,2,0,1,-5,-4 };
		AsalDizi(dizi3);

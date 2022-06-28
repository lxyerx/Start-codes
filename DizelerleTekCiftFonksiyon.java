public class deneme {

	public static boolean tekmi(int n) {

		if (n % 2 == 0)
			return true;

		else
			return false;
	}

	public static void TekmiBirlesim(int[] n) {
		int sayac = 0;
		for (int i = 0; i < n.length; i++) {
			if (tekmi(n[i]))
				sayac++;
		}
		System.out.println("Cift sayisi " + sayac);

	}

	public static void main(String[] args) {

		int[] dizi1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		TekmiBirlesim(dizi1);

	}

}

	public static void main(String[] args) {
  
		int sayac = 0;
		Scanner klavye = new Scanner(System.in);
		int[] sayi = new int[6];
		for (int i = 0; i < sayi.length; i++) {
			sayi[i] = klavye.nextInt();
		}

		for (int j = 0; j < sayi.length; j++) {
			if (sayi[j] % 2 == 0) {
				sayac++;
			}
		}
		System.out.print("Cift sayısı " + sayac);
	}
	// alttaki hazır olan dizinin elemanlarını fonksiyon ile sorgular ve çiftleri yazdırır klavyeden giris yoktur

	public static boolean Tekmi(int n) {

		if (n % 2 == 0) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		int sayac = 0;
		int[] dizi1 = { 2, 4, 6, 8, 10, 12, 11, 14, 18, 1, 3, 5, 7 };

		for (int i = 0; i < dizi1.length; i++) {
			if (Tekmi(dizi1[i])) {
				sayac++;
			}
		}
		System.out.println("Cift sayisi " + sayac);
	}

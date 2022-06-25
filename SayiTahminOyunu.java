	public static void main(String[] args) {

		System.out.println("Say� tahmin oyununa hos geldiniz!");
		System.out.println("L�tfen 1-1000 aras�nda bir sayi giriniz: ");

		Scanner klavye = new Scanner(System.in);
		Random randsayi = new Random();
		int rsayi = randsayi.nextInt(1000);
		int tahmin = klavye.nextInt();
		while (rsayi != tahmin) {
			if (tahmin < 0 || tahmin > 1000) {
				System.out.println("Tahminini Yap ");
				tahmin = klavye.nextInt();

			} else if (tahmin < rsayi) {
				System.out.println("Biraz Yukarlara cik usta");
				tahmin = klavye.nextInt();
			} else {
				System.out.println("Biraz assagilara in usta");
				tahmin = klavye.nextInt();
			}

		}
		System.out.printf("Tebrikler Kazand�n�z tahmin say�n�z %d - random say� %d", tahmin, rsayi);

	}
